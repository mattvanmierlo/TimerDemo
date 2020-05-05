import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {


    public MainFrame(){
        this.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new MainPanel());
        this.pack();
        this.setVisible(true);
    }



    public static void main(String[] args){
        MainFrame myWindow = new MainFrame();
    }
}
