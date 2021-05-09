public record Contribuente (String codiceFiscale, String nome, String cognome) {
    @Override
    public String nome() {
        return nome.toUpperCase();
    }
    
    @Override
    public String cognome() {
        return cognome.toUpperCase();
    }
    
    @Override
    public boolean equals(Object altroOggetto) {
        if (!(altroOggetto instanceof Contribuente altroContribuente)) {
            return false;
        }
        return this.codiceFiscale == altroContribuente.codiceFiscale;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codiceFiscale == null) ? 0 : codiceFiscale.hashCode());
        return result;
    }
}