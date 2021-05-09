module it.nuovojava.factory {
    requires it.nuovojava.spi;
    exports it.nuovojava.factory to it.nuovojava.handlers;
    uses it.nuovojava.spi.Document;
}