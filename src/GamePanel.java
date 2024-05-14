import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        setLayout(new BorderLayout());

        // Central panel for game state
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(1, 2));

        // List of players
        PlayerListPanel playerListPanel = new PlayerListPanel();
        centralPanel.add(playerListPanel);

        // Vote counter
        VoteCounterPanel voteCounterPanel = new VoteCounterPanel();
        centralPanel.add(voteCounterPanel);

        add(centralPanel, BorderLayout.CENTER);

        // Chat panel
        ChatPanel chatPanel = new ChatPanel();
        add(chatPanel, BorderLayout.EAST);

        // Action buttons
        JPanel actionPanel = new JPanel();
        JButton revealRolesButton = new JButton("Reveal Roles");
        JButton nextPhaseButton = new JButton("Next Phase");
        actionPanel.add(revealRolesButton);
        actionPanel.add(nextPhaseButton);
        add(actionPanel, BorderLayout.SOUTH);
    }
}
