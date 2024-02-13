## String Functions:
1. **charAt(int index):** This function returns the character at the specified index within a string. For example:
   ```java
   String str = "Hello";
   char ch = str.charAt(0); // ch will be 'H'
   ```

2. **length():** This function returns the length of the string. For example:
   ```java
   String str = "Hello";
   int len = str.length(); // len will be 5
   ```

3. **equals(String str):** This function is used to compare two strings for equality. It returns true if the strings are equal, otherwise false. For example:
   ```java
   String str1 = "Hello";
   String str2 = "World";
   boolean isEqual = str1.equals(str2); // isEqual will be false
   ```

### Important Functions:
1. **public void run():** This method is part of the `Runnable` interface and is used to define the entry point for a thread. When a class implements the `Runnable` interface and creates a thread, the `run()` method is invoked when the thread is started. You override this method with the code you want to run in the new thread.

2. **thread_obj.start():** This method is used to start the execution of a thread. Once a thread is started, the JVM calls the `run()` method of the thread.

3. **Random obj = new Random():** This line creates a new instance of the `Random` class, which is used to generate random numbers.

4. **obj.nextInt(bound):** This method is used to generate a random integer between 0 (inclusive) and the specified bound (exclusive). For example:
   ```java
   Random obj = new Random();
   int randomNumber = obj.nextInt(10); // randomNumber will be between 0 and 9
   ```

5. **synchronized:** This keyword is used in Java to control access to shared resources in a multithreaded environment. It can be applied to methods or blocks of code. When a method is marked as `synchronized`, only one thread can execute it at a time, which helps in preventing data corruption and ensuring thread safety. However, it's worth noting that `synchronized` can be used with both methods and blocks of code, not just methods.

### `File Handling Methods in Java`

### `.read()`

The `.read()` method is used to read data from an input source, such as a file, input stream, or network connection. It is primarily used in conjunction with input streams, such as `InputStream` or `Reader`. The method signature and behavior depend on the specific class implementing it, but generally, it reads a single byte or a block of bytes from the input source and returns the data read.

For example, in `InputStream`, the `.read()` method reads the next byte of data from the input stream and returns it as an `int` value. It returns `-1` if the end of the stream is reached.

```java
InputStream inputStream = new FileInputStream("example.txt");
int byteRead = inputStream.read();
while (byteRead != -1) {
    // Process the byte read
    System.out.print((char) byteRead); // Convert byte to char and print
    byteRead = inputStream.read(); // Read next byte
}
inputStream.close(); // Close the stream after reading
```

### `.write()`

The `.write()` method is used to write data to an output destination, such as a file, output stream, or network connection. It is commonly used in conjunction with output streams, such as `OutputStream` or `Writer`. The method signature and behavior depend on the specific class implementing it, but generally, it writes a single byte or a block of bytes to the output destination.

For example, in `OutputStream`, the `.write()` method writes the specified byte to the output stream.

```java
OutputStream outputStream = new FileOutputStream("output.txt");
byte[] data = "Hello, World!".getBytes(); // Convert string to byte array
outputStream.write(data); // Write byte array to output stream
outputStream.close(); // Close the stream after writing
```

### Common Usage

These methods are fundamental building blocks for handling input and output operations in Java. They are often used when working with files, network communication, serialization, and other I/O-related tasks. By using these methods, Java programs can efficiently read data from input sources and write data to output destinations.

It's important to handle exceptions that may occur during I/O operations, such as `IOException`, by using try-catch blocks or declaring them in method signatures. Additionally, resources like input and output streams should be properly closed after use to release system resources and prevent memory leaks.
