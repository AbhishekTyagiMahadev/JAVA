// Program for event handling using  applet
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingApplet extends Applet implements ActionListener {
    Button button;
    Label label;

    @Override
    public void init() {
        // Create a button and a label
        button = new Button("Click Me");
        label = new Label("Button not clicked yet.");

        // Add the button and label to the applet
        add(button);
        add(label);

        // Add ActionListener to the button
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
        if (e.getSource() == button) {
            label.setText("Button clicked!");
        }
    }
}