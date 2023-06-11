package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class helloworld extends JFrame{
    public helloworld(){
        setTitle("Helloword");
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnl = new JPanel();
        JLabel lbl =  new JLabel("Password:");
        JPasswordField pwd = new JPasswordField(20);
        pnl.add(lbl);
        pnl.add(pwd);
        this.add(pnl);

    }
    public static void main(String[] args) {
        new helloworld().setVisible(true);
    }
}
