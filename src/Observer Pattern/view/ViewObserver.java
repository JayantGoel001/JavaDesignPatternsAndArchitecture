import javax.swing.*;
import java.awt.*;

class ViewObserver extends JFrame {
    private ModelObserver model;

    public ViewObserver(ModelObserver model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridheight = 0;
        gc.gridwidth = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
