# Copyright 2019 The Feast Authors
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from setuptools import find_packages, setup

NAME = "feast"
DESCRIPTION = "Python SDK for Feast"
URL = "https://github.com/feast-dev/feast"
AUTHOR = "Feast"
REQUIRES_PYTHON = ">=3.6.0"

REQUIRED = [
    "Click==7.*",
    "google-api-core==1.20.*",
    "google-auth<2.0dev,>=1.14.0",
    "google-cloud-bigquery==1.18.*",
    "google-cloud-storage==1.20.*",
    "google-cloud-core==1.0.*",
    "googleapis-common-protos==1.*",
    "google-cloud-bigquery-storage==0.7.*",
    "grpcio==1.*",
    "pandas~=1.0.0",
    "pandavro==1.5.*",
    "protobuf>=3.10",
    "PyYAML==5.1.*",
    "fastavro>=0.22.11,<0.23",
    "kafka-python==1.*",
    "tabulate==0.8.*",
    "toml==0.10.*",
    "tqdm==4.*",
    "pyarrow==1.0.0",
    "numpy",
    "google",
    "confluent_kafka",
]

setup(
    name=NAME,
    version="SUBST_VERSION",
    author=AUTHOR,
    description=DESCRIPTION,
    long_description=LONG_DESCRIPTION,
    long_description_content_type="text/markdown",
    python_requires=REQUIRES_PYTHON,
    url=URL,
    packages=find_packages(exclude=("tests",)),
    install_requires=REQUIRED,
    # https://stackoverflow.com/questions/28509965/setuptools-development-requirements
    # Install dev requirements with: pip install -e .[dev]
    extras_require={"dev": ["mypy-protobuf==1.*", "grpcio-testing==1.*"]},
    include_package_data=True,
    license="Apache",
    classifiers=[
        # Trove classifiers
        # Full list: https://pypi.python.org/pypi?%3Aaction=list_classifiers
        "License :: OSI Approved :: Apache Software License",
        "Programming Language :: Python",
        "Programming Language :: Python :: 3",
        "Programming Language :: Python :: 3.8"
    ]
)