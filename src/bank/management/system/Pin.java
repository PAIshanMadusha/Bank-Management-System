package bank.management.system;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Pin extends JFrame implements ActionListener {
    JButton b1, b2;
    JPasswordField p1, p2;
    String pin;
    Pin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/3923.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 740, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1100, 740);
        add(l3);

        JLabel label = new JLabel("CHANGE YOUR PIN NUMBER");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 16));
        label.setBounds(290, 252, 400, 35);
        l3.add(label);

        JLabel label2 = new JLabel("NEW PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 14));
        label2.setBounds(200, 300, 200, 35);
        l3.add(label2);

        JLabel label3 = new JLabel("RE-ENTER NEW PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 14));
        label3.setBounds(200, 330, 200, 35);
        l3.add(label3);

        p1 = new JPasswordField();
        p1.setBackground(new Color(74, 129, 132));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Raleway", Font.BOLD, 16));
        p1.setBounds(360, 300, 200, 25);
        l3.add(p1);

        p2 = new JPasswordField();
        p2.setBackground(new Color(74, 129, 132));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("Raleway", Font.BOLD, 16));
        p2.setBounds(360, 330, 200, 25);
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBackground(new Color(74, 129, 134));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("System", Font.BOLD, 14));
        b1.setBounds(455, 430, 170, 25);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(74, 129, 134));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("System", Font.BOLD, 14));
        b2.setBounds(455, 460, 170, 25);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1100, 740);
        setLocation(130,0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN Doesn't Match");
                return;
            }
            if(e.getSource() == b1){
                if(p1.getText().equals("") && p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                Db c = new Db();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
                setVisible(false);
                new Main_Class(pin);

            }else if(e.getSource() == b2){
                setVisible(false);
                new Main_Class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Pin("");
    }
}
