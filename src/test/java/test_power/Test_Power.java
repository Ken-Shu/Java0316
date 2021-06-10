package test_power;

import com.ocp.day29_assert.Power;
import org.junit.Assert;
import org.junit.Test;

public class Test_Power {

Power power= new Power();
    @Test
    public void t1() {
        int A = 20;
        int V = 10;
        int ext_W = 200; // 期望
        int t1 = power.getW(V, A); // 實際
        Assert.assertEquals(ext_W,t1);
    }
     @Test
    public void t2() {
        int W = 20;
        int V = 10;
        int ext_A = 2; // 期望
        int t2 = power.getA(V, W); // 實際
        Assert.assertEquals(ext_A,t2);
    }
     @Test
    public void t3() {
        int A = 20;
        int W = 200;
        int ext_V = 10; // 期望
        int t3 = power.getV(W, A); // 實際
        Assert.assertEquals(ext_V,t3);
    }
}
