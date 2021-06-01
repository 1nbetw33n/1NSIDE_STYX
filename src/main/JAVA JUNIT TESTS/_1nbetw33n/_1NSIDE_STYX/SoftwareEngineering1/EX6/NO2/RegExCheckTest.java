package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

final class RegExCheckTest {

    private Long  counter;
    private String zipExpression;
    private String phoneNumberExpression;
    private String licensePlateExpression;
    private String mailAddressExpression;
    private String urlExpression;
    private String javaDevCommentExpression1;
    private String javaDevCommentExpression2;
    private String javaClassNameExpression;

    @BeforeEach
    void setUp(){
        this.counter                   = 0L;
        this.zipExpression             = "53757";
        this.phoneNumberExpression     = "+493305624926";
        this.licensePlateExpression    = "B AB 123 H";
        this.mailAddressExpression     = "a.ab@mail.de";
        this.urlExpression             = "https://www.bellaabshagen.de/";
        this.javaDevCommentExpression1 = "/* this is also a dev comment */";
        this.javaDevCommentExpression2 = "/* and this \n * is also still \n * a dev comment */";
        this.javaClassNameExpression   = "";
    }


    @AfterEach
    void tearDown(){
       this.counter                   = null;
       this.zipExpression             = null;
       this.phoneNumberExpression     = null;
       this.licensePlateExpression    = null;
       this.mailAddressExpression     = null;
       this.urlExpression             = null;
       this.javaDevCommentExpression1 = null;
       this.javaDevCommentExpression2 = null;
       this.javaClassNameExpression   = null;
    }


    @Test
    @DisplayName("test if regular expression for zip's work like intended")
    void testValidateRegExZIP(){
        assertTrue(RegExCheck.validateRegExZIP(this.zipExpression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for phone numbers work like intended")
    void testValidateRegExPhoneNumber(){
        assertTrue(RegExCheck.validateRegExPhoneNumber(this.phoneNumberExpression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for license plates work like intended")
    void testValidateRegExLicensePlate(){
        assertTrue(RegExCheck.validateRegExLicensePlate(this.licensePlateExpression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for mail addresses work like intended")
    void testValidateRegExMailAddress(){
        assertTrue(RegExCheck.validateRegExMailAddress(this.mailAddressExpression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for URLs work like intended")
    void testValidateRegExURL(){
        assertTrue(RegExCheck.validateRegExURL(this.urlExpression), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java dev comments work like intended")
    void testValidateRegExJavaDevComment(){
        assertTrue(RegExCheck.validateRegExJavaDevComment(this.javaDevCommentExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertTrue(RegExCheck.validateRegExJavaDevComment(this.javaDevCommentExpression2), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java class names work like intended")
    void testValidateRegExJavaClassName(){
        assertTrue(RegExCheck.validateRegExJavaClassName(this.javaClassNameExpression), "Damn, thats not working like intended! no" + ++counter);
    }

}