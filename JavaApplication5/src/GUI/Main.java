/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author chouv
 */
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main extends JFrame implements ActionListener,DocumentListener{
    private JLabel lbln1,lbln2,lblkq;
    private JTextField txtn1,txtn2;
    private JButton bt1,bt2;

    public Main() {
        initGUI();
    }
    private void initGUI(){
        setTitle("Tinh dien tich");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        
        setLayout(null);
        //khoi tao cac thanh phan
        lbln1=new JLabel("Nhap so 1:");
        lbln2=new JLabel("Nhap so 2:");
        lblkq=new JLabel("Nhap kq:");
        lbln1.setBounds(50, 50, 120, 20);
        lbln2.setBounds(50, 100, 120, 20);
        lblkq.setBounds(80, 150, 200, 20);
        add(lbln1);
        add(lbln2);
        add(lblkq);
        
        txtn1 = new JTextField();
        txtn2 = new JTextField();
        txtn1.setBounds(200,50,150,20);
        txtn2.setBounds(200,100,150,20);
        add(txtn1);
        add(txtn2);
        
        bt1=new JButton("Nhap lai");
        bt2=new JButton("Tinh");
        bt1.setBounds(100, 200, 150, 20);
        bt2.setBounds(300, 200, 150, 20);
        add(bt1);
        add(bt2);
        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        lbln1.setFont(f);
        lbln2.setFont(f);
        lblkq.setFont(f);
        txtn1.setFont(f);
        txtn2.setFont(f);
        bt1.setFont(f);
        bt2.setFont(f);
        
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        txtn1.getDocument().addDocumentListener(this);
        txtn2.getDocument().addDocumentListener(this);
        
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    private void check(){
        String s1 = txtn1.getText();
        String s2 = txtn1.getText();
        if(!s1.isEmpty()||!s2.isEmpty())
            bt1.setEnabled(false);
        if(s1.isEmpty() & s2.isEmpty())
            bt1.setEnabled(true);

    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        check();
    }
}
