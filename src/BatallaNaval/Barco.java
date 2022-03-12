package BatallaNaval;

public class Barco {

	private String tipoBarco;
	private int vida;

	public Barco(String tipoBarco, int vida)
	{
		this.tipoBarco = tipoBarco;
		this.vida = vida;
	}

	public String getTipoBarco() {
		return tipoBarco;
	}

	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}
