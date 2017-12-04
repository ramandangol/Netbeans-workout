/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTableExample;

/**
 *
 * @author Bladestorm
 */
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainPrograms extends JFrame implements ActionListener,KeyListener{
    JButton btnClick;
    
    
    public MainPrograms(){
      
        setLayout(null);
        setVisible(true);
        setSize(900,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Table");
        addKeyListener(this);
        
        btnClick = new JButton("Click here");
        add(btnClick).setBounds(50, 50, 100, 40);
        btnClick.addActionListener(this);
        
        
        
    }
    
    public static void main(String[] args) {
        new MainPrograms();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  if(e.getSource()==btnClick){
      new TableExample();
      this.dispose();
  }
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
 }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_F){
           JOptionPane.showMessageDialog(null, "Key pressed");
            System.out.println("Hello");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
