jlink --module-path %PATH_TO_FX%;mods --add-modules=modulefx --launcher launch-modulefx=modulefx/com.claudiodesio.javafx.FirstJFXExample --output modulefx-rt
mkdir modulefx-rt\bin\res
xcopy res modulefx-rt\bin\res /s /e /h
pause;