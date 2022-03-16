package BatallaNaval;

import javax.swing.*;

/**
 * This class is used for ...
 *
 * @author Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @author Danny lopez 1941453-2711  danny.cardenas@correounivalle.edu.co
 * @version @version v.1.0.0 date:06/03/2022
 */
public class Casilla extends JButton {

    private int fila;
    private int columna;
    private String tipo;

    public Casilla(int fila, int columna, String tipo) {
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }

    public void setValoresDeCasilla(int fila, int columna, String tipo) {
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