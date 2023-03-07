/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author ASUS
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Latihan JFrame Pertamaku");
        
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
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(50, 300, 100, 30);
        j.add(alamat);
        
        JLabel umur = new JLabel();
        umur.setText("Umur");
        umur.setBounds(50, 350, 100, 30);
        j.add(umur);
        
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
        
        JTextField alamatTxt = new JTextField();
        alamatTxt.setBounds(150, 300, 200, 30);
        j.add(alamatTxt);
        
        JTextField umurTxt = new JTextField();
        umurTxt.setBounds(150, 350, 200, 30);
        j.add(umurTxt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Register");
        registerButton.setBounds(150, 400, 100, 50);
        j.add(registerButton);
        
        JButton signinButton = new JButton();
        signinButton.setText("Sign In");
        signinButton.setBounds(300, 400, 100, 50);
        j.add(signinButton);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
