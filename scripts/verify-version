#!/bin/bash

echo "Verifying version '${PROJECT_VERSION}'"

if [[ "$TRAVIS_BRANCH" == "$PROD_BRANCH" ]]; then
  if [[ "$PROJECT_VERSION" == *-SNAPSHOT ]]; then
    echo "Version format '${PROJECT_VERSION}' is not valid for production. Most probably SNAPSHOT prefix wasn't removed from version number."
    exit 1
  fi
  tag=$(./gradlew -q printVersionTag)
  (git tag -l | grep -q "$tag") && {
    echo "Tag '${tag}' already exists in repository. Most probably this version was already deployed to production."
    exit 1
  }
fi

exit 0