package bank.management.system;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Date;
import java.sql.*;

public class FastCash extends JFrame implements ActionListener{
    String pin;
    JButton b1, b2, b3, b4, b5, b6, b7;
    FastCash(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1100, 740);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAW AMOUNT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 16));
        label.setBounds(290, 252, 400, 35);
        l3.add(label);

        b1 = new JButton("Rs.500.00");
        b1.setBackground(new Color(74, 129, 132));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBounds(195, 370, 170, 25);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs.1000.00");
        b2.setBackground(new Color(24, 129, 132));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("System", Font.BOLD, 14));
        b2.setBounds(455, 370, 170, 25);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs.2000.00");
        b3.setBackground(new Color(74, 129, 132));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("System", Font.BOLD, 14));
        b3.setBounds(195, 400, 170, 25);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs.3000.00");
        b4.setBackground(new Color(74, 129, 132));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("System", Font.BOLD, 14));
        b4.setBounds(455, 400, 170, 25);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs.5000.00");
        b5.setBackground(new Color(74, 129, 132));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("System", Font.BOLD, 14));
        b5.setBounds(195, 430, 170, 25);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs.10000.00");
        b6.setBackground(new Color(74, 129, 132));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("System", Font.BOLD, 14));
        b6.setBounds(455, 430, 170, 25);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setBackground(new Color(74, 129, 132));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("System", Font.BOLD, 14));
        b7.setBounds(455, 460, 170, 25);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1100, 740);
        setLocation(130, 0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b7){
            new Main_Class(pin);
            setVisible(false);
        }else{
            String amount = ((JButton)e.getSource()).getText().substring(3, ((JButton)e.getSource()).getText().length() - 3);
            Db c = new Db();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs." +amount+ " Debited Successfully");

            }catch(Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Main_Class(pin);
        }
    }
    public static void main(String args[]){
        new FastCash("");
    }
}
