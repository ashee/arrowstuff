# Python environment setup

## Setup python 3.7.2 (conda)

```
$ conda update python
Solving environment: done

## Package Plan ##

  environment location: /Users/amitava/miniconda3

  added / updated specs:
    - python


The following packages will be downloaded:

    package                    |            build
    ---------------------------|-----------------
    sqlite-3.26.0              |       ha441bb4_0         2.3 MB
    python-3.7.2               |       haf84260_0        21.6 MB
    conda-4.6.7                |           py37_0         1.7 MB
    ca-certificates-2019.1.23  |                0         126 KB
    certifi-2018.11.29         |           py37_0         145 KB
    cryptography-2.5           |   py37ha12b0ac_0         591 KB
    openssl-1.1.1b             |       h1de35cc_1         3.4 MB
    ------------------------------------------------------------
                                           Total:        29.9 MB

The following packages will be UPDATED:

    ca-certificates: 2018.03.07-0         --> 2019.1.23-0
    certifi:         2018.8.24-py37_1     --> 2018.11.29-py37_0
    conda:           4.5.11-py37_0        --> 4.6.7-py37_0
    cryptography:    2.3.1-py37hdbc3d79_0 --> 2.5-py37ha12b0ac_0
    openssl:         1.0.2p-h1de35cc_0    --> 1.1.1b-h1de35cc_1
    python:          3.7.0-hc167b69_0     --> 3.7.2-haf84260_0
    sqlite:          3.24.0-ha441bb4_0    --> 3.26.0-ha441bb4_0

Proceed ([y]/n)? y


Downloading and Extracting Packages
sqlite-3.26.0        | 2.3 MB    | ################################################################################################# | 100%
python-3.7.2         | 21.6 MB   | ################################################################################################# | 100%
conda-4.6.7          | 1.7 MB    | ################################################################################################# | 100%
ca-certificates-2019 | 126 KB    | ################################################################################################# | 100%
certifi-2018.11.29   | 145 KB    | ################################################################################################# | 100%
cryptography-2.5     | 591 KB    | ################################################################################################# | 100%
openssl-1.1.1b       | 3.4 MB    | ################################################################################################# | 100%
Preparing transaction: done
Verifying transaction: done
Executing transaction: done
amitava:flatbuffers amitava$ conda list
# packages in environment at /Users/amitava/miniconda3:
#
# Name                    Version                   Build  Channel
asn1crypto                0.24.0                   py37_0
ca-certificates           2019.1.23                     0
certifi                   2018.11.29               py37_0
cffi                      1.11.5           py37h6174b99_1
chardet                   3.0.4                    py37_1
conda                     4.6.7                    py37_0
conda-env                 2.6.0                         1
cryptography              2.5              py37ha12b0ac_0
idna                      2.7                      py37_0
libcxx                    4.0.1                h579ed51_0
libcxxabi                 4.0.1                hebd6815_0
libedit                   3.1.20170329         hb402a30_2
libffi                    3.2.1                h475c297_4
ncurses                   6.1                  h0a44026_0
openssl                   1.1.1b               h1de35cc_1
pip                       10.0.1                   py37_0
pycosat                   0.6.3            py37h1de35cc_0
pycparser                 2.18                     py37_1
pyopenssl                 18.0.0                   py37_0
pysocks                   1.6.8                    py37_0
python                    3.7.2                haf84260_0
python.app                2                        py37_8
readline                  7.0                  h1de35cc_5
requests                  2.19.1                   py37_0
ruamel_yaml               0.15.46          py37h1de35cc_0
setuptools                40.2.0                   py37_0
six                       1.11.0                   py37_1
sqlite                    3.26.0               ha441bb4_0
tk                        8.6.8                ha441bb4_0
urllib3                   1.23                     py37_0
wheel                     0.31.1                   py37_0
xz                        5.2.4                h1de35cc_4
yaml                      0.1.7                hc338f04_2
zlib                      1.2.11               hf3cbc9b_2

$ python -V
Python 3.7.2

```

