package test_rice;

import org.junit.Test;
import com.lab.rice.Util;

public class Test_Util {

    @Test
    public void test_getJson() throws Exception {
        String json = Util.getJson();
        System.out.println(json);
    }
}
