import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    JLabel counter = new JLabel("COUNTER");
    JLabel countTime = new JLabel();
    private Timer myTimer;
    private int count = 0;

    public MainPanel(){
        this.setPreferredSize(new Dimension(500,500));
        this.add(counter);
        this.add(countTime);
        // Make the timer
        myTimer = new Timer(1000, new TimerListener());
        // Start the timer
        myTimer.start();
        // Stop the timer
        // myTimer.stop();
        this.setVisible(true);
    }

    private class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            count += 1;
            countTime.setText("" + count);
        }
    }
}
