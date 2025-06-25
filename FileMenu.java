
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

// Write a program to create a menu named “File” with menu items “New,” “Save,” and “Exit”.
public class FileMenu extends JFrame{

    FileMenu() {
       setTitle("File Example");
       setSize(1000, 1500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        JTextArea textField = new  JTextArea();
        textField.setBounds(50, 30, 200, 30);
        textField.setEditable(false);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 120, 40);
        button.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent a)
            {   
                textField.setText("Hello world");
                getContentPane().setBackground(Color.red);
            }
        });
        add(textField);
        add(button);
    
        setVisible(true);


    }
    public static void main(String[] args) {
        
       new  FileMenu();
    }
    
}
