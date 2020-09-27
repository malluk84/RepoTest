package calc;

import org.junit.jupiter.api.*;

class LifeCycleTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is called ONCE before all test");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("This is called before each test");
    }

    @Test
    void testadd() {
        System.out.println("1");
    }
    @Test
    void testadd2() {
        System.out.println("2");
    }
    @Test
    void testadd3() {
        System.out.println("3");
    }

    @AfterEach
    void afterEach() {
        System.out.println("This is called after each test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is called ONCE after all test");
    }





}
