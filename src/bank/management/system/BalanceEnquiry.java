package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.border.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton b1;
    BalanceEnquiry(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1100, 740);
        add(l3);

        Border backLine = BorderFactory.createLineBorder(Color.WHITE);

        JLabel label1 = new JLabel("YOUR CURRENT BALANCE");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(300, 252, 400, 35);
        l3.add(label1);

        label2 = new JLabel("");
        label2.setBorder(backLine);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(258, 300, 300, 35);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBackground(new Color(74, 129, 132));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Raleway", Font.BOLD, 12));
        b1.setBounds(455, 460, 175, 25);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try{
            Db c = new Db();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        label2.setText("Rs. " +balance);

        setLayout(null);
        setSize(1100, 740);
        setLocation(130, 0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Main_Class(pin);
    }
    public static void main(String args[]){
        new BalanceEnquiry("");
    }
}
