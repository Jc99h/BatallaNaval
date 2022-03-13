package BatallaNaval;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ModelBatallaNaval {

    private int flag;
    private int cantidadPortavion, cantidadSubmarino, cantidadDestructor, cantidadFragata;
    public ArrayList<Barco> barcosDeJugadores, barcosDeComputador;

    public ArrayList<Barco> portavionesPorPoner, submarinosPorPoner, destructoresPorPoner, fragatasPorPoner;

    public ModelBatallaNaval() {
        flag = 0;
        cantidadPortavion = 1;
        cantidadSubmarino = 2;
        cantidadDestructor = 3;
        cantidadFragata = 4;

        ArrayList<Integer> cantidades = new ArrayList<>();
        barcosDeJugadores = new ArrayList<>();
        barcosDeComputador = new ArrayList<>();

        cantidades.add(cantidadPortavion);
        cantidades.add(cantidadSubmarino);
        cantidades.add(cantidadDestructor);
        cantidades.add(cantidadFragata);

        portavionesPorPoner = new ArrayList<>();
        submarinosPorPoner = new ArrayList<>();
        destructoresPorPoner = new ArrayList<>();
        fragatasPorPoner = new ArrayList<>();

        for (int i = 0; i < cantidades.size(); i++) {
            for (int j = 0; j < cantidades.get(i); j++) {

                switch (i) {
                    case 0:
                        barcosDeJugadores.add(new Barco("portavion", 4));
                        barcosDeComputador.add(new Barco("portavion", 4));
                        portavionesPorPoner.add(new Barco("portavion", 4));
                        break;
                    case 1:
                        barcosDeJugadores.add(new Barco("submarino", 3));
                        barcosDeComputador.add(new Barco("submarino", 3));
                        submarinosPorPoner.add(new Barco("submarino", 3));
                        break;
                    case 2:
                        barcosDeJugadores.add(new Barco("destructor", 2));
                        barcosDeComputador.add(new Barco("destructor", 2));
                        destructoresPorPoner.add(new Barco("destructor", 2));
                        break;
                    case 3:
                        barcosDeJugadores.add(new Barco("fragata", 1));
                        barcosDeComputador.add(new Barco("fragata", 1));
                        fragatasPorPoner.add(new Barco("fragata", 1));
                    default:
                        break;
                }
            }
        }
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
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
}
