package objetos;

public class Start {

	public static void main(String[] args) {

		
		
		
		Termometro oviedo = new Termometro("Oviedo",10.0f);
		Termometro gijon = new Termometro("Gijón",15.0f);
		Termometro aviles = new Termometro("Avilés",12.0f);
		
		gijon.setLocalidad("Gijón - playa");
		
		
		float temperaturaMedia = oviedo.getTemperatura() 
				+ gijon.getTemperatura() 
				+ aviles.getTemperatura();
		
		temperaturaMedia /= 3;
		
		System.out.println("la media de asturias es de "+temperaturaMedia);

	}

}
