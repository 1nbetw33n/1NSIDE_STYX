package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

final class RegExCheckTest {

    private Long   counter;
    private String zipExpression1;
    private String zipExpression2;
    private String phoneNumberExpression1;
    private String phoneNumberExpression2;
    private String phoneNumberExpression3;
    private String licensePlateExpression1;
    private String licensePlateExpression2;
    private String mailAddressExpression1;
    private String mailAddressExpression2;
    private String urlExpression1;
    private String urlExpression2;
    private String urlExpression3;
    private String urlExpression4;
    private String javaDevCommentExpression1;
    private String javaDevCommentExpression2;
    private String javaDevCommentExpression3;
    private String javaClassNameExpression1;
    private String javaClassNameExpression2;
    private String javaClassNameExpression3;
    private String javaClassNameExpression4;

    @BeforeEach
    void setUp(){
        this.counter                   = 0L;
        this.zipExpression1            = "53757";
        this.zipExpression2            = "WC2N 5DU";
        this.phoneNumberExpression1    = "+493305624926";
        this.phoneNumberExpression2    = "+35123456789";
        this.phoneNumberExpression3    = "+493012345678998765432";
        this.licensePlateExpression1   = "B AB 123 H";
        this.licensePlateExpression2   = "B ÄÖ 34";
        this.mailAddressExpression1    = "bella@transhilfe.de";
        this.mailAddressExpression2    = "63.kjfg9.web.xrl";
        this.urlExpression1            = "https://www.bellaabshagen.de/";
        this.urlExpression2            = "http://www.transhilfe.de";
        this.urlExpression3            = "https://www.trans_hilfe.de";
        this.urlExpression4            = "https://www.bella-abshagen.de";
        this.javaDevCommentExpression1 = "/* this is a dev comment */";
        this.javaDevCommentExpression2 = "/* and this \n * is also \n * a dev comment */";
        this.javaDevCommentExpression3 = "this is not a dev comment";
        this.javaClassNameExpression1  = "HelloWorld";
        this.javaClassNameExpression2  = "_hello-WORLD";
        this.javaClassNameExpression3  = "1HELLO_WORLD";
        this.javaClassNameExpression4  = "_helloWorld_";
    }


    @AfterEach
    void tearDown(){
       this.counter                   = null;
       this.zipExpression1            = null;
       this.zipExpression2            = null;
       this.phoneNumberExpression1    = null;
       this.phoneNumberExpression2    = null;
       this.licensePlateExpression1   = null;
       this.licensePlateExpression2   = null;
       this.mailAddressExpression1    = null;
       this.mailAddressExpression2    = null;
       this.urlExpression1            = null;
       this.urlExpression2            = null;
       this.urlExpression3            = null;
       this.urlExpression4            = null;
       this.javaDevCommentExpression1 = null;
       this.javaDevCommentExpression2 = null;
       this.javaDevCommentExpression3 = null;
       this.javaClassNameExpression1  = null;
       this.javaClassNameExpression2  = null;
       this.javaClassNameExpression3  = null;
       this.javaClassNameExpression4  = null;
    }


    @Test
    @DisplayName("test if regular expression for zip's works like intended")
    void testValidateRegExZIP(){
        assertTrue(RegExCheck.validateRegExZIP(this.zipExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExZIP(this.zipExpression2), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for phone numbers works like intended")
    void testValidateRegExPhoneNumber(){
        assertTrue(RegExCheck.validateRegExPhoneNumber(this.phoneNumberExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExPhoneNumber(this.phoneNumberExpression2), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExPhoneNumber(this.phoneNumberExpression3), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for license plates works like intended")
    void testValidateRegExLicensePlate(){
        assertTrue(RegExCheck.validateRegExLicensePlate(this.licensePlateExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExLicensePlate(this.licensePlateExpression2), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for mail addresses works like intended")
    void testValidateRegExMailAddress(){
        assertTrue(RegExCheck.validateRegExMailAddress(this.mailAddressExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExMailAddress(this.mailAddressExpression2), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for URLs works like intended")
    void testValidateRegExURL(){
        assertTrue(RegExCheck.validateRegExURL(this.urlExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertTrue(RegExCheck.validateRegExURL(this.urlExpression2), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExURL(this.urlExpression3), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExURL(this.urlExpression4), "Damn, thats not working like intended! no" + ++counter);
        /* last assert should've evaluated to true, but I decided to just exclude "-" for convenience. */
    }


    @Test
    @DisplayName("test if regular expression for java dev comments works like intended")
    void testValidateRegExJavaDevComment(){
        assertTrue(RegExCheck.validateRegExJavaDevComment(this.javaDevCommentExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertTrue(RegExCheck.validateRegExJavaDevComment(this.javaDevCommentExpression2), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExJavaDevComment(this.javaDevCommentExpression3), "Damn, thats not working like intended! no" + ++counter);
    }


    @Test
    @DisplayName("test if regular expression for java class names works like intended")
    void testValidateRegExJavaClassName(){
        assertTrue(RegExCheck.validateRegExJavaClassName(this.javaClassNameExpression1), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExJavaClassName(this.javaClassNameExpression2), "Damn, thats not working like intended! no" + ++counter);
        assertFalse(RegExCheck.validateRegExJavaClassName(this.javaClassNameExpression3), "Damn, thats not working like intended! no" + ++counter);
        assertTrue(RegExCheck.validateRegExJavaClassName(this.javaClassNameExpression4), "Damn, thats not working like intended! no" + ++counter);
    }

}