## Create conda environment
```
$ conda create -n dstack numpy scipy pandas scikit-learn notebook autopep8 pylint
Collecting package metadata: done
Solving environment: done

## Package Plan ##

  environment location: /Users/amitava/miniconda3/envs/dstack

  added / updated specs:
    - notebook
    - numpy
    - pandas
    - scikit-learn
    - scipy


The following packages will be downloaded:

    package                    |            build
    ---------------------------|-----------------
    appnope-0.1.0              |           py37_0           8 KB
    backcall-0.1.0             |           py37_0          20 KB
    bleach-3.1.0               |           py37_0         221 KB
    decorator-4.3.2            |           py37_0          17 KB
    entrypoints-0.3            |           py37_0          12 KB
    intel-openmp-2019.1        |              144         1.1 MB
    ipykernel-5.1.0            |   py37h39e3cac_0         156 KB
    ipython-7.3.0              |   py37h39e3cac_0         1.1 MB
    ipython_genutils-0.2.0     |           py37_0          39 KB
    jedi-0.13.3                |           py37_0         236 KB
    jinja2-2.10                |           py37_0         184 KB
    jsonschema-2.6.0           |           py37_0          63 KB
    jupyter_client-5.2.4       |           py37_0         127 KB
    jupyter_core-4.4.0         |           py37_0          63 KB
    libcxx-4.0.1               |       hcfea43d_1         1.2 MB
    libcxxabi-4.0.1            |       hcfea43d_1         458 KB
    libedit-3.1.20181209       |       hb402a30_0         159 KB
    libsodium-1.0.16           |       h3efe00b_0         324 KB
    markupsafe-1.1.1           |   py37h1de35cc_0          28 KB
    mistune-0.8.4              |   py37h1de35cc_0          54 KB
    mkl-2019.1                 |              144       154.4 MB
    mkl_fft-1.0.10             |   py37h5e564d8_0         153 KB
    mkl_random-1.0.2           |   py37h27c97d8_0         358 KB
    nbconvert-5.3.1            |           py37_0         406 KB
    nbformat-4.4.0             |           py37_0         141 KB
    ncurses-6.1                |       h0a44026_1         887 KB
    notebook-5.7.4             |           py37_0         7.2 MB
    numpy-1.16.2               |   py37hacdab7b_0          49 KB
    numpy-base-1.16.2          |   py37h6575580_0         4.2 MB
    pandas-0.24.1              |   py37h0a44026_0         9.9 MB
    pandoc-2.2.3.2             |                0        13.8 MB
    pandocfilters-1.4.2        |           py37_1          13 KB
    parso-0.3.4                |           py37_0         120 KB
    pexpect-4.6.0              |           py37_0          77 KB
    pickleshare-0.7.5          |           py37_0          12 KB
    pip-19.0.3                 |           py37_0         1.8 MB
    prometheus_client-0.6.0    |           py37_0          69 KB
    prompt_toolkit-2.0.9       |           py37_0         488 KB
    ptyprocess-0.6.0           |           py37_0          23 KB
    pygments-2.3.1             |           py37_0         1.3 MB
    python-dateutil-2.8.0      |           py37_0         281 KB
    pytz-2018.9                |           py37_0         268 KB
    pyzmq-18.0.0               |   py37h0a44026_0         457 KB
    scikit-learn-0.20.2        |   py37h27c97d8_0         5.2 MB
    scipy-1.2.1                |   py37h1410ff5_0        15.6 MB
    send2trash-1.5.0           |           py37_0          16 KB
    setuptools-40.8.0          |           py37_0         643 KB
    six-1.12.0                 |           py37_0          22 KB
    terminado-0.8.1            |           py37_1          21 KB
    testpath-0.4.2             |           py37_0          91 KB
    tornado-5.1.1              |   py37h1de35cc_0         661 KB
    traitlets-4.3.2            |           py37_0         133 KB
    wcwidth-0.1.7              |           py37_0          23 KB
    webencodings-0.5.1         |           py37_1          19 KB
    wheel-0.33.1               |           py37_0          39 KB
    zeromq-4.3.1               |       h0a44026_3         565 KB
    zlib-1.2.11                |       h1de35cc_3         105 KB
    ------------------------------------------------------------
                                           Total:       224.9 MB

The following NEW packages will be INSTALLED:

  appnope            pkgs/main/osx-64::appnope-0.1.0-py37_0
  backcall           pkgs/main/osx-64::backcall-0.1.0-py37_0
  blas               pkgs/main/osx-64::blas-1.0-mkl
  bleach             pkgs/main/osx-64::bleach-3.1.0-py37_0
  ca-certificates    pkgs/main/osx-64::ca-certificates-2019.1.23-0
  certifi            pkgs/main/osx-64::certifi-2018.11.29-py37_0
  decorator          pkgs/main/osx-64::decorator-4.3.2-py37_0
  entrypoints        pkgs/main/osx-64::entrypoints-0.3-py37_0
  intel-openmp       pkgs/main/osx-64::intel-openmp-2019.1-144
  ipykernel          pkgs/main/osx-64::ipykernel-5.1.0-py37h39e3cac_0
  ipython            pkgs/main/osx-64::ipython-7.3.0-py37h39e3cac_0
  ipython_genutils   pkgs/main/osx-64::ipython_genutils-0.2.0-py37_0
  jedi               pkgs/main/osx-64::jedi-0.13.3-py37_0
  jinja2             pkgs/main/osx-64::jinja2-2.10-py37_0
  jsonschema         pkgs/main/osx-64::jsonschema-2.6.0-py37_0
  jupyter_client     pkgs/main/osx-64::jupyter_client-5.2.4-py37_0
  jupyter_core       pkgs/main/osx-64::jupyter_core-4.4.0-py37_0
  libcxx             pkgs/main/osx-64::libcxx-4.0.1-hcfea43d_1
  libcxxabi          pkgs/main/osx-64::libcxxabi-4.0.1-hcfea43d_1
  libedit            pkgs/main/osx-64::libedit-3.1.20181209-hb402a30_0
  libffi             pkgs/main/osx-64::libffi-3.2.1-h475c297_4
  libgfortran        pkgs/main/osx-64::libgfortran-3.0.1-h93005f0_2
  libsodium          pkgs/main/osx-64::libsodium-1.0.16-h3efe00b_0
  markupsafe         pkgs/main/osx-64::markupsafe-1.1.1-py37h1de35cc_0
  mistune            pkgs/main/osx-64::mistune-0.8.4-py37h1de35cc_0
  mkl                pkgs/main/osx-64::mkl-2019.1-144
  mkl_fft            pkgs/main/osx-64::mkl_fft-1.0.10-py37h5e564d8_0
  mkl_random         pkgs/main/osx-64::mkl_random-1.0.2-py37h27c97d8_0
  nbconvert          pkgs/main/osx-64::nbconvert-5.3.1-py37_0
  nbformat           pkgs/main/osx-64::nbformat-4.4.0-py37_0
  ncurses            pkgs/main/osx-64::ncurses-6.1-h0a44026_1
  notebook           pkgs/main/osx-64::notebook-5.7.4-py37_0
  numpy              pkgs/main/osx-64::numpy-1.16.2-py37hacdab7b_0
  numpy-base         pkgs/main/osx-64::numpy-base-1.16.2-py37h6575580_0
  openssl            pkgs/main/osx-64::openssl-1.1.1b-h1de35cc_1
  pandas             pkgs/main/osx-64::pandas-0.24.1-py37h0a44026_0
  pandoc             pkgs/main/osx-64::pandoc-2.2.3.2-0
  pandocfilters      pkgs/main/osx-64::pandocfilters-1.4.2-py37_1
  parso              pkgs/main/osx-64::parso-0.3.4-py37_0
  pexpect            pkgs/main/osx-64::pexpect-4.6.0-py37_0
  pickleshare        pkgs/main/osx-64::pickleshare-0.7.5-py37_0
  pip                pkgs/main/osx-64::pip-19.0.3-py37_0
  prometheus_client  pkgs/main/osx-64::prometheus_client-0.6.0-py37_0
  prompt_toolkit     pkgs/main/osx-64::prompt_toolkit-2.0.9-py37_0
  ptyprocess         pkgs/main/osx-64::ptyprocess-0.6.0-py37_0
  pygments           pkgs/main/osx-64::pygments-2.3.1-py37_0
  python             pkgs/main/osx-64::python-3.7.2-haf84260_0
  python-dateutil    pkgs/main/osx-64::python-dateutil-2.8.0-py37_0
  pytz               pkgs/main/osx-64::pytz-2018.9-py37_0
  pyzmq              pkgs/main/osx-64::pyzmq-18.0.0-py37h0a44026_0
  readline           pkgs/main/osx-64::readline-7.0-h1de35cc_5
  scikit-learn       pkgs/main/osx-64::scikit-learn-0.20.2-py37h27c97d8_0
  scipy              pkgs/main/osx-64::scipy-1.2.1-py37h1410ff5_0
  send2trash         pkgs/main/osx-64::send2trash-1.5.0-py37_0
  setuptools         pkgs/main/osx-64::setuptools-40.8.0-py37_0
  six                pkgs/main/osx-64::six-1.12.0-py37_0
  sqlite             pkgs/main/osx-64::sqlite-3.26.0-ha441bb4_0
  terminado          pkgs/main/osx-64::terminado-0.8.1-py37_1
  testpath           pkgs/main/osx-64::testpath-0.4.2-py37_0
  tk                 pkgs/main/osx-64::tk-8.6.8-ha441bb4_0
  tornado            pkgs/main/osx-64::tornado-5.1.1-py37h1de35cc_0
  traitlets          pkgs/main/osx-64::traitlets-4.3.2-py37_0
  wcwidth            pkgs/main/osx-64::wcwidth-0.1.7-py37_0
  webencodings       pkgs/main/osx-64::webencodings-0.5.1-py37_1
  wheel              pkgs/main/osx-64::wheel-0.33.1-py37_0
  xz                 pkgs/main/osx-64::xz-5.2.4-h1de35cc_4
  zeromq             pkgs/main/osx-64::zeromq-4.3.1-h0a44026_3
  zlib               pkgs/main/osx-64::zlib-1.2.11-h1de35cc_3


Proceed ([y]/n)? y


Downloading and Extracting Packages
pytz-2018.9          | 268 KB    | ################################################################################################# | 100%
webencodings-0.5.1   | 19 KB     | ################################################################################################# | 100%
parso-0.3.4          | 120 KB    | ################################################################################################# | 100%
appnope-0.1.0        | 8 KB      | ################################################################################################# | 100%
pygments-2.3.1       | 1.3 MB    | ################################################################################################# | 100%
libcxx-4.0.1         | 1.2 MB    | ################################################################################################# | 100%
bleach-3.1.0         | 221 KB    | ################################################################################################# | 100%
numpy-base-1.16.2    | 4.2 MB    | ################################################################################################# | 100%
nbformat-4.4.0       | 141 KB    | ################################################################################################# | 100%
libedit-3.1.20181209 | 159 KB    | ################################################################################################# | 100%
mkl_random-1.0.2     | 358 KB    | ################################################################################################# | 100%
libsodium-1.0.16     | 324 KB    | ################################################################################################# | 100%
ncurses-6.1          | 887 KB    | ################################################################################################# | 100%
pandocfilters-1.4.2  | 13 KB     | ################################################################################################# | 100%
ipython_genutils-0.2 | 39 KB     | ################################################################################################# | 100%
setuptools-40.8.0    | 643 KB    | ################################################################################################# | 100%
jupyter_core-4.4.0   | 63 KB     | ################################################################################################# | 100%
ipython-7.3.0        | 1.1 MB    | ################################################################################################# | 100%
mkl_fft-1.0.10       | 153 KB    | ################################################################################################# | 100%
testpath-0.4.2       | 91 KB     | ################################################################################################# | 100%
traitlets-4.3.2      | 133 KB    | ################################################################################################# | 100%
pip-19.0.3           | 1.8 MB    | ################################################################################################# | 100%
terminado-0.8.1      | 21 KB     | ################################################################################################# | 100%
numpy-1.16.2         | 49 KB     | ################################################################################################# | 100%
jinja2-2.10          | 184 KB    | ################################################################################################# | 100%
decorator-4.3.2      | 17 KB     | ################################################################################################# | 100%
jedi-0.13.3          | 236 KB    | ################################################################################################# | 100%
jsonschema-2.6.0     | 63 KB     | ################################################################################################# | 100%
jupyter_client-5.2.4 | 127 KB    | ################################################################################################# | 100%
mistune-0.8.4        | 54 KB     | ################################################################################################# | 100%
pyzmq-18.0.0         | 457 KB    | ################################################################################################# | 100%
prometheus_client-0. | 69 KB     | ################################################################################################# | 100%
zlib-1.2.11          | 105 KB    | ################################################################################################# | 100%
zeromq-4.3.1         | 565 KB    | ################################################################################################# | 100%
pandas-0.24.1        | 9.9 MB    | ################################################################################################# | 100%
entrypoints-0.3      | 12 KB     | ################################################################################################# | 100%
backcall-0.1.0       | 20 KB     | ################################################################################################# | 100%
notebook-5.7.4       | 7.2 MB    | ################################################################################################# | 100%
intel-openmp-2019.1  | 1.1 MB    | ################################################################################################# | 100%
six-1.12.0           | 22 KB     | ################################################################################################# | 100%
wheel-0.33.1         | 39 KB     | ################################################################################################# | 100%
send2trash-1.5.0     | 16 KB     | ################################################################################################# | 100%
markupsafe-1.1.1     | 28 KB     | ################################################################################################# | 100%
pandoc-2.2.3.2       | 13.8 MB   | ################################################################################################# | 100%
ptyprocess-0.6.0     | 23 KB     | ################################################################################################# | 100%
nbconvert-5.3.1      | 406 KB    | ################################################################################################# | 100%
prompt_toolkit-2.0.9 | 488 KB    | ################################################################################################# | 100%
tornado-5.1.1        | 661 KB    | ################################################################################################# | 100%
scikit-learn-0.20.2  | 5.2 MB    | ################################################################################################# | 100%
wcwidth-0.1.7        | 23 KB     | ################################################################################################# | 100%
mkl-2019.1           | 154.4 MB  | ################################################################################################# | 100%
pickleshare-0.7.5    | 12 KB     | ################################################################################################# | 100%
scipy-1.2.1          | 15.6 MB   | ################################################################################################# | 100%
pexpect-4.6.0        | 77 KB     | ################################################################################################# | 100%
ipykernel-5.1.0      | 156 KB    | ################################################################################################# | 100%
libcxxabi-4.0.1      | 458 KB    | ################################################################################################# | 100%
python-dateutil-2.8. | 281 KB    | ################################################################################################# | 100%
Preparing transaction: done
Verifying transaction: done
Executing transaction: done
#
# To activate this environment, use:
# > source activate dstack
#
# To deactivate an active environment, use:
# > source deactivate
#

```

