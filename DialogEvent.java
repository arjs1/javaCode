
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogEvent extends JFrame {

    public DialogEvent() {

        setTitle(" Dialogue Box");
        setSize(1080, 1920);
        JFrame frame = new JFrame("Option with input dialog example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object[] options = {"Yes" ,"No"};
        JButton onpressButton = new JButton("Click Me!");
        add(onpressButton);
        onpressButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a)
            {
                int optionResult = JOptionPane.showOptionDialog(frame ,"Do you want to exit?", "Choose Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                
                if(optionResult == JOptionPane.NO_OPTION)
                {
                    
                }
                else{
                    System.err.println("Yes");
                
                    System.exit(0);
                }
                
            }
        });
        setVisible(true);
    
    }
    public static void main(String[] args) {
        new DialogEvent();
    }
    
}
