import javax.swing.*;
import java.awt.*;

public class VoteCounterPanel extends JPanel {
    public VoteCounterPanel() {
        setLayout(new GridLayout(8, 2));
        setBorder(BorderFactory.createTitledBorder("Vote Counter"));

        for (int i = 1; i <= 8; i++) {
            JLabel playerLabel = new JLabel("Player " + i);
            JTextField voteField = new JTextField("0");
            add(playerLabel);
            add(voteField);
        }
    }
}
