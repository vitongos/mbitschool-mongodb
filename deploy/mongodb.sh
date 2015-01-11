#!/bin/bash

cd ~/Downloads
wget http://fastdl.mongodb.org/linux/mongodb-linux-x86_64-2.6.6.tgz
tar zxf mongodb-linux-x86_64-2.6.6.tgz
sudo mv mongodb-linux-x86_64-2.6.6/ /opt/mongodb/
mkdir /opt/mongodb/logs
touch /opt/mongodb/logs/mongo.log
mkdir -p /opt/mongodb/data/db
sudo bin/mongod --fork --logpath /opt/mongodb/logs/mongo.log -dbpath /opt/mongodb/data/db





