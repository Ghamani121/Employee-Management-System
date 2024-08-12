package EMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {//frame is the gui
    JTextField tfusername,tfpassword;
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//default layout is removed

        //username
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(40,20,100, 30);//set boundry for jlabel username
        add(lblusername);

        tfusername=new JTextField();
        tfusername.setBounds(150,20,100, 30);
        add(tfusername);

        //password
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(40,70,100, 30);//set boundry for jlabel username
        add(lblpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(150,70,100, 30);
        add(tfpassword);

        //login button
        JButton loginbutton= new JButton("Login");
        loginbutton.setBounds(150,140,150,30);
        loginbutton.setBackground(Color.BLACK);//sets bg of button
        loginbutton.setForeground(Color.WHITE);//sets color of items on button
        loginbutton.addActionListener(this);
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

    //action performed when login button is clicked
    public void actionPerformed(ActionEvent ae)
    {
        try{
            String username=tfusername.getText();
            String password=tfpassword.getText();

            //in order to use statement method here create conn object
            Conn c=new Conn();
            String query="select * from login where username= '"+username+"' and password = '"+password+"' ";

            //use statement to execute query
            ResultSet rs=c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
            }
            else{
                //used to show dialog to inform the user of something
                JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                setVisible(false);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //call constructor
        new Login();
    }
    //test test
}
