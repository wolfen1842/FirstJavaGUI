import javax.swing.*;

public class FirstGUIApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java GUI Application");
        JLabel label = new JLabel("I am loving creating Java Applications");
        frame.add(label);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
