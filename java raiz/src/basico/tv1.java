package basico;

public class tv1 {
	public static void main(String[] args) {
		
		TV televisao1 =new TV();
		
		System.out.println("Est� Televis�o � da marca" + televisao1.frabricante + " A Televis�o est�" + (televisao1.ligado == true?
				"ligada" : "desligada") + ". O Volume � " + televisao1.volume);
		
		
		televisao1.ligar();
		televisao1.aumentaVolume();
		televisao1.aumentaVolume();
		
		System.out.println("Est� Televis�o � da marca" + televisao1.frabricante + " A Televis�o est�" + (televisao1.ligado == true?
				"ligada" : "desligada") + ". O Volume � " + televisao1.volume);
		
		
		
		
	}
}
