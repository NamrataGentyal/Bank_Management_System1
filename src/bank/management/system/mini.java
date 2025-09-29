package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    JButton button, button2;
    String pin;
    mini(String pin){
        this.pin =pin;
        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("TechCoder A.V");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);


        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+ resultSet.getString("card_no").substring(0,4)+ "xxxxxxxx"+ resultSet.getString("card_no").substring(12));
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            int balance =0 ;
            Con c= new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while(resultSet.next())
            {
                label1.setText(label1.getText()+ "<html>"+resultSet.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");

                if(resultSet.getString("type").equals("Deposit"))
                {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your Total Balance is Rs. "+balance);

        }catch (Exception E)
        {
            E.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.white);
        button.addActionListener(this);
        add(button);

        button2 = new JButton("Back");
        button2.setBounds(150,500,100,25);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        add(button2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button)
            {
                setVisible(false);
            }
            else if(e.getSource()==button2)
            {
                setVisible(false);
                new main_Class(pin);
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new mini("");
    }
}
