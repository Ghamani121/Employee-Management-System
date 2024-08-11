package EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
//ActionListener is an interface which if to be implemented actionPerfromer method must be overrided
import java.awt.event.ActionListener;
public class Splash extends JFrame implements ActionListener {
    
    int x;

    Splash(){
        // Initial position for the heading
        x = -1000;

        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(x, 5, 1000, 100);
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(40, 90, 900, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(300, 420, 300, 70);
        clickhere.setBackground(Color.WHITE);
        clickhere.setForeground(Color.DARK_GRAY);
        clickhere.addActionListener(this);//when clickhere is clicked,this function is called,fuction is definied below
        image.add(clickhere);
        
        // Timer to move the heading to the left
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += 2;  // Move right by 2 pixels
                if (x > getWidth()) {
                    x = -heading.getWidth();   // Reset to the left side when it goes off-screen
                }
                heading.setLocation(x, heading.getY());  // Update the position of the heading
            }
        });
        timer.start();
        
        setSize(1000, 650);
        setLocation(200, 50);
        setVisible(true);
    }
    //ae is parameter aka actionevent
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);//closes current frame
        new Login();//calls login constructor
    }
    
    public static void main(String args[]) {
        new Splash();
    }

}