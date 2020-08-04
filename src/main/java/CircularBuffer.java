public class CircularBuffer {

    private final int bufferSize;
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    // Default Constructor
    public CircularBuffer() {
        this(10);
    }

   // Overload constructor
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {

        // return bufferSize == 10;
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        // bufferSize--;
        this.buffer[writePointer++] = input;
        if(writePointer == 10) {
            writePointer = 0;
        }
    }

    public boolean isFull() {
        // return bufferSize == 0;
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
