module negozio.vendita {
    exports negozio.vendita.articoli;
    exports negozio.vendita.funzionidisponibili;
    //exports negozio.vendita.algoritmiinterni;
    requires transitive negozio.fatturazione;
}
