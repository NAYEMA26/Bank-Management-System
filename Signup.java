
package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import swing.Signup:: javax.swing.JFrame;
public class Signup extends JFrame implements ActionListener {
    
   JTextField tname, fathername,dob, text_email,ad,phone, pincd,id;
   JLabel merried;
   JRadioButton r1,r2,r3,m1,m2;
   JButton next;
   
    Signup(){
        
        super("APPLICATION FORM");
        
       ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image = new JLabel(img3);
        image.setBounds(25, 10, 100, 100);
        add(image);
        
        
        JLabel lb1 = new JLabel ("     APPLICATION FORM NO.    "+id);
        lb1.setBounds(160, 20, 600, 40);
        lb1.setFont(new Font("Arial",Font.BOLD,28));
        add(lb1);
        
        JLabel lb2 = new JLabel ("        Page 1");
        lb2.setBounds(360, 660, 600, 30);
        lb2.setFont(new Font("Arial",Font.BOLD,17));
        add(lb2);
        
        JLabel pInfo = new JLabel ("     Personal Details");
        pInfo.setBounds(290, 95, 600, 30);
        pInfo.setFont(new Font("Arial",Font.BOLD,22));
        add(pInfo);
        
        JLabel name = new JLabel ("Name :");
        name.setBounds(100, 190, 100, 30);
        name.setFont(new Font("Arial",Font.BOLD,20));
        add(name);
        
        tname = new JTextField();
       tname.setBounds(300, 190, 400, 30);
        tname.setFont(new Font("Arial",Font.BOLD,14));
        add(tname);
        
        JLabel fat_name = new JLabel ("Father's Name :");
        fat_name.setBounds(100, 240, 200, 30);
        fat_name.setFont(new Font("Arial",Font.BOLD,20));
        add(fat_name);
        
        fathername = new JTextField();
       fathername.setBounds(300, 240, 400, 30);
        fathername.setFont(new Font("Arial",Font.BOLD,14));
        add(fathername);
        
        JLabel dob1 = new JLabel ("Date of Birth :");
        dob1.setBounds(100, 290, 200, 30);
        dob1.setFont(new Font("Arial",Font.BOLD,20));
        add(dob1);
        
        dob = new JTextField();
       dob.setBounds(300, 290, 400, 30);
        dob.setFont(new Font("Arial",Font.BOLD,14));
        add(dob);
        
       // gender = new JTextField();
       //gender.setBounds(100, 390, 200, 30);
       // gender.setFont(new Font("Arial",Font.BOLD,14));
        //add(gender);
        
        JLabel gen = new JLabel ("Gender :");
        gen.setBounds(100, 340, 200, 30);
        gen.setFont(new Font("Arial",Font.BOLD,20));
        add(gen);
        
        r1 = new JRadioButton("Male");
        r1.setBounds(300, 340, 90, 30);
        r1.setFont(new Font("Arial",Font.BOLD,20));
        add(r1);
        
         r2 = new JRadioButton("Female");
        r2.setBounds(450, 340, 100, 30);
        r2.setFont(new Font("Arial",Font.BOLD,20));
        add(r2);
        
        r3 = new JRadioButton("Others");
        r3.setBounds(600, 340, 90, 30);
        r3.setFont(new Font("Arial",Font.BOLD,20));
        add(r3);
        
        ButtonGroup but_grp = new ButtonGroup();
        but_grp.add(r1);
        but_grp.add(r2);
        but_grp.add(r3);
       
         JLabel mail = new JLabel ("E-mail Address :");
        mail.setBounds(100, 390, 200, 30);
        mail.setFont(new Font("Arial",Font.BOLD,20));
        add(mail);
        
        text_email = new JTextField();
       text_email.setBounds(300, 390, 400, 30);
        text_email.setFont(new Font("Arial",Font.BOLD,14));
        add(text_email);
        
        merried  = new JLabel ("Marital Status :");
        merried.setBounds(100, 440, 200, 30);
       merried.setFont(new Font("Arial",Font.BOLD,20));
        add(merried);
        
        m1 = new JRadioButton("Marreid ");
        m1.setBounds(300, 440, 150, 30);
        m1.setFont(new Font("Arial",Font.BOLD,20));
        add(m1);
        
         m2 = new JRadioButton("Unmarreid");
        m2.setBounds(520, 440, 150, 30);
        m2.setFont(new Font("Arial",Font.BOLD,20));
        add(m2);
       
        ButtonGroup m_grp = new ButtonGroup();
        m_grp.add(m1);
        m_grp.add(m2);
        
          JLabel add  = new JLabel ("Address :");
        add.setBounds(100, 490, 200, 30);
       add.setFont(new Font("Arial",Font.BOLD,20));
        add(add);
        
          ad = new JTextField();
       ad.setBounds(300, 490, 400, 30);
        ad.setFont(new Font("Arial",Font.BOLD,14));
        add(ad);
        
           JLabel phn = new JLabel ("Contact Number :");
        phn.setBounds(100, 540, 200, 30);
       phn.setFont(new Font("Arial",Font.BOLD,20));
        add(phn);
        
          phone = new JTextField();
       phone.setBounds(300, 540, 400, 30);
        phone.setFont(new Font("Arial",Font.BOLD,14));
        add(phone);
        
           JLabel pin = new JLabel ("PIN Code :");
        pin.setBounds(100, 590, 200, 30);
       pin.setFont(new Font("Arial",Font.BOLD,20));
        add(pin);
        
          pincd = new JTextField();
       pincd.setBounds(300, 590, 400, 30);
        pincd.setFont(new Font("Arial",Font.BOLD,14));
        add(pincd);
        
        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620, 690, 80, 30);
        next.addActionListener(this);
        add(next);
                
               
             
        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
       setSize(850,800) ;
       setLocation(360,40);
       setVisible(true);
       
    }
    
   @Override
     public void actionPerformed(ActionEvent e){
         
//         String id = 2102026;
         String nam = tname.getText();
         String fname = fathername.getText();
          String Dob = dob.getText();
          String gen = null;
          
          if(r1.isSelected() ){
              gen = "Male";
          }
         else if(r2.isSelected() ){
              gen = "Female";
          }

          if(r3.isSelected() ){
              gen = "Others";
          }
          
          String email =  text_email.getText();
          
          String married = null;
          
          if (m1.isSelected())
          {
              married = "Marreid";
          }
          else if (m2.isSelected())
          {
              married = "Unmarreid";
          }
          
         String address =  ad.getText();
         String pin=  pincd.getText();

        
         try{
             
             if(e.getSource() == next)
             {
                 
             }
             
             
         }catch(Exception E){
             E.printStackTrace();
         }
     }
    public static void main(String[] args) {
        new Signup();
    }

}