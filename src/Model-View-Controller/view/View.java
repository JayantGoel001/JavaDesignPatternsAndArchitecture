import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class View extends JFrame implements ActionListener {
    private final JTextField nameField;
    private final JPasswordField passField;

    private LoginListener loginListener;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");

        nameField = new JTextField(10);
        passField = new JPasswordField(10);
        JButton okButton = new JButton("OK");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.LAST_LINE_END;
        gc.gridx=1;
        gc.gridy=1;
        gc.weightx=1;
        gc.weighty=1;
        gc.insets = new Insets(100, 0, 0, 10);
        gc.fill=GridBagConstraints.NONE;

        add(new JLabel("Name: "), gc);

        gc.anchor = GridBagConstraints.LAST_LINE_START;
        gc.gridx=2;
        gc.gridy=1;
        gc.weightx=1;
        gc.weighty=1;
        gc.insets = new Insets(100, 0, 0, 0);
        gc.fill=GridBagConstraints.NONE;

        add(nameField, gc);

        gc.anchor = GridBagConstraints.LINE_END;
        gc.gridx=1;
        gc.gridy=2;
        gc.weightx=1;
        gc.weighty=1;
        gc.insets = new Insets(0, 0, 0, 10);
        gc.fill=GridBagConstraints.NONE;

        add(new JLabel("Password: "), gc);

        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx=2;
        gc.gridy=2;
        gc.weightx=1;
        gc.weighty=1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.fill=GridBagConstraints.NONE;

        add(passField, gc);

        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.gridx=2;
        gc.gridy=3;
        gc.weightx=1;
        gc.weighty=100;
        gc.fill=GridBagConstraints.NONE;

        add(okButton, gc);

        okButton.addActionListener(this);

        Database db = Database.getInstance();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                db.connect();
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                db.disconnect();
                super.windowClosed(e);
            }
        });
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String password = new String(passField.getPassword());
        String name = nameField.getText();

        fireLoginEvent(new LoginFormEvent(name, password));
    }
    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }

    public void fireLoginEvent(LoginFormEvent event) {
        if(loginListener != null) {
            loginListener.loginPerformed(event);
        }
    }
}
