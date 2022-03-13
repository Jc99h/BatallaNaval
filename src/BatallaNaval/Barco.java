package BatallaNaval;

import java.util.ArrayList;

public class Barco {

    private String tipoBarco, orientacionBarco;
    private int casillas;
    public ArrayList<Casilla> casillasDelBarco;

    public Barco(String tipoBarco, int casillas) {
        this.tipoBarco = tipoBarco;
        this.casillas = casillas;

        casillasDelBarco = new ArrayList<>();
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public int getCasillas() {
        return casillas;
    }

    public void setCasillas(int casillas) {
        this.casillas = casillas;
    }

    public String getOrientacionBarco() {
        return orientacionBarco;
    }

    public void setOrientacionBarco(String orientacionBarco) {
        this.orientacionBarco = orientacionBarco;
    }

    public void posicion(int num1, int num2, int num3, int num4) {
        if (num1 == num2) {
            orientacionBarco = "horizontal";
        } else if (num3 == num4) {
            orientacionBarco = "vertical";
        }
    }
}
