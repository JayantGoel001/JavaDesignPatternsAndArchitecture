public class DAOFactory {
    public static PersonDAO getPersonDAO(){
        return new PersonDAO();
    }
}
