import java.sql.SQLException;

public class Controller implements LoginListener{
    private final PersonDAO personDAO = new PersonDAO();
    public Controller(Model model, View view) {
    }

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login Received ::\n"+event.getName()+" : "+event.getPassword());
        try {
            personDAO.addPerson(new Person(event.getName(), event.getPassword()));
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

    }
}
