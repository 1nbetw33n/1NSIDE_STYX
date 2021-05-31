package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

final class RegExTest {

    private Long  counter;
    private String expression;

    @BeforeEach
    void setUp(){
        this.expression = "53757";
        this.counter  = 0L;
    }


    @AfterEach
    void tearDown(){
        this.expression = null;
        this.counter  = null;
    }


    @Test
    @DisplayName("test if regular expression for zip's work like intended")
    void testValidateRegExZIP(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for phone numbers work like intended")
    void testValidateRegExPhoneNumber(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for license plates work like intended")
    void testValidateRegExLicensePlate(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for mail addresses work like intended")
    void testValidateRegExMailAddress(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for URLs work like intended")
    void testValidateRegExURL(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java dev comments work like intended")
    void testValidateRegExZipJavaDevComment(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java class names work like intended")
    void testValidateRegExZipJavaClassName(){
        assertTrue(RegExCheck.validateRegExZIP(expression), "Damn, thats not working like intended! no" + ++counter);
    }

}