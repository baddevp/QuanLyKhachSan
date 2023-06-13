package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class helloworld extends JFrame{
    public helloworld(){
        setTitle("Helloword");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnl = new JPanel(null);
        JLabel lblTitle = new JLabel("Dang nhap");
        JTextField txtDN = new JTextField(20);
        pnl.add(txtDN);
        JLabel lblDN;
        pnl.add(lblDN = new JLabel("Ten dang nhap:"));
        txtDN.setBounds(150, 100, 100, 30);
        lblDN.setBounds(50, 100, 100, 30);
        this.add(lblTitle);
        lblTitle.setBounds(160, 0, 80, 30);
        JLabel lbl =  new JLabel("Password:");
        JPasswordField pwd = new JPasswordField(20);
        pnl.add(lbl);
        pnl.add(pwd);
        pwd.setBounds(150, 150, 100, 30);
        lbl.setBounds(50, 150, 100, 30);
        this.add(pnl);

    }
    public static void main(String[] args) {
        new helloworld().setVisible(true);
    }
}
