package greetingsUtil;

import static org.junit.Assert.*;
import org.junit.*;

public class GreetingsUtilTest {
	static GreetingsUtil gu;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		gu = new GreetingsUtil();
	
	}

	@Before
	public void setUp() throws Exception {
	   //gu.ChangeState();
		
	}
	@Test
	public void test() {
		
		Assert.assertEquals(gu.Hello(), "You already said that");//enter state :coming,Exit state:coming.
		System.out.println("Test Success :As user is already present inside the system(been told Hi), answer will be already said:"+ gu.currentState);
		
		Assert.assertEquals(gu.GoodBye(),"bye");//enter State= coming,exit state: going
		System.out.println("Test Success: User already present must go out, they have to say BYE:"+ gu.currentState);
			
		Assert.assertEquals(gu.GoodBye(),"You already said that");//enter state: going, exit state:going
	    System.out.println("Test Success: Once user out of the System means already bid bye:"
	    		+ gu.currentState);
	    
	    Assert.assertEquals(gu.Hello(),"Hi!");//enter state:going, exit state:coming.
		System.out.println("Test Success:User coming new:"+ gu.currentState);
	}
	
	@Test
	public void testNull() {
		gu.currentState = "";
		Assert.assertEquals(gu.GoodBye(), "bye");
		System.out.println("Exception");
		
	}
	//@Test{
	
		//fail("Your tests here");
	//}
	
	
	@After
	public void tearDown() throws Exception {
		gu.ChangeState();
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	
	

}
