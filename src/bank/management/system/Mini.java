package bank.management.system;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.sql.*;
import javax.swing.border.*;

public class Mini extends JFrame implements ActionListener{
    String pin;
    JButton button;
    Mini(String pin){

        this.pin = pin;

        Border backLine = BorderFactory.createLineBorder(Color.BLACK);

        JLabel label1 = new JLabel();
        label1.setBorder(backLine);
        label1.setBounds(35, 140, 330, 310);
        add(label1);

        JLabel label2 = new JLabel("MINI STATEMENT");
        label2.setFont(new Font("System", Font.BOLD, 18));
        label2.setBounds(130, 20, 200, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBorder(backLine);
        label3.setBounds(35, 105, 330, 25);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBorder(backLine);
        label4.setBounds(35, 460, 330, 25);
        add(label4);

        try{
            Db c = new Db();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number: "+ resultSet.getString("card_number").substring(0, 4) + "XXXXXXXX" + resultSet.getString("card_number").substring(12));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            Db c = new Db();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){

                label1.setText(label1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");

                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. " + balance);

        }catch(Exception e){
            e.printStackTrace();
        }
        button = new JButton("EXIT");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("System", Font.BOLD, 14));
        button.setBounds(270, 520, 100, 25);
        button.addActionListener(this);
        add(button);

        getContentPane().setBackground(new Color(127, 180, 162));
        setLayout(null);
        setSize(400, 600);
        setLocation(480, 100);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }
    public static void main(String args[]){
        new Mini("");
    }
}
