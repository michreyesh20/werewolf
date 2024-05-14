import javax.swing.*;
import java.awt.*;

public class RoleCard extends JPanel {
    private String role;
    private String iconPath;

    public RoleCard(String role, String iconPath) {
        this.role = role;
        this.iconPath = iconPath;
        initialize();
    }

    private void initialize() {
        setLayout(new BorderLayout());
        JLabel iconLabel = new JLabel(new ImageIcon(iconPath));
        JLabel roleLabel = new JLabel(role, SwingConstants.CENTER);

        add(iconLabel, BorderLayout.CENTER);
        add(roleLabel, BorderLayout.SOUTH);
    }
}
