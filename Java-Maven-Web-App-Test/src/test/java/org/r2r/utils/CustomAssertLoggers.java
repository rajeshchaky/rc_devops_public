package org.r2r.utils;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class CustomAssertLoggers {
    private static final Logger log = LogManager.getLogger();

    public static void assertEquals(String text,String expected,String actual){
        log.info(text);
        ExtentCucumberAdapter.addTestStepLog(text);
        Assert.assertEquals("",expected,actual);
    }
    public static void assertPass(String text){
        log.info(text);
        ExtentCucumberAdapter.addTestStepLog(text);
    }
    public static void assertFail(String text){
        log.info(text);
        ExtentCucumberAdapter.addTestStepLog(text);
        Assert.fail(text);
    }
}
