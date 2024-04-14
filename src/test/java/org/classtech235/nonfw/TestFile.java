package org.classtech235.nonfw;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFile {

    @Test
    public void addCheck(int a, int b){
        Assert.assertEquals(b + a, a + b, "else not equal");
    }
}
