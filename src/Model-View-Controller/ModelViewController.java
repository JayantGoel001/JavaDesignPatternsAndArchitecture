import javax.swing.*;

public class ModelViewController {
    public static void main(String[] args){
        SwingUtilities.invokeLater(ModelViewController::runApp);
    }

    public static void runApp(){
        Model model = new Model();
        View view = new View(model);

        Controller controller = new Controller(model,view);

    }
}
