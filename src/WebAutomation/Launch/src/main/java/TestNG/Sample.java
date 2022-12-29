package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {

    @BeforeClass
    void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After class");
    }

    @Test
    void test1(){
        System.out.println("Test1");
    }

    @Test
    void test2(){
        System.out.println("Test2");
    }

    @BeforeSuite
    void beforeSuite(){

    }
}