## Install pyarrow

```
$ conda install -c conda-forge pyarrow -n dstack
Collecting package metadata: done
Solving environment: done

## Package Plan ##

  environment location: /Users/amitava/miniconda3/envs/dstack

  added / updated specs:
    - pyarrow


The following packages will be downloaded:

    package                    |            build
    ---------------------------|-----------------
    arrow-cpp-0.11.1           |   py37h3bd774a_1         4.9 MB  conda-forge
    boost-cpp-1.68.0           |    h6f8c590_1000        18.6 MB  conda-forge
    bzip2-1.0.6                |    h1de35cc_1002         148 KB  conda-forge
    ca-certificates-2019.3.9   |       hecc5488_0         146 KB  conda-forge
    certifi-2019.3.9           |           py37_0         149 KB  conda-forge
    icu-58.2                   |    h0a44026_1000        22.3 MB  conda-forge
    libevent-2.1.8             |       hc2b1221_0         1.2 MB  conda-forge
    openssl-1.1.1b             |       h1de35cc_1         3.5 MB  conda-forge
    parquet-cpp-1.5.1          |                3           3 KB  conda-forge
    pyarrow-0.11.1             |py37hf9e6f3b_1002         1.8 MB  conda-forge
    thrift-cpp-0.11.0          |       hd79cdb6_3         2.1 MB
    ------------------------------------------------------------
                                           Total:        54.8 MB

The following NEW packages will be INSTALLED:

  arrow-cpp          conda-forge/osx-64::arrow-cpp-0.11.1-py37h3bd774a_1
  boost-cpp          conda-forge/osx-64::boost-cpp-1.68.0-h6f8c590_1000
  bzip2              conda-forge/osx-64::bzip2-1.0.6-h1de35cc_1002
  icu                conda-forge/osx-64::icu-58.2-h0a44026_1000
  libevent           conda-forge/osx-64::libevent-2.1.8-hc2b1221_0
  parquet-cpp        conda-forge/noarch::parquet-cpp-1.5.1-3
  pyarrow            conda-forge/osx-64::pyarrow-0.11.1-py37hf9e6f3b_1002
  thrift-cpp         pkgs/main/osx-64::thrift-cpp-0.11.0-hd79cdb6_3

The following packages will be UPDATED:

  ca-certificates    pkgs/main::ca-certificates-2019.1.23-0 --> conda-forge::ca-certificates-2019.3.9-hecc5488_0
  certifi              pkgs/main::certifi-2018.11.29-py37_0 --> conda-forge::certifi-2019.3.9-py37_0

The following packages will be SUPERSEDED by a higher-priority channel:

  openssl                                         pkgs/main --> conda-forge


Proceed ([y]/n)? y


Downloading and Extracting Packages
thrift-cpp-0.11.0    | 2.1 MB    | ################################################################################################# | 100%
libevent-2.1.8       | 1.2 MB    | ################################################################################################# | 100%
bzip2-1.0.6          | 148 KB    | ################################################################################################# | 100%
parquet-cpp-1.5.1    | 3 KB      | ################################################################################################# | 100%
icu-58.2             | 22.3 MB   | ################################################################################################# | 100%
openssl-1.1.1b       | 3.5 MB    | ################################################################################################# | 100%
ca-certificates-2019 | 146 KB    | ################################################################################################# | 100%
arrow-cpp-0.11.1     | 4.9 MB    | ################################################################################################# | 100%
boost-cpp-1.68.0     | 18.6 MB   | ################################################################################################# | 100%
pyarrow-0.11.1       | 1.8 MB    | ################################################################################################# | 100%
certifi-2019.3.9     | 149 KB    | ################################################################################################# | 100%
Preparing transaction: done
Verifying transaction: done
Executing transaction: done

```

