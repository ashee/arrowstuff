#!/usr/bin/env python3 

import pyarrow as pa

data = b'abcdefghijklmnopqrstuvwxyz'

buf = pa.py_buffer(data)
buf
buf.size
memoryview(buf)
buf.to_pybytes()
pa.total_allocated_bytes()
buf = pa.allocate_buffer(1024, resizable=True)
buf.resize(2048)
buf = None
buf = memoryview(b"some data")
# stream = pa.read_stream(buf)
