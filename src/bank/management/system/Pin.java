package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1, b2;
    JPasswordField p1, p2;
    String pin;
    Pin(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Change Your Pin");
        label.setBounds(430,170,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 24));
        l3.add(label);

        JLabel label2 = new JLabel("New Pin");
        label2.setBounds(430,220,150,35);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 24));
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("RailWay", Font.BOLD, 22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New Pin");
        label3.setBounds(430,250,150,35);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 24));
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,250,180,25);
        p2.setFont(new Font("RailWay", Font.BOLD, 22));
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);



        setSize(1550, 1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2))
            {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if(e.getSource()==b1)
            {
                if(p1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter new PIN");
                    return;
                }
                if(p2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "Pin changed successfully. please login again for further transactions..");
                setVisible(false);
                new Login();
            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
