package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    String pin;
    Main_Class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1100, 740);
        add(l3);

        JLabel label = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 16));
        label.setBounds(250, 252, 400, 35);
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBackground(new Color(74, 129, 132));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBounds(195, 370, 170, 25);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWAL");
        b2.setBackground(new Color(74, 129 , 132));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBounds(455, 370, 170, 25);
        b2.addActionListener(this);
        l3.add(b2);

        b3 =  new JButton("FAST CASH");
        b3.setBackground(new Color(74, 129, 132));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setBounds(195, 400, 170, 25);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBackground(new Color(74, 129, 134));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Raleway", Font.BOLD, 14));
        b4.setBounds(455, 400, 170, 25);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBackground(new Color(74, 129, 134));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Raleway", Font.BOLD, 14));
        b5.setBounds(195, 430, 170, 25);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBackground(new Color(74, 129, 134));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("Raleway", Font.BOLD, 14));
        b6.setBounds(455, 430, 170, 25);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setBackground(new Color(74, 129, 134));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("Raleway", Font.BOLD, 14));
        b7.setBounds(455, 460, 170, 25);
        b7.addActionListener(this);
        l3.add(b7);

        b8 = new JButton("LOGOUT");
        b8.setBackground(new Color(74,129, 134));
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("Raleway", Font.BOLD, 14));
        b8.setBounds(195, 460, 170, 25);
        b8.addActionListener(this);
        l3.add(b8);

        setLayout(null);
        setSize(1100, 740);
        setLocation(130, 0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource() == b7){
            System.exit(0);
        }else if(e.getSource() == b2){
            new Withdrawal(pin);
            setVisible(false);
        }else if(e.getSource() == b6){
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource() == b3){
            new FastCash(pin);
            setVisible(false);
        }else if(e.getSource() == b5){
            new Pin(pin);
            setVisible(false);
        }else if(e.getSource() == b4){
            new Mini(pin);
        }else if(e.getSource() == b8){
            this.dispose();
            new Login();
        }
    }
    public static void main(String args[]){
        new Main_Class("");
    }
}
