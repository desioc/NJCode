package com.claudiodesio.appf;
import java.util.*;

public class ProgrammatoreJava {

    private String nome;
    
    private List<TigerNewFeature> aggiornamenti;
    //...  
    
    public ProgrammatoreJava(String nome, TigerNewFeature... features) {
        this.nome = nome;
        aggiornamenti = new ArrayList<>();
        aggiungiAggiornamenti(features);
    }
    
    public void aggiungiAggiornamenti(TigerNewFeature... features) {
        for (TigerNewFeature aggiornamento : features) {
            aggiornamenti.add(aggiornamento);
        }
    }
}