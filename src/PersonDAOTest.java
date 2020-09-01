import org.junit.*;

import static org.junit.Assert.fail;

class PersonDAOTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{

    }
    @Before
    public void setUp() throws Exception{

    }
    @After
    public void tearDown() throws Exception{

    }
    @Test
    public void test(){
        int value = 2;
        value+=7;
        Assert.assertEquals("Check ",9,value);
    }
}