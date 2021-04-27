package comunicacion;

public class Alfabeto extends Pictograma {
	

	private String[] letras;
	private String interpretacion;
	

	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String concatenar = "";

		for(String letter: this.letras) {
			if(letter.equals("Z")) {
				concatenar += letter;
			}else {
				concatenar += letter + ", ";
			}
		}

		return concatenar;
	}


	
	
	
	
	
	public String[] getLetras() {
		return letras;
	}


	public void setLetras(String[] letras) {
		this.letras = letras;
	}


	public String getInterpretacion() {
		return interpretacion;
	}


	public void setInterpetracion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	
}
