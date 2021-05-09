module it.nuovojava.certs {
    requires it.nuovojava.spi;
    //exports it.nuovojava.certs to it.nuovojava.factory;
    provides it.nuovojava.spi.Document with it.nuovojava.certs.CertFactory;
}