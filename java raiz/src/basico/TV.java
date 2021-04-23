package basico;


public class TV {

	
	String frabricante = "Sony";
	int polegadas =22;
	int volume = 0;
	int canal = 1;
	boolean ligado = false;
	
	public void aumentaVolume() {
	    if(volume >= 10) {
	    	return;
	    	
	    }
		
		volume ++;
		
	}
	
	public void diminuirVolume() {
		if(volume <=0) {
			
		}
		
		volume --;
		
	
	}
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
}
