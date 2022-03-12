package BatallaNaval;

import java.util.Objects;

public class ModelBatallaNaval {

	private int flag;
	private String orientacionBarco;
	private int cantidadPortavion, cantidadSubmarino, cantidadDestructor, cantidadFragata;

	public ModelBatallaNaval()
	{
		flag = 0;
		orientacionBarco = "";
		cantidadPortavion = 1;
		cantidadSubmarino = 2;
		cantidadDestructor = 3;
		cantidadFragata = 4;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getOrientacionBarco() {
		return orientacionBarco;
	}

	public void setOrientacionBarco(String orientacionBarco) {
		this.orientacionBarco = orientacionBarco;
	}

	public int getCantidadPortavion() {
		return cantidadPortavion;
	}

	public void setCantidadPortavion(int cantidadPortavion) {
		this.cantidadPortavion = cantidadPortavion;
	}

	public int getCantidadSubmarino() {
		return cantidadSubmarino;
	}

	public void setCantidadSubmarino(int cantidadSubmarino) {
		this.cantidadSubmarino = cantidadSubmarino;
	}

	public int getCantidadDestructor() {
		return cantidadDestructor;
	}

	public void setCantidadDestructor(int cantidadDestructor) {
		this.cantidadDestructor = cantidadDestructor;
	}

	public int getCantidadFragata() {
		return cantidadFragata;
	}

	public void setCantidadFragata(int cantidadFragata) {
		this.cantidadFragata = cantidadFragata;
	}

	public void posicion(int num1, int num2, int num3, int num4)
	{
		if(num1 == num2)
		{
			orientacionBarco = "horizontal";
		}
		else if(num3 == num4)
		{
			orientacionBarco = "vertical";
		}
	}
}
