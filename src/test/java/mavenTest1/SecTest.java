package mavenTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecTest {
    @Test
    public void  check()
    {
        System.out.println("hi...");
        System.out.println("hi...viji");
        System.out.println("hi...576");
        Assert.fail();
    }
}
