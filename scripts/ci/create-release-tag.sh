#!/bin/bash

if [[ "$TRAVIS_BRANCH" == "$PROD_BRANCH" ]]; then
  if [[ -z "$TRAVIS_TAG" ]]; then
    export TRAVIS_TAG=$(./gradlew -q printVersionTag)
    git tag "$TRAVIS_TAG" -a -m "Generated tag from TravisCI"
  else
    echo "Skip tag creation, it was already created"
  fi
fi