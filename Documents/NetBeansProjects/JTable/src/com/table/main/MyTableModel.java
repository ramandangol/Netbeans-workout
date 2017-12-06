/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.table.main;

import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import model.Data;

/**
 *
 * @author Bladestorm
 */

    public class MyTableModel extends AbstractTableModel implements TableModel {
    private List<Data> inclomeList;
    private List<Data> expenseList;

    @Override
    public int getRowCount() {
        if(inclomeList == null || expenseList == null) {
            if(inclomeList != null) {
                return inclomeList.size();
            }
            else if(expenseList != null) {
                return expenseList.size();
            }

            return 0;
        }

        return Math.max(inclomeList.size(), expenseList.size());
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Data inclome = null;
        Data expense = null;

        if(inclomeList != null && inclomeList.size() > row) {
            inclome = inclomeList.get(row);
        }

        if(expenseList != null && expenseList.size() > row) {
            expense = expenseList.get(row);
        }

        switch (column) {
            case 0: return inclome != null ? inclome.getDate() : "";
            case 1: return inclome != null ? inclome.getName() : "";
            case 2: return inclome != null ? inclome.getAmount() : "";
            case 3: return expense != null ? expense.getDate() : "";
            case 4: return expense != null ? expense.getName() : "";
            case 5: return expense != null ? expense.getAmount() : "";
        }

        return null;
    }

    public void update() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                Database database = new Database();
                inclomeList = database.getData(Database.TBL_INCOME);
                expenseList = database.getData(Database.TBL_EXPENSES);

                return null;
            }

            @Override
            protected void done() {
                try {
                    get();
                    fireTableDataChanged();
                }
                catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        };

        worker.execute();
    }
}

