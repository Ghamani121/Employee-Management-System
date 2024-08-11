package EMS;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {//frame is the gui
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//default layout is removed

        //username
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(40,20,100, 30);//set boundry for jlabel username
        add(lblusername);

        JTextField tfusername=new JTextField();
        tfusername.setBounds(150,20,100, 30);
        add(tfusername);

        //password
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(40,70,100, 30);//set boundry for jlabel username
        add(lblpassword);

        JTextField tfpassword=new JTextField();
        tfpassword.setBounds(150,70,100, 30);
        add(tfpassword);

        //login button
        JButton loginbutton= new JButton("Login");
        loginbutton.setBounds(150,140,150,30);
        loginbutton.setBackground(Color.BLACK);//sets bg of button
        loginbutton.setForeground(Color.WHITE);//sets color of items on button
        add(loginbutton);

        //image
        //getSystemResource=retrives resource from given classpath
        //ImageIcon loads the url or file path retrived
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        //getimage=retrieves image from i1
        //getScaledInstance=scales the image to a new size
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        //new object is created and image is taken and converted as an icon
        ImageIcon i3 = new ImageIcon(i2);
        //JLabel is a Swing component used for displaying text or images
        JLabel image= new JLabel(i3);
        image.setBounds(350,0,200,200);
        //adds the JLabel image to the container in which it's being used
        add(image);

        //frame settings
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);//cause inherently the frame is hidden
    }
    public static void main(String[] args) {
        //call constructor
        new Login();
    }
}
