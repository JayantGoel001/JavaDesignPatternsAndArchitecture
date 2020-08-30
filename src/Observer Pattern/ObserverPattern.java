import javax.swing.*;

public class ObserverPattern {
    public static void main(String[] args){
        SwingUtilities.invokeLater(ObserverPattern::runApp);
    }

    private static void runApp() {
        ModelObserver model = new ModelObserver();
        ViewObserver view = new ViewObserver(model);

        ControllerObserver controllerObserver = new ControllerObserver(model,view);
    }
}
