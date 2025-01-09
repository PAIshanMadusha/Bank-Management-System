package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signup extends JFrame implements ActionListener{
    JTextField textName, textFName, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;
    Random random = new Random();
    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:" + first);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        label1.setBounds(160, 20, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 16));
        label2.setBounds(390, 60, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS");
        label3.setForeground(Color.GRAY);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(320, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 20));
        textName.setBounds(300, 150, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name: ");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 200, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 20));
        textFName.setBounds(300, 200, 400, 30);
        add(textFName);

        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 300, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 300, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender: ");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 250, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(215, 252, 252));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(300, 250, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(215, 252, 252));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(450, 250, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address: ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        textEmail.setBounds(300, 350, 400, 30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status: ");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100, 400, 200, 30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(215, 252, 252));
        m1.setFont(new Font("Raleway", Font.BOLD, 16));
        m1.setBounds(300, 400, 100, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(215, 252, 252));
        m2.setFont(new Font("Raleway", Font.BOLD, 16));
        m2.setBounds(450, 400, 150, 30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(215, 252, 252));
        m3.setFont(new Font("Raleway", Font.BOLD, 16));
        m3.setBounds(630, 400, 100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 450, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        textAdd.setBounds(300, 450, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City: ");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 500, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 20));
        textCity.setBounds(300, 500, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Post Code: ");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 22));
        labelPin.setBounds(100, 550, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 22));
        textPin.setBounds(300, 550, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State: ");
        labelState.setFont(new Font("Raleway", Font.BOLD, 22));
        labelState.setBounds(100, 600, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 22));
        textState.setBounds(300, 600, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setBackground(Color.GREEN);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setSize(850, 740);
        setLocation(250, 0);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        String formNo = first;
        String name = textName.getText();
        String fName = textFName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String email = textEmail.getText();

        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else if(m2.isSelected()){
            marital = "Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pinCode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Name Field");
            }else if(textFName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Father's Name Field");
            }else if(textEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Email Field");
            }else if(!isValidEmail(email)){
                JOptionPane.showMessageDialog(null, "Enter a Valid Email Address");
            }else if(textAdd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Address Field");
            }else if(textCity.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the City Field");
            }else if(textPin.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Pin Field");
            }else if(textState.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill the State Field");
            }else{
                Db con1 = new Db();
                String q = "insert into signup values('"+formNo+"', '"+name+"', '"+fName+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pinCode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formNo);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    public static void main(String args[]){
        new Signup();
    }
}
