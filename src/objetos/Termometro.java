package objetos;

public class Termometro {

	private float temperatura;
	private float temperaturaMaxima;
	private float temperaturaMinima;
	private String localidad;
	private boolean celsius;
	
	
	// constructor por defecto
	public Termometro() {
		
		temperatura = 10;
		temperaturaMaxima = -1000;
		temperaturaMinima = 1000;
		localidad = "------";
		celsius = true;
	}
	
	
	
	
	// constructor parametrizado
	public Termometro(String localidad, float temperatura) {
		
		this.temperatura = temperatura;
		this.localidad = localidad;
		celsius = true;
		temperaturaMaxima = temperatura;
		temperaturaMinima = temperatura;
	}
	
	
	
	
	public float getTemperatura() {
		
		return temperatura;
		
	}
	
	
	public String getLocalidad() {
		
		return localidad;
	}
	
	
	
	
	
	public void setTemperatura(float unaTemperatura) {
		
		temperatura = unaTemperatura;
		
		if(unaTemperatura>temperaturaMaxima) {
			temperaturaMaxima = unaTemperatura;
		}

		if(unaTemperatura<temperaturaMinima) {
			temperaturaMinima = unaTemperatura;
		}

	}
	
	
	
	
	
	
	public void setLocalidad(String localidad) {
		
		this.localidad = localidad;
	}
	
	
	
	
	
	public void setCelsius(boolean celsiusitos) {
	
		// me mandan cambiarme a algo en lo que no estoy
		if(celsius!=celsiusitos) {
		
			if(celsiusitos) {
				
				// actualizo la temperatura a celsius
				temperatura = (temperatura-32)*5/9;
			}
			else  {
				
				// tengo que cambiar a farenheit
				temperatura = (temperatura*9/5)+32;
			}
			celsius = celsiusitos;
			
		}
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
}
