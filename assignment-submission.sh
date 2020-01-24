#!/usr/bin/env bash

STRUTS_APP_URL=struts-appreciative-hartebeest.apps.evans.pal.pivotal.io

cd ~/workspace/assignment-submission
./gradlew replatformingStruts -PstrutsAppUrl=https://${STRUTS_APP_URL}