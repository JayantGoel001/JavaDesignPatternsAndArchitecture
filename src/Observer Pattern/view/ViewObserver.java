import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ViewObserver extends JFrame implements ActionListener {
    private final JButton helloButton;

    public ViewObserver(ModelObserver model) throws HeadlessException {
        super("MVC Demo");

        helloButton = new JButton("CLick Me");
        JButton goodbyeButton = new JButton("CLick Me");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(helloButton,gc);

        gc.anchor = GridBagConstraints.CENTER;
        gc.gridx = 1;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(goodbyeButton,gc);

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        goodbyeButton.addActionListener(e -> {
            System.out.println("Goodbye");
        });

        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (source == helloButton)
        {
            System.out.println("Hello World");
        }
        else {
            System.out.println("Some Other Button.");
        }
    }
}
