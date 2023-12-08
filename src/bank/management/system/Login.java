
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
//import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {  // inheritance
    
    JButton login,sign_up,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        
        setTitle("AUTOMATIC TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon img1 = new ImageIcon (ClassLoader.getSystemResource("ICON/1noATM - copy.jpg"));
        Image img1_sz = img1.getImage().getScaledInstance(80,80, Image.SCALE_DEFAULT);
        ImageIcon img1_convert = new ImageIcon(img1_sz);
        
        JLabel label1 = new JLabel(img1_convert);
        
        label1.setBounds(70, 10,100,100);
        add(label1);
        
        JLabel text = new JLabel ("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel CardNo = new JLabel ("Card No : ");
        CardNo.setFont(new Font("Raleway",Font.BOLD,28));
        CardNo.setBounds(120,120,150,30);
        add(CardNo);
        
         cardTextField = new JTextField();
        cardTextField.setBounds(300, 120,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel ("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,190,250,30);
        add(pin);
        
         pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 190,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(pinTextField);
        
         login = new JButton("SIGN IN");
        login.setBounds(300, 240, 100, 30);
        login.setBackground(Color.BLUE);
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         clear = new JButton("CLEAR ");
        clear.setBounds(430, 240, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        sign_up = new JButton("SIGN UP ");
        sign_up.setBounds(300, 290, 230, 30);
        sign_up.setBackground(Color.BLACK);
        sign_up.setBackground(Color.WHITE);
        sign_up.addActionListener(this);
        add(sign_up);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(700,400);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
            
        }
        else  if(ae.getSource() == sign_up)
        {
            
        }
        else if(ae.getSource() == login)
        {
            
        }

        
    }
    public static void main(String[] args) {
        
        new Login();
    }
}
