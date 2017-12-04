/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTableExample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;

public class TableExample extends JFrame implements ActionListener {

    JButton btnBack;
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);
    JScrollPane jsp;

    public TableExample() {

        btnBack = new JButton("back");
        add(btnBack).setBounds(10, 10, 80, 20);
        btnBack.addActionListener(this);

        model.addColumn("sn");
        model.addColumn("Item");
        model.addColumn("Price");

        Object[] data = {"1", "pencil", "200"};
        Object[] a = {"2", "pencil", "200"};

        model.addRow(new Object[]{"1", "book", "100"});
        model.addRow(data);
        model.addRow(a);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        jsp = new JScrollPane(table, v, h);
        add(jsp).setBounds(50, 50, 400, 400);

        setLayout(null);
        setVisible(true);
        setSize(900, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Purchase");
        addKeyListener(new KeyListener() {
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
        });

    }

    public static void main(String[] args) {
        new TableExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBack) {
            new MainPrograms();
            this.dispose();
        }
    }


}
