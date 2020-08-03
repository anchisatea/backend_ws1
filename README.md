## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

###List of test cases
+ TC01 => create_new_buffer_should_empty
+ TC02 => create_new_buffer_with_default_size_should_10
+ TC03 => write_A_B_to_buffer_should_read_A_B_from_buffer
+ TC04 => write_A_one_time_buffer_should_not_empty
+ TC05 => write_A_ten_time_buffer_should_be_full
+ TC06 => overwrite_A_if_buffer_is_full
