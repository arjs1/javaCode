

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExample extends JFrame{

    public TableExample() {
        setTitle("Table Example");
        setSize(1000,1500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[][] data = {{"01","Aryan Jaiswal"},{"02","Sujata Dangol"}};
        String[] column ={"Cid","CName"};
        JTable tableData = new JTable(data,column);
        tableData.setBounds(10, 30, 400, 500);
       JScrollPane scrollPane = new JScrollPane(tableData);
       add(scrollPane);
       setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
    
}
