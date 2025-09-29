package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L)+1000L;
    String first = " " + Math.abs(first4);

    JTextField textName, textFName, textemail, textadd, textcity, textpin, textstate;
    JDateChooser dateChooser;
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    Signup(){
        super("APPLICATION FORM");

        //store image in i1 variable from memory
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        //scale image
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        //bring the image on to frame from memory using JLabel
        JLabel image = new JLabel(i3);
        //set image position
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No. " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Railway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Railway", Font.BOLD, 22));
        label3.setBounds(290,98,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Railway", Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Railway", Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Railway", Font.BOLD, 14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Railway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Railway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Railway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Railway", Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel labelemail = new JLabel("Email Address :");
        labelemail.setFont(new Font("Railway", Font.BOLD, 20));
        labelemail.setBounds(100, 390, 200, 30);
        add(labelemail);

        textemail = new JTextField();
        textemail.setFont(new Font("Railway", Font.BOLD, 14));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelms = new JLabel("Married Status :");
        labelms.setFont(new Font("Railway", Font.BOLD, 20));
        labelms.setBounds(100, 440, 200, 30);
        add(labelms);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Railway", Font.BOLD, 14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440, 100, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Railway", Font.BOLD, 14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440, 100, 30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Railway", Font.BOLD, 14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(630,440, 70, 30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labeladd = new JLabel("Address :");
        labeladd.setFont(new Font("Railway", Font.BOLD, 20));
        labeladd.setBounds(100, 490, 200, 30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Railway", Font.BOLD, 14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Railway", Font.BOLD, 20));
        labelcity.setBounds(100, 540, 200, 30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Railway", Font.BOLD, 14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("PinCode :");
        labelpin.setFont(new Font("Railway", Font.BOLD, 20));
        labelpin.setBounds(100, 590, 200, 30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Railway", Font.BOLD, 14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Railway", Font.BOLD, 20));
        labelstate.setBounds(100, 640, 200, 30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Railway", Font.BOLD, 14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("Next");
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360,40);
        //setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //get all user entered values to store them in database;
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "Female";
        }

        String email = textemail.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "Married";
        }
        else if(m2.isSelected())
        {
            marital = "Unmarried";
        }
        else if(m3.isSelected())
        {
            marital = "Other";
        }

        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();


        //let's store all the accessed data into database signup table
        try {
            if(textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                //create object of Con class
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"' ,'"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
