REM modificare il module-path facendolo puntare alla cartella jmods della vostra installazione di JDK:

jlink --module-path "C:/Program Files/Java/jdk-9.0.1/jmods" --add-modules java.base,java.desktop --output javabasedeskrt
pause;
