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

## How to sign with PGP/GPG

In order to use automatically your signature at the release pipeline you need to have 3 things:

- Already existing signature or generate new one
- Retrieve signature private key
- Add signature data to the pipeline secrets

### Generate new signature

> **Note**
> Skip this part if you already have PGP/GPG signature and you can use it

1. **Install GnuPG tool**  
   On `Windows` you can install [Gpg4win](https://gpg4win.org) tool  
   On `MacOS` you can use homebrew to install it: `brew install gnupg`  
   On `Linux` if it's not installed by default just use any available package manager, e.g. on Ubuntu it is: `sudo apt-get install gnupg`
2. **Generate signature**  
   Execute command `gpg --gen-key` and fill all required parameters, it will also ask for secret passphrase, you will need it in the next steps
3. **Get signature public key**  
   Execute command `gpg --list-keys` and copy long string containing numbers and letters, that's your signature public key
4. **Distribute signature public key**  
   Execute command `gpg --keyserver hkp://pgp.mit.edu --send-keys INSERT_YOUR_KEY`

### Retrieve signature private key

> **Note**
> You need to have access to computer, where your signature was generated

To be able to use your private signature key in release pipeline it needs to be ascii-armored, to do it execute command `gpg --armor --export-secret-keys`

### Add signature data to the pipeline secrets
