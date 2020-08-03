import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    @Test
    public void create_new_buffer_should_empty() {
        CircularBuffer cb = new CircularBuffer();
        boolean result = cb.isEmpty();
        assertTrue("Buffer is not empty", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
    }

    @Test
    public void write_A_one_time_buffer_should_not_empty() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        boolean result = cb.isEmpty();
        assertFalse("Buffer is not empty", result);
    }

    @Test
    public void write_A_ten_time_buffer_should_be_full () {
        CircularBuffer cb = new CircularBuffer();
        for(int i = 0; i<10;i++){
            cb.writeData(Integer.toString(i));
        }
        assertTrue(cb.isFull());
    }


    @Test
    public void overwrite_A_if_buffer_is_full () {
        CircularBuffer cb = new CircularBuffer();
        for(int i = 0; i<10 ; i++) {
            cb.writeData("A" + i);
        }
        cb.writeData("B");
        assertEquals("B", cb.readData());
    }

}