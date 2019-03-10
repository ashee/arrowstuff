package org.ashee;

/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Run this file with the `java_sample.sh` script.

import MyGame.Sample.*;
import com.google.flatbuffers.FlatBufferBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


class SampleBinary {

    private FlatBufferBuilder builder = new FlatBufferBuilder(1024);

    public ByteBuffer createMonster() {
        // Create some weapons for our Monster ('Sword' and 'Axe').
        int weaponOneName = builder.createString("Sword");
        short weaponOneDamage = 3;
        int weaponTwoName = builder.createString("Axe");
        short weaponTwoDamage = 5;

        // Use the `createWeapon()` helper function to create the weapons, since we set
        // every field.
        int[] weaps = new int[2];
        weaps[0] = Weapon.createWeapon(builder, weaponOneName, weaponOneDamage);
        weaps[1] = Weapon.createWeapon(builder, weaponTwoName, weaponTwoDamage);

        // Serialize the FlatBuffer data.
        int name = builder.createString("Orc");
        byte[] treasure = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int inv = Monster.createInventoryVector(builder, treasure);
        int weapons = Monster.createWeaponsVector(builder, weaps);
        int pos = Vec3.createVec3(builder, 1.0f, 2.0f, 3.0f);

        Monster.startMonster(builder);
        Monster.addPos(builder, pos);
        Monster.addName(builder, name);
        Monster.addColor(builder, Color.Red);
        Monster.addHp(builder, (short) 300);
        Monster.addInventory(builder, inv);
        Monster.addWeapons(builder, weapons);
        Monster.addEquippedType(builder, Equipment.Weapon);
        Monster.addEquipped(builder, weaps[1]);
        int orc = Monster.endMonster(builder);

        builder.finish(orc); // You could also call `Monster.finishMonsterBuffer(builder, orc);`.

        return builder.dataBuffer();
    }

    public Monster loadMonster(ByteBuffer buf) {
        // Get access to the root:
        Monster monster = Monster.getRootAsMonster(buf);

        // Note: We did not set the `mana` field explicitly, so we get back the default
        // value.
        assert monster.mana() == (short) 150;
        assert monster.hp() == (short) 300;
        assert monster.name().equals("Orc");
        assert monster.color() == Color.Red;
        assert monster.pos().x() == 1.0f;
        assert monster.pos().y() == 2.0f;
        assert monster.pos().z() == 3.0f;

        // Get and test the `inventory` FlatBuffer `vector`.
        for (int i = 0; i < monster.inventoryLength(); i++) {
            assert monster.inventory(i) == (byte) i;
        }

        // Get and test the `weapons` FlatBuffer `vector` of `table`s.
        String[] expectedWeaponNames = {"Sword", "Axe"};
        int[] expectedWeaponDamages = {3, 5};
        for (int i = 0; i < monster.weaponsLength(); i++) {
            assert monster.weapons(i).name().equals(expectedWeaponNames[i]);
            assert monster.weapons(i).damage() == expectedWeaponDamages[i];
        }

        // Get and test the `equipped` FlatBuffer `union`.
        assert monster.equippedType() == Equipment.Weapon;
        Weapon equipped = (Weapon) monster.equipped(new Weapon());
        assert equipped.name().equals("Axe");
        assert equipped.damage() == 5;

        return monster;
    }


    // Example how to use FlatBuffers to create and read binary buffers.
    public static void main(String[] args) throws Exception {
        final String path = "monster.bin";

        SampleBinary sb = new SampleBinary();
        ByteBuffer buf = sb.createMonster();
        save(buf, path);

        buf = load(path);
        Monster monster = sb.loadMonster(buf);

        System.out.println("The FlatBuffer was successfully created and verified!");
    }

    public static void save(ByteBuffer buffer, String path) throws Exception {
        try (FileChannel fc = new FileOutputStream(path).getChannel()) {
            fc.write(buffer);
        }
    }

    public static ByteBuffer load(String path) throws IOException {
        File f = new File(path);
        int len = (int) f.length();
        ByteBuffer buffer = ByteBuffer.allocate(len);
        try (FileChannel fc = new FileInputStream(path).getChannel()) {
            fc.read(buffer, len);
        }
        buffer.rewind();
        return buffer;
    }
}