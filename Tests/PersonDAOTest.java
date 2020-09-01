import org.junit.*;

class PersonDAOTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        Database.getInstance().connect();
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        Database.getInstance().disconnect();
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("Set Up");
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("Tear Down");
    }
    @Test
    public void testDemo(){
        int value = 2;
        value+=7;
        Assert.assertEquals("Check ",9,value);
    }
    @Test
    public void testCreate(){
        Person p1 = new Person("Bob","letmein");
        Person p2 = new Person("Sue","Hello");
    }
}