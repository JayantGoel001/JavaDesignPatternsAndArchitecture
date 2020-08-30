import javax.swing.*;
import java.awt.*;

class ViewObserver extends JFrame {
    private ModelObserver model;

    public ViewObserver(ModelObserver model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;
    }

}
