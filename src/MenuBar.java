import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu gameMenu = new JMenu("Game");

        JMenuItem startItem = new JMenuItem("Start");
        JMenuItem optionsItem = new JMenuItem("Options");
        JMenuItem rulesItem = new JMenuItem("Rules");
        JMenuItem exitItem = new JMenuItem("Exit");

        gameMenu.add(startItem);
        gameMenu.add(optionsItem);
        gameMenu.add(rulesItem);
        gameMenu.add(exitItem);

        add(gameMenu);
    }
}
