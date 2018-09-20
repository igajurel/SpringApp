package todo.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import java.io.File;

public class Launcher {
    public void launch(){
        String[] contextPath = new String[]{"app-context.xml"};
        //System.out.println("ClassPath = "+contextPath.getPath());
        new ClassPathXmlApplicationContext(contextPath);
    }
}
