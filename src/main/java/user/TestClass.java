package user;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }
}
