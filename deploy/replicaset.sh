#!/bin/bash

mkdir -p /tmp/mongodb/member1 /tmp/mongodb/member2 /tmp/mongodb/member3
cd /opt/mongodb

bin/mongod --port 30001 --dbpath /tmp/mongodb/member1 --logpath /tmp/mongodb/member1/mongo.log --fork --replSet myReplicaSet --smallfiles --oplogSize 128
bin/mongod --port 30002 --dbpath /tmp/mongodb/member2 --logpath /tmp/mongodb/member2/mongo.log --fork --replSet myReplicaSet --smallfiles --oplogSize 128
bin/mongod --port 30003 --dbpath /tmp/mongodb/member3 --logpath /tmp/mongodb/member3/mongo.log --fork --replSet myReplicaSet --smallfiles --oplogSize 128

cd ~/mongodb-src/
/opt/mongodb/bin/mongo --port 30001 < data/replica-set-config.js
