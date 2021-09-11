package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import user.TestClass;
import user.TestMethodInfo;

import java.lang.reflect.Method;

public class TestListenerImpl implements ITestListener {
    public TestListenerImpl() {
    }

    @Override
    public void onStart(ITestContext context) {
        for (Method method :  TestClass.class.getDeclaredMethods()){
            if (method.isAnnotationPresent(TestMethodInfo.class)) {
                TestMethodInfo info = method.getAnnotation(TestMethodInfo.class);
                System.out.println("priority = "+ info.priority());
                System.out.println("Author = "+ info.author());
                System.out.println("lastModified = "+ info.lastModified());
            }
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method");
    }
}