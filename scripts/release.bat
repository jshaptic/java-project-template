cd %~dp0
git checkout production
git merge master --ff-only
git push
git checkout master
pause