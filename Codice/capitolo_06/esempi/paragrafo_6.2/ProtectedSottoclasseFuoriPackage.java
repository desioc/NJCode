package com.cdsc;

import com.cdsc.test.*;

public class ProtectedSottoclasseFuoriPackage extends ProtectedInClasse {
    public void metodoCheUsaProtected() {
        metodoProtected();
        System.out.println(variabileProtected);
    }
}
