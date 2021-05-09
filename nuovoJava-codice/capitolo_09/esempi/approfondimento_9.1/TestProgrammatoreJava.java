package com.claudiodesio.appf;
import static com.claudiodesio.appf.TigerNewFeature.*;

public class TestProgrammatoreJava {
    public static void main(String args[]) {
//        ProgrammatoreJava pro = new ProgrammatoreJava("Claudio",
//          TigerNewFeature.VARARGS, TigerNewFeature.FOREACH, 
//          TigerNewFeature.ENUMERATIONS, TigerNewFeature.GENERICS);
        ProgrammatoreJava pro = new ProgrammatoreJava("Claudio", VARARGS, FOREACH,
            ENUMERATIONS, GENERICS);
    }
}