import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
    }

}