## active environment

```
$ conda init bash
no change     /Users/amitava/miniconda3/condabin/conda
no change     /Users/amitava/miniconda3/bin/conda
no change     /Users/amitava/miniconda3/bin/conda-env
no change     /Users/amitava/miniconda3/bin/activate
no change     /Users/amitava/miniconda3/bin/deactivate
no change     /Users/amitava/miniconda3/etc/profile.d/conda.sh
no change     /Users/amitava/miniconda3/etc/fish/conf.d/conda.fish
no change     /Users/amitava/miniconda3/shell/condabin/Conda.psm1
no change     /Users/amitava/miniconda3/shell/condabin/conda-hook.ps1
no change     /Users/amitava/miniconda3/lib/python3.7/site-packages/xonsh/conda.xsh
no change     /Users/amitava/miniconda3/etc/profile.d/conda.csh
modified      /Users/amitava/.bash_profile

==> For changes to take effect, close and re-open your current shell. <==

amitava:pyarrow amitava$ exec $BASH -i -l
pyenv-virtualenv: version `default' is already activated
(node:60428) [DEP0005] DeprecationWarning: Buffer() is deprecated due to security and usability issues. Please use the Buffer.alloc(), Buffer.allocUnsafe(), or Buffer.from() methods instead.
(base) amitava:pyarrow amitava$ conda activate dstack
(dstack) amitava:pyarrow amitava$
```