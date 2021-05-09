package com.cdsc;

import com.cdsc.test.*;

public class ProtectedClasseFuoriPackage extends ProtectedInClasse {
    public void metodoCheUsaProtected() {
        ProtectedClasseFuoriPackage protectedInClasse = new ProtectedClasseFuoriPackage();
        protectedInClasse.metodoProtected();
        System.out.println(protectedInClasse.variabileProtected);
    }
}