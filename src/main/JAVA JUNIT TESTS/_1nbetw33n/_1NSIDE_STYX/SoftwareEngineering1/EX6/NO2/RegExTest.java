package _1nbetw33n._1NSIDE_STYX.SoftwareEngineering1.EX6.NO2;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

final class RegExTest {

    private Regex RegExZIP;

    @BeforeEach
    void setUp(){
        this.RegExZIP = new Regex("53757");
    }


    @AfterEach
    void tearDown(){
        this.RegExZIP = null;
    }


    @Test
    @DisplayName("test if regular expression for zip's work like intended")
    void testRegExZIP(){
    }


    @Test
    @DisplayName("test if regular expression for phone numbers work like intended")
    void testRegExPhoneNumber(){
    }


    @Test
    @DisplayName("test if regular expression for license plates work like intended")
    void testRegExLicensePlate(){
    }


    @Test
    @DisplayName("test if regular expression for mail addresses work like intended")
    void testRegExZipMailAddress(){
    }


    @Test
    @DisplayName("test if regular expression for URLs work like intended")
    void testRegExURL(){
    }


    @Test
    @DisplayName("test if regular expression for java dev comments work like intended")
    void testRegExZipJavaDevComment(){
    }


    @Test
    @DisplayName("test if regular expression for java class names work like intended")
    void testRegExZipJavaClassName(){
    }

}