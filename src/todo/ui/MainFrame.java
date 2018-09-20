package todo.ui;

import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    public void init(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(60,400));
        setVisible(true);
        setState(Frame.NORMAL);
        //setTitle("Ishan Test");
        //show();
    }
}
