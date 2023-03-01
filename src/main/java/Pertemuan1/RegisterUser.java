/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author ASUS
 */
public class RegisterUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(50, 50, 100, 30);
        j.add(name);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 150, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 200, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No HP");
        nohp.setBounds(50, 250, 100, 30);
        j.add(nohp);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150, 50, 200, 30);
        j.add(nameTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 150, 200, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 200, 200, 30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150, 250, 200, 30);
        j.add(nohpTxt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Register");
        registerButton.setBounds(150, 300, 100, 50);
        j.add(registerButton);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
