package BatallaNaval;

import javax.swing.*;
import java.awt.*;

/**
 * This class is a kind of JLabel used to create a personalized Header for the project
 * @author Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @version @version v.1.0.0 date:06/03/2022
 */
public class Header extends JLabel {
	/**
	 * Constructor of the Header class
	 * @param title String that contains Header text
	 * @param colorBackground Color object to be assigned for the Header background
	 */
	public Header(String title, Color colorBackground){
		this.setText(title);
		this.setBackground(colorBackground);
		this.setForeground(new Color(255,255,255));
		this.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setOpaque(true);
	}
}