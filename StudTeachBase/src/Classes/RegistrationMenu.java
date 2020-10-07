package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationMenu  extends Container {
    private JButton registerButton,cancelButton;
    private JLabel Lemail,Lfullname,Llogin,Lpassword,Te;
    private JTextField Temail,Tfullname,Tlogin,Tpassword;
    private String email,fullname,login,password;
    public RegistrationMenu()
    {
        setSize(450,350);
        setLayout(null);
        setVisible(true);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);
        Te=new JLabel("Teacher registration in order to get access to DB");
        Te.setBounds(80,5,300,15);
        add(Te);

        Lemail=new JLabel("Email");
        Lemail.setBounds(40,30,110,25);
        Lemail.setFont(font);
        add(Lemail);

        Temail=new JTextField();
        Temail.setBounds(140,30,200,25);
        add(Temail);

        Lfullname = new JLabel("Fullname");
        Lfullname.setBounds(40, 90, 110, 25);
        Lfullname.setFont(font);
        add(Lfullname);

        Tfullname=new JTextField();
        Tfullname.setBounds(140,90,200,25);
        add(Tfullname);

        Llogin=new JLabel("Login");
        Llogin.setBounds(40,150,110,25);
        Llogin.setFont(font);
        add(Llogin);

        Tlogin=new JTextField();
        Tlogin.setBounds(140,150,200,25);
        add(Tlogin);

        Lpassword=new JLabel("Password");
        Lpassword.setBounds(40,210,110,25);
        Lpassword.setFont(font);
        add(Lpassword);

        Tpassword=new JTextField();
        Tpassword.setBounds(140,210,200,25);
        add(Tpassword);

        registerButton=new JButton("sign up");
        registerButton.setBounds(115,270,100,25);
        registerButton.setFont(font);
        add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login=Tlogin.getText();
                String password=Tpassword.getText();
                String email=Temail.getText();
                String fullname=Tfullname.getText();
                Tlogin.setText("");
                Tpassword.setText("");
                Temail.setText("");
                Tfullname.setText("");
                Main.AddUser( new Users(Users.k,login,password,email,fullname));
            }
        });

        cancelButton=new JButton("cancel");
        cancelButton.setBounds(240,270,100,25);
        cancelButton.setFont(font);
        add(cancelButton);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainWindow.setVisible(true);
                Main.frame.registrationWindow.setVisible(false);
            }
        });
    }
}
