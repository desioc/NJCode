package it.nuovojava.certs;

import it.nuovojava.spi.Document;

class Certificate implements Document {

	private String text;
	
    public Certificate(String text){
		this.text = text;
	}
			
    @Override
    public void addTrademark(String trademark) {
        System.out.println("Aggiunto trademark ad un certificato!");
    }

    @Override
    public String getType() {
        return "C";
    }
	
	public String toString(){
		return text;		
	}

}
