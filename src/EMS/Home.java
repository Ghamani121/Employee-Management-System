package EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	
	JButton add, view, update, remove;
	
	Home() {
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(00, 00, 1000, 650);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(550, 20, 400, 40);
        heading.setFont(new Font("TAHOMA", Font.BOLD, 25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(550, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(800, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(550, 170, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove= new JButton("Remove Employee");
        remove.setBounds(800, 170, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1000, 650);
        setLocation(200, 50);
        setVisible(true);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == add) {
			
		}
		
		else if(ae.getSource() == view) {
			
		}
		
		else if(ae.getSource() == update) {
			
		}
		
		else {
			
		}
		
	}

	public static void main(String args[]) {
		new Home();
	}
}
