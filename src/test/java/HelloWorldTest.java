import org.junit.Test;
import org.junit.Assert;

public class HelloWorldTest {
    private HelloWorld hw = new HelloWorld();

    @Test
    public void say() {
        Assert.assertEquals("Hello World!", hw.say());
    }
}