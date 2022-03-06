package BatallaNaval;

import javax.swing.*;

public class Casilla extends JButton {

	private int fila;
	private int columna;
	private String tipo;

	public Casilla(int fila, int columna, String tipo)
	{
		this.fila = fila;
		this.columna = columna;
		this.tipo = tipo;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}