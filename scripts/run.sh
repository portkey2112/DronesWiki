#!/bin/sh
##!/usr/bin/env bash

export DB_HOST_URL=drone-mysql
export NAMESPACE=default
export DB_PORT=3306
export LISTENER_TIMEOUT=100
export TAG=v1
export JARFILE=drones-spring-0.0.1-SNAPSHOT.jar

exec ./wait-for-it.sh -h ${DB_HOST_URL}.${NAMESPACE}.svc.cluster.local -p ${DB_PORT} -t ${LISTENER_TIMEOUT} && java -jar ${JARFILE}


