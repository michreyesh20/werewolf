import javax.swing.*;
import java.awt.*;

public class PlayerListPanel extends JPanel {
    public PlayerListPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createTitledBorder("Players"));

        for (int i = 1; i <= 8; i++) {
            JLabel playerLabel = new JLabel("Player " + i);
            add(playerLabel);
        }
    }
}
