package runner;

import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;

public class Starter {

    public static void main(String[] args) {
       runTest();
    }
    public static String runTest() {
        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        //Get project root path
       // String root = System.getProperty("user.dir");
        suites.add("E:\\autotestframe\\src\\test\\resources\\testNG.xml");
        tng.setTestSuites(suites);
        tng.run();
        return "完成UI测试";
    }

}