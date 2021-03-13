import java.util.*;

public class Persona implements Comparable<Persona>{

    private String nome;
    
    private int anni;
    
    public Persona (String nome, int anni){
        this.nome = nome;
        this.anni = anni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }

    public int getAnni() {
        return anni;
    }
    
    @Override
    public int compareTo(Persona altraPersona){
        int result = Integer.valueOf(this.anni).compareTo(Integer.valueOf(altraPersona.anni));
        if (result == 0) {
            result = this.nome.compareTo(altraPersona.nome);
        } 
        return result;
    }
    
    public String toString() {
        return nome;
    }
}