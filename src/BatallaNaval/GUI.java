package BatallaNaval;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @author Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @version @version v.1.0.0 date:06/03/2022
 */
public class GUI extends JFrame {

	private Header headerProject;
	GridBagConstraints constraints = new GridBagConstraints();
	private String espacio = "                    ";
	GridLayout gridLayout = new GridLayout(10 ,10, 3, 3);
	private Escucha escucha;
	private Casilla casilla[][] = new Casilla[10][10];
	private JPanel panelPrincipal, panelOpciones, tableroCompleto;
	private JButton ayuda, jugar, portavion, submarino, destructor, fragata;
	private JTextArea mensaje;

	/**
	 * Constructor of GUI class
	 */
	public GUI(){
		initGUI();

		//Default JFrame configuration
		this.setTitle("The Title app");
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
		escucha = new Escucha();

		for(int i=0; i<gridLayout.getRows(); i++)
		{
			for(int j=0; j<gridLayout.getColumns(); j++)
			{
				casilla[i][j] = new Casilla(i, j, "agua");
				casilla[i][j].setPreferredSize(new Dimension(25,25));
				casilla[i][j].addActionListener(escucha);
				panelPrincipal.add(casilla[i][j]);
			}
		}

		//Set up JComponents

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		ayuda = new JButton("Ayuda");
		ayuda.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(ayuda, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		jugar = new JButton("Jugar");
		jugar.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(jugar, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		tableroCompleto = new JPanel();
		tableroCompleto.setLayout(new BorderLayout());
		tableroCompleto.add(panelPrincipal, BorderLayout.EAST);
		tableroCompleto.add(panelOpciones, BorderLayout.WEST);

		this.setContentPane(tableroCompleto);
	}

	public void actualizarGUI()
	{
		panelOpciones.removeAll();
		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		portavion = new JButton("Portavion");
		portavion.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(portavion, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		submarino = new JButton("Submarino");
		submarino.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(submarino, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		destructor = new JButton("Destructor");
		destructor.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(destructor, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 6;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 6;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		fragata = new JButton("Fragata");
		fragata.addActionListener(escucha);
		constraints.gridx = 1;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(fragata, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 7;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 0;
		constraints.gridy = 8;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 1;
		constraints.gridy = 8;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		mensaje = new JTextArea();
		mensaje.setText(espacio);
		mensaje.setEditable(false);
		mensaje.setBackground(Color.BLUE);
		constraints.gridx = 2;
		constraints.gridy = 8;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		constraints.anchor = GridBagConstraints.CENTER;
		panelOpciones.add(mensaje, constraints);

		revalidate();
		repaint();
	}

	/**
	 * Main process of the Java program
	 * @param args Object used in order to send input data from command line when
	 *             the program is execute by console.
	 */
	public static void main(String[] args){
		EventQueue.invokeLater(() -> {
			GUI miProjectGUI = new GUI();
		});
	}

	/**
	 * inner class that extends an Adapter Class or implements Listeners used by GUI class
	 */
	private class Escucha implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent objectEvent) {
			for(int i=0; i<gridLayout.getRows(); i++)
			{
				for(int j=0; j<gridLayout.getColumns(); j++)
				{
					if(objectEvent.getSource() == casilla[i][j])
					{
						JOptionPane.showMessageDialog(null, "Fila: "+(casilla[i][j].getFila()+1) + "\nColumna: "+(casilla[i][j].getColumna()+1) + "\nTipo: " +casilla[i][j].getTipo());
					}
				}
			}

			if(objectEvent.getSource() == jugar)
			{
				actualizarGUI();
			}
		}
	}
}