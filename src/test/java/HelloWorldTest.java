import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World",result);

    }
    @Test
    public void sayHi_with_anchisa_should_return_Hello_World_Anchisa() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Anchisa");
        assertEquals("Hello Anchisa", result);
    }

    @Test
    public void sayHi_with_fah_should_return_Hello_World_Fah() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("Fah");
        assertEquals("Hello Fah", result);
    }
}