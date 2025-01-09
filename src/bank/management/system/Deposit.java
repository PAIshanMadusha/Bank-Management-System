package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    String pin;
    TextField textField;
    JButton b1, b2;
    Deposit(String pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1100, 740);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(242, 252, 400, 35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(74, 129, 132));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway", Font.BOLD, 16));
        textField.setBounds(242, 285, 320, 25);
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBackground(new Color(74, 129, 132));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBounds(455, 430, 170, 25);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(74, 129, 132));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBounds(455, 460, 170, 25);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1100, 740);
        setLocation(130, 0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        try{
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount You Want to Deposit");
                }else{
                    Db c = new Db();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. " +amount+ " Deposited Successfully");
                    textField.setText("");
                }
            }else if(e.getSource() == b2){
                setVisible(false);
                new Main_Class(pin);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Deposit("");
    }
}
