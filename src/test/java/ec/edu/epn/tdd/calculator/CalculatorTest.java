package ec.edu.epn.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest extends Calculator {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        c= new Calculator();
        System.out.println("setUp()");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        System.out.println("Test 1");
        assertEquals(6,c.adition(4,2));
    }

    @Test
    public void given_two_integers_when_substraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(2,c.substraction(4,2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception(){
        System.out.println("Test 3");
        assertEquals(3,c.division(6,0));
    }

    @Test
    public void given_two_integers_when_multiplication_then_timeout(){
        System.out.println("Test 4");
        assertEquals(8,c.multiplication(4,2));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAns(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }

}