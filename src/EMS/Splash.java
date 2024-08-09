package EMS;

import javax.swing.*;
import java.awt.*;	

public class Splash extends JFrame {
	
	Splash(){
		
		getContentPane().setBackground(Color.GRAY);
		setLayout(null);
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(70, 5, 5000, 100);
		heading.setFont(new Font("serif", Font.PLAIN, 50));
		heading.setForeground(Color.WHITE);
		add(heading);
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50, 100, 1050, 500);
		add(image);
		
		setSize(1000, 650);
		setLocation(200, 50);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		
		new Splash();
	}
}
