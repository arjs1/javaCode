
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Layout {
    public static void main(String[] args) {
        JFrame customFrame = new JFrame();
        JTextArea textArea = null;
        JScrollPane sp = null;

        customFrame.setSize(1000,4000);
        customFrame.setTitle("Custom Layout");
        customFrame.setVisible(true);
        customFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea(2, 10);
        sp = new JScrollPane(textArea);
        customFrame.add(sp);
    }
}
