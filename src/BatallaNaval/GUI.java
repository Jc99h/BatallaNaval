package BatallaNaval;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * This class is used for ...
 *
 * @author Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @author Danny lopez 1941453-2711  danny.cardenas@correounivalle.edu.co
 * @version @version v.1.0.0 date:06/03/2022
 */
public class GUI extends JFrame {

    private Header headerProject;
    GridBagConstraints constraints = new GridBagConstraints();
    private String espacio = "                    ";
    GridLayout gridLayout = new GridLayout(10, 10, 3, 3);
    private Escucha escucha;
    private Casilla casillas[][] = new Casilla[10][10];
    private JPanel panelPrincipal, panelOpciones, tableroCompleto;
    private JButton ayuda, jugar, botonPortavion, botonSubmarino, botonDestructor, botonFragata;
    private int portavionPuestos, submarinoPuestos, destructorPuestos, fragataPuestos;
    private JTextArea mensaje;
    private boolean clickBotonBarco, clickPortavion, clickSubmarino, clickDestructor, clickFragata;
    private ModelBatallaNaval modelBatallaNaval;
    Casilla casillaClickeada = new Casilla(0, 0, "");

    /**
     * Constructor of GUI class
     */
    public GUI() {
        initGUI();

        //Default JFrame configuration
        this.setTitle("Batalla Naval");
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        panelPrincipal = new JPanel();
        panelOpciones = new JPanel();

        //Set up JFrame Container's Layout
        panelPrincipal.setLayout(gridLayout);
        panelOpciones.setLayout(new GridBagLayout());

        //Create Listener Object and Control Object
        modelBatallaNaval = new ModelBatallaNaval();
        escucha = new Escucha();

        portavionPuestos = modelBatallaNaval.getCantidadPortavion();
        submarinoPuestos = modelBatallaNaval.getCantidadSubmarino();
        destructorPuestos = modelBatallaNaval.getCantidadDestructor();
        fragataPuestos = modelBatallaNaval.getCantidadFragata();

        for (int i = 0; i < gridLayout.getRows(); i++) {
            for (int j = 0; j < gridLayout.getColumns(); j++) {
                casillas[i][j] = new Casilla(i, j, "agua");
                casillas[i][j].setPreferredSize(new Dimension(25, 25));
                casillas[i][j].addActionListener(escucha);
                panelPrincipal.add(casillas[i][j]);
            }
        }

        //Set up JComponents

        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                constraints.gridx = i;
                constraints.gridy = j;

                if (i == 1 && j == 1) {
                    jugar = new JButton("Jugar");
                    jugar.addActionListener(escucha);
                    panelOpciones.add(jugar, constraints);
                    continue;
                } else if (i == 1 && j == 3) {
                    ayuda = new JButton("Ayuda");
                    ayuda.addActionListener(escucha);
                    panelOpciones.add(ayuda, constraints);
                    continue;
                }

                mensaje = new JTextArea();
                mensaje.setText(espacio);
                mensaje.setEditable(false);
                mensaje.setBackground(Color.BLUE);
                panelOpciones.add(mensaje, constraints);

            }
        }

        tableroCompleto = new JPanel();
        tableroCompleto.setLayout(new BorderLayout());
        tableroCompleto.add(panelPrincipal, BorderLayout.EAST);
        tableroCompleto.add(panelOpciones, BorderLayout.WEST);

        this.setContentPane(tableroCompleto);
    }

    public void jugarbotonGUI() {
        panelOpciones.removeAll();

        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {

                constraints.gridx = i;
                constraints.gridy = j;

                if (i == 1 && j == 1) {

                    botonPortavion = new JButton("Portavion: " + modelBatallaNaval.getCantidadPortavion());

                    if (portavionPuestos != 0) {
                        botonPortavion.addActionListener(escucha);
                        botonPortavion.setBackground(null);
                    }

                    panelOpciones.add(botonPortavion, constraints);
                    continue;
                } else if (i == 1 && j == 3) {

                    botonSubmarino = new JButton("Submarino: " + modelBatallaNaval.getCantidadSubmarino());

                    if (submarinoPuestos != 0) {
                        botonSubmarino.addActionListener(escucha);
                        botonSubmarino.setBackground(null);
                    }

                    panelOpciones.add(botonSubmarino, constraints);
                    continue;
                } else if (i == 1 && j == 5) {

                    botonDestructor = new JButton("Destructor: " + modelBatallaNaval.getCantidadDestructor());

                    if (destructorPuestos != 0) {
                        botonDestructor.addActionListener(escucha);
                        botonDestructor.setBackground(null);
                    }

                    panelOpciones.add(botonDestructor, constraints);
                    continue;
                } else if (i == 1 && j == 7) {

                    botonFragata = new JButton("Fragata: " + modelBatallaNaval.getCantidadFragata());

                    if (fragataPuestos != 0) {
                        botonFragata.addActionListener(escucha);
                        botonFragata.setBackground(null);
                    }

                    panelOpciones.add(botonFragata, constraints);
                    continue;
                }

                mensaje = new JTextArea();
                mensaje.setText(espacio);
                mensaje.setEditable(false);
                mensaje.setBackground(Color.BLUE);
                panelOpciones.add(mensaje, constraints);
            }
        }
        botonPortavion.setBackground(Color.magenta);
        botonSubmarino.setBackground(Color.green);
        botonDestructor.setBackground(Color.yellow);
        botonFragata.setBackground(Color.red);

        revalidate();
        repaint();
    }

    /**
     * Main process of the Java program
     *
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent objectEvent) {
            if (objectEvent.getSource() == jugar) {
                jugarbotonGUI();
            }
            if (objectEvent.getSource() == botonPortavion) {
                panelOpciones.removeAll();
                revalidate();
                repaint();
                JOptionPane.showMessageDialog(null, "El portavion ocupa 4 casillas seguidas, escogelas");
                clickBotonBarco = true;
                clickPortavion = true;

            } else if (objectEvent.getSource() == botonSubmarino) {
                panelOpciones.removeAll();
                revalidate();
                repaint();
                JOptionPane.showMessageDialog(null, "El submarino ocupa 3 casillas seguidas, escogelas");
                clickBotonBarco = true;
                clickSubmarino = true;

            } else if (objectEvent.getSource() == botonDestructor) {
                panelOpciones.removeAll();
                revalidate();
                repaint();
                JOptionPane.showMessageDialog(null, "El destructor ocupa 2 casillas seguidas, escogelas");
                clickBotonBarco = true;
                clickDestructor = true;

            } else if (objectEvent.getSource() == botonFragata) {
                panelOpciones.removeAll();
                revalidate();
                repaint();
                JOptionPane.showMessageDialog(null, "El fragata ocupa 1 casillas seguidas, escogelas");
                clickBotonBarco = true;
                clickFragata = true;
            }

            if (clickBotonBarco) {
                if (clickPortavion) {
                    posicionarCasillas(objectEvent, modelBatallaNaval.portavionesPorPoner.get(0));
                } else if (clickSubmarino) {
                    posicionarCasillas(objectEvent, modelBatallaNaval.submarinosPorPoner.get(0));
                } else if (clickDestructor) {
                    posicionarCasillas(objectEvent, modelBatallaNaval.destructoresPorPoner.get(0));
                } else if (clickFragata) {
                    posicionarCasillas(objectEvent, modelBatallaNaval.fragatasPorPoner.get(0));
                }
            }
        }
    }

    private boolean validarCasillaClickeada(Barco barco, Casilla actualCasilla, String direccion) {
        if (!Objects.equals(actualCasilla.getTipo(), "agua")) return false;

        //la casilla clickeada esta al lado de un barco?
        for (int k = 0; k < barco.casillasDelBarco.size(); k++) {
            int index1 = barco.casillasDelBarco.get(k).getFila();
            int index2 = barco.casillasDelBarco.get(k).getColumna();
            if (direccion == null) {

                if (actualCasilla == casillas[index1 != casillas.length - 1 ? index1 + 1 : index1][index2] ||
                        actualCasilla == casillas[index1 != 0 ? index1 - 1 : index1][index2] ||
                        actualCasilla == casillas[index1][index2 != 0 ? index2 - 1 : index2] ||
                        actualCasilla == casillas[index1][index2 != casillas[k].length - 1 ? index2 + 1 : index2]) {
                    return true;
                }
            } else if (direccion.equals("vertical")) {

                if (actualCasilla == casillas[index1 != casillas.length - 1 ? index1 + 1 : index1][index2] ||
                        actualCasilla == casillas[index1 != 0 ? index1 - 1 : index1][index2]) {
                    return true;
                }
            } else if (direccion.equals("horizontal")) {

                if (actualCasilla == casillas[index1][index2 != 0 ? index2 - 1 : index2] ||
                        actualCasilla == casillas[index1][index2 != casillas[k].length - 1 ? index2 + 1 : index2]) {
                    return true;
                }
            }
        }

        return false;
    }

    private void posicionarCasillas(ActionEvent objectEvent, Barco barco) {
        for (int i = 0; i < gridLayout.getRows(); i++) {
            for (int j = 0; j < gridLayout.getColumns(); j++) {
                if (objectEvent.getSource() == casillas[i][j]) {

                    //primer casilla
                    if (modelBatallaNaval.getFlag() == 0) {

                        casillaClickeada.setFila(i);
                        casillaClickeada.setColumna(j);
                        casillaClickeada.setTipo(barco.getTipoBarco());
                        casillas[i][j].removeActionListener(escucha);

                        if (Objects.equals(barco.getTipoBarco(), "portavion")) {
                            casillas[i][j].setBackground(Color.magenta);
                        } else {
                            if (Objects.equals(barco.getTipoBarco(), "submarino")) {
                                casillas[i][j].setBackground(Color.green);
                            } else {
                                if (Objects.equals(barco.getTipoBarco(), "destructor")) {
                                    casillas[i][j].setBackground(Color.yellow);
                                } else {
                                    if (Objects.equals(barco.getTipoBarco(), "fragata")) {
                                        casillas[i][j].setBackground(Color.red);
                                    }
                                }
                            }
                        }


                        //casillas[i][j].setBackground(Color.GREEN);
                        casillas[i][j].setValoresDeCasilla(casillaClickeada.getFila(), casillaClickeada.getColumna(), casillaClickeada.getTipo());

                        modelBatallaNaval.setFlag(modelBatallaNaval.getFlag() + 1);
                        barco.setCasillas(barco.getCasillas() - 1);
                        barco.casillasDelBarco.add(new Casilla(casillaClickeada.getFila(), casillaClickeada.getColumna(), casillaClickeada.getTipo()));

                    } else if (modelBatallaNaval.getFlag() == 1) {

                        if (validarCasillaClickeada(barco, casillas[i][j], null)) {

                            barco.posicion(i, casillaClickeada.getFila(), j, casillaClickeada.getColumna());

                            casillaClickeada.setFila(i);
                            casillaClickeada.setColumna(j);
                            casillaClickeada.setTipo(barco.getTipoBarco());
                            casillas[i][j].removeActionListener(escucha);

                            if (Objects.equals(barco.getTipoBarco(), "portavion")) {
                                casillas[i][j].setBackground(Color.magenta);
                            } else {
                                if (Objects.equals(barco.getTipoBarco(), "submarino")) {
                                    casillas[i][j].setBackground(Color.green);
                                } else {
                                    if (Objects.equals(barco.getTipoBarco(), "destructor")) {
                                        casillas[i][j].setBackground(Color.yellow);
                                    } else {
                                        if (Objects.equals(barco.getTipoBarco(), "fragata")) {
                                            casillas[i][j].setBackground(Color.red);
                                        }
                                    }
                                }
                            }
                            casillas[i][j].setTipo(barco.getTipoBarco());

                            modelBatallaNaval.setFlag(modelBatallaNaval.getFlag() + 1);
                            barco.setCasillas(barco.getCasillas() - 1);
                            barco.casillasDelBarco.add(new Casilla(casillaClickeada.getFila(), casillaClickeada.getColumna(), casillaClickeada.getTipo()));

                            JOptionPane.showMessageDialog(null, "La posicion del barco es " + barco.getOrientacionBarco());
                        }
                    } else if (modelBatallaNaval.getFlag() == 2) {
                        if (validarCasillaClickeada(barco, casillas[i][j], barco.getOrientacionBarco())) {
                            Casilla casillaClickeada = new Casilla(0, 0, "");

                            if (Objects.equals(barco.getTipoBarco(), "portavion")) {
                                casillas[i][j].setBackground(Color.magenta);
                            } else {
                                if (Objects.equals(barco.getTipoBarco(), "submarino")) {
                                    casillas[i][j].setBackground(Color.green);
                                } else {
                                    if (Objects.equals(barco.getTipoBarco(), "destructor")) {
                                        casillas[i][j].setBackground(Color.yellow);
                                    } else {
                                        if (Objects.equals(barco.getTipoBarco(), "fragata")) {
                                            casillas[i][j].setBackground(Color.red);
                                        }
                                    }
                                }
                            }
                            casillas[i][j].setTipo(barco.getTipoBarco());

                            casillaClickeada.setFila(i);
                            casillaClickeada.setColumna(j);
                            casillas[i][j].removeActionListener(escucha);

                            barco.setCasillas(barco.getCasillas() - 1);
                            barco.casillasDelBarco.add(new Casilla(casillaClickeada.getFila(), casillaClickeada.getColumna(), casillaClickeada.getTipo()));

                            JOptionPane.showMessageDialog(null, "Vamos muy bien");
                        } else {
                            JOptionPane.showMessageDialog(null, "Imposible posicionar la casilla del barco aqui");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Imposible posicionar la casilla del barco aqui");
                    }
                    if (barco.getCasillas() == 0) {
                        JOptionPane.showMessageDialog(null, "Posicion correcta, continua con otro barco");

                        jugarbotonGUI();

                        switch (barco.getTipoBarco()) {
                            case "portavion":
                                portavionPuestos--;
                                modelBatallaNaval.portavionesPorPoner.remove(barco);
                                if (portavionPuestos == 0) {
                                    botonPortavion.setBackground(Color.gray);
                                    botonPortavion.removeActionListener(escucha);
                                }
                                break;
                            case "submarino":
                                submarinoPuestos--;
                                modelBatallaNaval.submarinosPorPoner.remove(barco);
                                if (submarinoPuestos == 0) {
                                    botonSubmarino.setBackground(Color.gray);
                                    botonSubmarino.removeActionListener(escucha);
                                }
                                break;
                            case "destructor":
                                destructorPuestos--;
                                modelBatallaNaval.destructoresPorPoner.remove(barco);
                                if (destructorPuestos == 0) {
                                    botonDestructor.setBackground(Color.gray);
                                    botonDestructor.removeActionListener(escucha);
                                }
                                break;
                            case "fragata":
                                fragataPuestos--;
                                modelBatallaNaval.fragatasPorPoner.remove(barco);
                                if (fragataPuestos == 0) {
                                    botonFragata.setBackground(Color.gray);
                                    botonFragata.removeActionListener(escucha);
                                }
                                break;
                            default:
                                System.out.println("tipo de barco no soportado");
                                break;
                        }

                        clickBotonBarco = false;
                        clickPortavion = false;
                        clickSubmarino = false;
                        clickDestructor = false;
                        clickFragata = false;
                        modelBatallaNaval.setFlag(0);
                        return;
                    }
                }
            }
        }
    }
}