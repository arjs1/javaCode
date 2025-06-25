
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class SwingMenu extends JFrame{

     SwingMenu()  {
        setTitle("Swing Menu");
        setSize(1080, 1920);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JMenuBar  menuBar = new JMenuBar();
        // JMenu fileMenu = new JMenu("File");

        // JMenuItem newItem = new JMenuItem("New");
        // JMenuItem openItem = new JMenuItem("Open");
        // JMenuItem SaveItem = new JMenuItem("Save");
        // JMenuItem exitItem = new JMenuItem("Exit");
        
        // fileMenu.add(newItem);
        // fileMenu.add(openItem);
        // fileMenu.add(SaveItem);
        // fileMenu.add(exitItem);

        // menuBar.add(fileMenu);
        
        // // JMenuBar editBar = new JMenuBar();
        // JMenu editMenu = new JMenu("Edit");
        
        // JMenuItem undoItem = new JMenuItem("Undo");
        // JMenuItem redoItem = new JMenuItem("Redo");
        // JMenuItem cutItem = new JMenuItem("Cut");
        // JMenuItem copyItem = new JMenuItem("Copy");
        
        // editMenu.add(undoItem);
        // editMenu.add(redoItem);
        // editMenu.add(cutItem);
        // editMenu.add(copyItem);
        
        // menuBar.add(editMenu);
        // JMenu selectionMenu = new JMenu("Selection");

        // JCheckBoxMenuItem fullscreenCheckBox = new JCheckBoxMenuItem("FullScreen");

        // selectionMenu.add(fullscreenCheckBox);

        // menuBar.add(selectionMenu);


        // setJMenuBar(menuBar);
///aja ko code yeta dekhi ho
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem copyIitem = new JMenuItem("Copy");
        JMenuItem cutIitem = new JMenuItem("Cut");
        popupMenu.add(copyIitem);
        popupMenu.add(cutIitem);

        JTextArea textArea = new JTextArea();

        textArea.addMouseListener(
            new MouseAdapter(){
                @Override
                public void mouseReleased(MouseEvent a)
                {
                    if(a.isPopupTrigger())
                    {
                        popupMenu.show(a.getComponent(), a.getX(), a.getY());
                    }
                }
            }
        );

        add(textArea);
            
        setVisible(true);

    }

    public static void main(String[] args) {
        new SwingMenu();
    }
    
}
