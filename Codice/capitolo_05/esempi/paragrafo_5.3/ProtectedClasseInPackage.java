package com.cdsc.test;

public class ProtectedClasseInPackage {
    public void metodoCheUsaProtected() {
        var protectedInClasse = new ProtectedInClasse();
        protectedInClasse.metodoProtected();
        System.out.println(protectedInClasse.variabileProtected);
    }
}