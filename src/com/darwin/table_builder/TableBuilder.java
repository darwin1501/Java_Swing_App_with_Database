package com.darwin.table_builder;

import com.darwin.view.StudentUI;

import javax.swing.*;

public class TableBuilder extends StudentUI{

    private JTable table;

    public void buildTable(Object[][] row, Object[] column){
        table = new JTable(row, column);
        table.setBounds(10,200,400,200);
//        add scroll pane
        this.add(table);
        this.setVisible(true);
    }
}
