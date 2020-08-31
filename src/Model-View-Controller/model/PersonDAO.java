import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonDAO {
    //CRUD = create,read,update and delete
    public void addPerson(Person person) throws SQLException {
        Connection conn = Database.getInstance().getConnection();
        PreparedStatement p = conn.prepareStatement("insert into people(name,password) values (?,?)");
        p.setString(1, person.getName());
        p.setString(2, person.getPassword());
        p.executeUpdate();
        p.close();
    }

    public Person getPerson(int id){
        return null;
    }

    public List<Person> getPeople(){
        return null;
    }

    public void updatePerson(Person person){

    }

    public void deletePerson(int id){

    }
}