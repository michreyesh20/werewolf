import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        setTitle("Werewolf Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Set layout
        setLayout(new BorderLayout());

        // Add menu bar
        setJMenuBar(new MenuBar());

        // Add main game panel
        GamePanel gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
