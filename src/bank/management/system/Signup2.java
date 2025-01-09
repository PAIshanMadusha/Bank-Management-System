package bank.management.system;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textId, textContact;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    Signup2(String formNo){

        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel("PAGE 2");
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        l1.setBounds(380, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("ADDITIONAL DETAILS");
        l2.setForeground(Color.GRAY);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 150, 100, 30);
        add(l3);

        String religions[] = {"Buddhist", "Hindu", "Muslim", "Sikh", "Christian", "Others"};
        comboBox = new JComboBox(religions);
        comboBox.setBackground(new Color(215, 252, 252));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(300, 150, 400, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 200, 100, 30);
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(215, 252, 252));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(300, 200, 400, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 250, 100, 30 );
        add(l5);

        String income[] = {"Null", "<150,000", "<250,000", "500,000", "UpTo 1,000,000", "Above 1,000,000" };
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(215, 252, 252));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(300, 250, 400, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational: ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 300, 150, 30);
        add(l6);

        String educational[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(215, 252, 252));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(300, 300, 400, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 350, 150, 30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(215, 252, 252));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(300, 350, 400, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Identification: ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 400, 150, 30);
        add(l8);

        textId = new JTextField();
        textId.setFont(new Font("Raleway", Font.BOLD, 18));
        textId.setBounds(300, 400, 400, 30);
        add(textId);

        JLabel l9 = new JLabel("Contact Number: ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 450, 200, 30);
        add(l9);

        textContact = new JTextField();
        textContact.setFont(new Font("Raleway", Font.BOLD, 18));
        textContact.setBounds(300, 450, 400, 30);
        add(textContact);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 500, 150, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(215, 252, 252));
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(300, 500, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(215, 252, 252));
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(450, 500, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 550, 190, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(215, 252, 252));
        e1.setFont(new Font("Raleway", Font.BOLD, 16));
        e1.setBounds(300, 550, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(215, 252, 252));
        e2.setFont(new Font("Raleway", Font.BOLD, 16));
        e2.setBounds(450, 550, 100, 30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(650, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        Border backLine = BorderFactory.createLineBorder(Color.BLACK);
        l13.setBorder(backLine);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(740, 10, 80, 30);
        add(l13);

        next = new JButton("Next");
        next.setBackground(Color.GREEN);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 740);
        setLocation(250, 0);
        getContentPane().setBackground(new Color(215, 252, 252));
        setResizable(false);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        String rel = (String)comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String id = textId.getText();
        String cont = textContact.getText();

        String sCitizen = null;
        if(r1.isSelected()){
            sCitizen = "Yes";
        }else if(r2.isSelected()){
            sCitizen = "No";
        }

        String eAccount = null;
        if(e1.isSelected()){
            eAccount = "Yes";
        }else if(e2.isSelected()){
            eAccount = "No";
        }

        try{
            if(textId.getText().equals("") || textContact.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill All the Fields");
            }else{
                Db c1 = new Db();
                String q = "insert into signuptwo values('"+formNo+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+id+"', '"+cont+"', '"+sCitizen+"', '"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formNo);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String args[]){
        new Signup2("");
    }
}
