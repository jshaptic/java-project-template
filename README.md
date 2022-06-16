# java-project-template

[![Maintainability](https://api.codeclimate.com/v1/badges/08180ff0281877bd59a3/maintainability)](https://codeclimate.com/github/jshaptic/java-project-template/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/08180ff0281877bd59a3/test_coverage)](https://codeclimate.com/github/jshaptic/java-project-template/test_coverage)
![Maven Central](https://img.shields.io/maven-central/v/com.github.jshaptic/java-project-template)
[![javadoc](https://javadoc.io/badge2/com.github.jshaptic/java-project-template/javadoc.svg)](https://javadoc.io/doc/com.github.jshaptic/java-project-template)
[![MIT License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Required steps after using this template:

1. Replace "java-project-name" with real project name
2. Rename src/main/\* and src/test/\* folders with real project name
3. Setup Code Climate
4. Setup following repository secrets:
   - CC_TEST_REPORTER_ID - Code Climate ID, it can be found in Code Climate > Repo Settings > Test Coverage
   - GPG_KEY - GPG key used for package signing
   - GPG_PASSWORD - GPG password used for package signing, it can obtained by executing followings command:
     `gpg --armor --export-secret-keys | awk 'NR == 1 { print "GPG_SIGNING_KEY=" } 1' ORS='\\n'`
   - MAVEN_USERNAME - username of the Sonatype Nexus Repository
   - MAVEN_PASSWORD - password of the Sonatype Nexus Repository
5. Setup main branch protection rules
