package todo.ui;

import java.awt.Component;
import java.util.Iterator;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BoxLayoutPanel extends JPanel{

    private int axis1;
    private List panelComponents1;

    public void setAxis1(int axis){
        this.axis1 = axis;
    }

    public void setPanelComponents1(List panelComponents){
        this.panelComponents1 = panelComponents;
    }

    public void init(){
        setLayout(new BoxLayout(this, axis1));
        for (Iterator it = panelComponents1.iterator(); it.hasNext();){
            Component c = (Component) it.next();
            add(c);
        }
    }

}
