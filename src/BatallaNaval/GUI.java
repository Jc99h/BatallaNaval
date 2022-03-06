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
	GridLayout gridLayout = new GridLayout(10 ,10, 5, 5);
	private Escucha escucha;
	private Casilla casilla[][] = new Casilla[10][10];

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
		//Set up JFrame Container's Layout
		this.getContentPane().setLayout(gridLayout);
		//Create Listener Object and Control Object
		escucha = new Escucha();
		//Set up JComponents

		for(int i=0; i<gridLayout.getRows(); i++)
		{
			for(int j=0; j<gridLayout.getColumns(); j++)
			{
				casilla[i][j] = new Casilla(i, j, "agua");
				casilla[i][j].setPreferredSize(new Dimension(50,50));
				casilla[i][j].addActionListener(escucha);
				this.add(casilla[i][j]);
			}
		}
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
			if(objectEvent.getSource() == null)
			{
				JOptionPane.showMessageDialog(null, "Click en ninguna parte");
			}
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
		}
	}
}