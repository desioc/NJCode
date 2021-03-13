package com.cdsc;

import com.cdsc.test.*;

public class PublicClasseFuoriPackage {
    public void metodoCheUsaPublic() {
        var publicInClasse = new PublicInClasse();
        publicInClasse.metodoPublic();
        System.out.println(publicInClasse.variabilePublic);
    }
}