/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPane_Search;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.MessageFormat;
import javax.swing.JLabel;

public class TableExample extends JFrame implements ActionListener {

//    private String[] columnNames
//            = {"Country", "Capital", "Population in Millions", "Democracy"};
//
//    private Object[][] data = {
//        {"USA", "Washington DC", 280, true},
//        {"Canada", "Ottawa", 32, true},
//        {"United Kingdom", "London", 60, true},
//        {"Germany", "Berlin", 83, true},
//        {"France", "Paris", 60, true},
//        {"Norway", "Oslo", 4.5, true},
//        {"India", "New Delhi", 1046, true},
//        {"USA", "Washington DC", 280, true},
//        {"Canada", "Ottawa", 32, true},
//        {"United Kingdom", "London", 60, true},
//        {"Germany", "Berlin", 83, true},};
    JButton btnPrint;
//    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    JLabel lbltext;
    DefaultTableModel model = new DefaultTableModel();
    JTable tbl_country = new JTable(model);
    JScrollPane jsp;
    TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tbl_country.getModel());

    public TableExample() {
        tbl_country.setRowSorter(rowSorter);
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        setVisible(true);
        setSize(dm);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnPrint = new JButton("Print");
        add(btnPrint).setBounds(600, 120, 100, 25);
        btnPrint.addActionListener(this);
        
        lbltext = new JLabel("<html>Hello <br> raman</html>");
        add(lbltext).setBounds(100, 100, 200, 200);

        model.addColumn("s.n");
        model.addColumn("Items");
        model.addColumn("Price");

        model.addRow(new Object[]{"1", "book", "500"});
        model.addRow(new Object[]{"2", "Copy", "800"});
        model.addRow(new Object[]{"3", "Pencil", "500"});
        model.addRow(new Object[]{"4", "Pen", "900"});

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        jsp = new JScrollPane(tbl_country, v, h);
        add(jsp).setBounds(300, 170, 700, 500);
        tbl_country.setShowHorizontalLines(false);

    }

    public static void main(String[] args) {
        new TableExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPrint) {
            
            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                
                MessageFormat[] header = new MessageFormat[3];
                header[0] = new MessageFormat("line 1");
                header[1] = new MessageFormat("line 2");
                header[2] = new MessageFormat("line 3");
                
                MessageFormat[] footer = new MessageFormat[2];
                footer[0] = new MessageFormat("dsf");
                footer[1] = new MessageFormat("fsdf");
                job.setPrintable(new MyTablePrintable(tbl_country, JTable.PrintMode.FIT_WIDTH, header, footer));
                
                job.print();
            } catch (Exception ex) {
            }
            
            

//            try {
//                 PrinterJob job = PrinterJob.getPrinterJob();
//
//            MessageFormat[] header = new MessageFormat[6];
//
//            // Assign the arrays with 6 String values for the headers
//            header[0] = new MessageFormat("");
//            header[1] = new MessageFormat("hello");
//            header[2] = new MessageFormat("");
//          
//            MessageFormat[] footer = new MessageFormat[4];
//
//            // Assign the 4 Strings to the footer array
//            footer[0] = new MessageFormat("Assistant Examiner Signature:______________  Date:___ /___ /_____ ");
//            footer[1] = new MessageFormat("");
//            footer[2] = new MessageFormat("");
//            footer[3] = new MessageFormat("Advising  Examiner Signature:______________  Date:___ /___ /_____ ");
//
//            //here you place the JTable to print 
//            // in this case its called randomSample_gradeBreakdown_jTable
//            // along with the header and footer arrays
//            
//
//            job.print();
//
//
////                MessageFormat header = new MessageFormat("<html>Hello <br> raman</html>");
////                MessageFormat footer = new MessageFormat("Page{1,number,integer}");
////                tbl_country.print(JTable.PrintMode.FIT_WIDTH, header, footer);
////                System.out.println();
//            } catch (Exception ex) {
//
//            }
        }

    }
}
