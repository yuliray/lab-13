import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleFrame extends Frame {
    SimpleFrame(String s) {
        super(s);
        setSize(400, 150);
        Button button = new Button("start");
        Label label = new Label("label");
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleFrame("Моя программа");
    }
}