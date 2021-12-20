package com.darwin.table_builder;

import com.darwin.view.StudentUI;

import javax.swing.*;

public class TableBuilder{

    private JTable table;

    public void buildTable(JFrame frame, Object[][] row, Object[] column){
        table = new JTable(row, column);
        table.setBounds(10,200,400,200);
        frame.add(table);
        frame.setVisible(true);

//        add scroll pane
//        this.add(table);
//        this.setVisible(true);
    }
    public JTable getTable(){
        return table;
    }
}
