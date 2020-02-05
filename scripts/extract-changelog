#!/bin/bash

if [[ "$TRAVIS_BRANCH" == "$PROD_BRANCH" ]]; then
  if [[ ! -z "$PROJECT_VERSION" ]]; then
    if [[ -z "$CHANGELOG" ]]; then
      CHANGELOG=$(awk '/[0-9.]+/{if(flag)exit; flag=1} flag' ./CHANGELOG.md)
	  CHANGELOG_TEST=$(printf "$CHANGELOG" | grep "$PROJECT_VERSION")
      if [[ -z "$CHANGELOG_TEST" ]]; then
        echo "Version '${PROJECT_VERSION}' isn't the first one or doesn't exists at all in CHANGELOG.md file!"
        exit 1
      fi
      CHANGELOG=$(printf "$CHANGELOG" | sed -n '1d;p')
      printf "$CHANGELOG"
    fi
  else
    echo "PROJECT_VERSION variable is not defined!"
    exit 1
  fi
fi