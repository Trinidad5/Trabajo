package p1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;



public class Ventana extends JFrame{

	public Ventana() {
		
 
		
		
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setMinimumSize(new Dimension(200, 200));
        this.setMaximumSize(new Dimension(800, 800));
        this.setTitle("Hola");
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLocation(200,200);
        
        JPanel contenedor = new JPanel();
        contenedor.setOpaque(true);
        contenedor.setBackground(Color.black);
        contenedor.setSize(500, 500);
        contenedor.setLocation(50,50);
        contenedor.setLayout(null);
        this.add(contenedor);
        
        JLabel tittle_login = new JLabel ();
        tittle_login.setText("Bienvenido");
		tittle_login.setSize(200,30);
		tittle_login.setOpaque(true);
		tittle_login.setLocation(150,10);
		tittle_login.setBackground(Color.white);
		tittle_login.setFont(new Font("Arial",Font.BOLD,22));
		tittle_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(tittle_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(30,150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(300,300);
		acceder.setSize(100,40);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		
		
		
		contenedor.repaint();
		contenedor.revalidate();
		
		
		
		
		

	}

}
