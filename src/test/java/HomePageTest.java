import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    void verifyTitle() {
        System.out.println(prop.getProperty("Name"));
    }

    @Test
    public void test115() {
        Assert.assertEquals(2 + 2, 4, "Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test113() {
        Assert.assertEquals(2 + 2, 4, "Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test112() {
        Assert.assertEquals(2 + 2, 5, "Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test111() {
        Assert.assertEquals(2 + 2, 4, "Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test110() {
        Assert.assertEquals(2 + 2, 4, "Addition Problem! 2+2 must be 4!\n");
    }
    @Test
    public void test2110() {
        Assert.assertEquals(2 + 2, 4, "Addition Problem! 2+2 must be 4!\n");
    }

}