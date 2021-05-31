package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

final class RegExTest {

    private RegEx RegExZIP;
    private Long  counter;

    @BeforeEach
    void setUp(){
        this.RegExZIP = new RegEx("53757");
        this.counter  = 0L;
    }


    @AfterEach
    void tearDown(){
        this.RegExZIP = null;
        this.counter  = null;
    }


    @Test
    @DisplayName("test if regular expression for zip's work like intended")
    void testValidateRegExZIP(){
        assertTrue(this.RegExZIP.validateRegExZIP(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for phone numbers work like intended")
    void testValidateRegExPhoneNumber(){
        assertTrue(this.RegExZIP.validateRegExPhoneNumber(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for license plates work like intended")
    void testValidateRegExLicensePlate(){
        assertTrue(this.RegExZIP.validateRegExLicensePlate(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for mail addresses work like intended")
    void testValidateRegExMailAddress(){
        assertTrue(this.RegExZIP.validateRegExMailAddress(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for URLs work like intended")
    void testValidateRegExURL(){
        assertTrue(this.RegExZIP.validateRegExURL(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java dev comments work like intended")
    void testValidateRegExZipJavaDevComment(){
        assertTrue(this.RegExZIP.validateRegExJavaDevComment(), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java class names work like intended")
    void testValidateRegExZipJavaClassName(){
        assertTrue(this.RegExZIP.validateRegExJavaClassName(), "Damn, thats not working like intended! no" + ++counter);
    }

}