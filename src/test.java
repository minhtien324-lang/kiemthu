import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    @Test
    public void Test1() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 10));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 9.9));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 5.0));
    }

    @Test
    public void Test4() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 0.1));
    }

    @Test
    public void Test5() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 0));
    }

    @Test
    public void Test7() {
        Assert.assertEquals("Di choi", main.result("Troi nang", 9.9));
    }

    @Test
    public void Test8() {
        Assert.assertEquals("Hoc bai", main.result("Troi nang", 5.0));
    }

    @Test
    public void Test9() {
        Assert.assertEquals("Hoc bai", main.result("Troi nang", 0.1));
    }

    @Test
    public void Test10() {
        Assert.assertEquals("Hoc bai", main.result("Troi nang", 0));
    }

    @Test
    public void Test11() {
        Assert.assertEquals("Invalid Input", main.result("Troi nang", -1));
    }

    @Test
    public void Test12() {
        Assert.assertEquals("Hoc bai", main.result("Troi nang", 6));
    }

    @Test
    public void Test13() {
        Assert.assertEquals("Di choi", main.result("Troi nang", 8));
    }

    @Test
    public void Test15() {
        Assert.assertEquals("Invalid Input", main.result("Troi nang", 10.1));
    }

    @Test
    public void Test16() {
        Assert.assertEquals("Invalid Input", main.result("Troi mua", -1));
    }

    @Test
    public void Test17() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 5));
    }

    @Test
    public void Test18() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 8));
    }

    @Test
    public void Test19() {
        Assert.assertEquals("Hoc bai", main.result("Troi mua", 10));
    }

    @Test
    public void Test20() {
        Assert.assertEquals("Invalid Input", main.result("Troi mua", 11));
    }
}

