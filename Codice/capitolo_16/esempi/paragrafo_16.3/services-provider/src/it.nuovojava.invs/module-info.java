module it.nuovojava.invs {
    requires it.nuovojava.spi;
    //exports it.nuovojava.invs to it.nuovojava.factory;
    provides it.nuovojava.spi.Document with it.nuovojava.invs.Invoice;
}