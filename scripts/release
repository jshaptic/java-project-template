#!/bin/bash

# exit immediately on error
set -e

# navigate to project root 
cd $(dirname "$0")/..

# make sure we're on the master branch.
(git branch | grep -q '* master') || {
  echo "Release only from the master branch!"
  exit 1
}

# release to production branch
git checkout production
git merge master --ff-only
git push
git checkout master