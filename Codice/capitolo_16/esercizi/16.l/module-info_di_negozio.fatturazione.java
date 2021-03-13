module negozio.fatturazione {
    exports negozio.fatturazione.articoli;
    exports negozio.fatturazione.funzionidisponibili;
    exports negozio.fatturazione.algoritmiinterni;
    opens negozio.fatturazione.algoritmiinterni to negozio.interfacciagrafica;
}