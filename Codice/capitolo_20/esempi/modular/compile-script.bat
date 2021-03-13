javac --module-path %PATH_TO_FX% -d mods/modulefx src/*.java
mkdir mods\modulefx\res
xcopy res mods\modulefx\res /s /e /h
pause;
