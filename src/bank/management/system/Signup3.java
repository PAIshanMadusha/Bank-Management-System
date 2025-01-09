package bank.management.system;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formNo;
    Signup3(String formNo){

        super("Application Form");

        this.formNo = formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        Border backLine = BorderFactory.createLineBorder(Color.BLACK);

        JLabel l1 = new JLabel("PAGE 3");
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        l1.setBounds(380, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("ACCOUNT DETAILS");
        l2.setForeground(Color.GRAY);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");;
        r1.setBackground(new Color(215, 252, 252));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 150, 200, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(215, 252, 252));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(350, 150, 250, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(215, 252, 252));
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 190, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account ");
        r4.setBackground(new Color(215, 252, 252));
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(350, 190, 250, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 250, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 280, 200, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setBorder(backLine);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(350, 250, 250, 30);
        add(l6);

        JLabel l7 = new JLabel("(It Would Appear on ATM Card/ Cheque Book and Statement)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(350, 280, 500, 20);
        add(l7);

        JLabel l8 = new JLabel("PIN: ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 320, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("(Your 4-Digit Password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
        l9.setBounds(100, 350, 200, 20);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setBorder(backLine);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(350, 320, 250, 30);
        add(l10);

        JLabel l11 = new JLabel("Services Required: ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 400, 200, 30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 450, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 450, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 550, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 550, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above-entered details are correct to the best of my knowledge.", true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 610, 600, 20);
        add(c7);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(650, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setBorder(backLine);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(740, 10, 80, 30);
        add(l13);

        s = new JButton("Submit");
        s.setBackground(Color.GREEN);
        s.setForeground(Color.WHITE);
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBounds(610, 650, 100, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBounds(720, 650, 100, 30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(850, 740);
        setLocation(250, 0);
        setResizable(false);
        getContentPane().setBackground(new Color(215, 252, 252));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){

        String accType = null;
        if(r1.isSelected()){
            accType = "Saving Account";
        }else if(r2.isSelected()){
            accType = "Fixed Deposit Account";
        }else if(r3.isSelected()){
            accType = "Current Account";
        }else if(r4.isSelected()){
            accType = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409663000000000L;
        String cardNo = "" + Math.abs(first7);

        long first3 = (ran.nextInt() % 9000L ) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = null;
        if(c1.isSelected()){
            fac = fac+ "ATM Card";
        }else if(c2.isSelected()){
            fac = fac+ "Internet Banking";
        }else if(c3.isSelected()){
            fac = fac+ "Mobile Banking";
        }else if(c4.isSelected()){
            fac = fac+ "Email Alert";
        }else if(c5.isSelected()){
            fac = fac+ "Cheque Book";
        }else if(c6.isSelected()){
            fac = fac+ "E-Statement";
        }
        try{
            if(e.getSource() == s){
                if(accType == null){
                    JOptionPane.showMessageDialog(null, "Select the Account Type");
                }else{
                    Db c1 = new Db();
                    String q1 = "insert into signupthree values('"+formNo+"', '"+accType+"', '"+cardNo+"', '"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formNo+"', '"+cardNo+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNo +"\nPin Number: " +pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if(e.getSource() == c){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Signup3("");
    }
}
