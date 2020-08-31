public class Database {
    private static final Database instance = new Database();
    private Database() {

    }

    public static Database getInstance(){
        return instance;
    }

    private static Database instanceOld;

    public static Database getInstanceOld(){
        if (instanceOld==null){
            instanceOld = new Database();
        }
        return instanceOld;
    }

    public void connect(){
        System.out.println("Connected");
    }
    public void disconnect(){
        System.out.println("DisConnected");
    }
}
