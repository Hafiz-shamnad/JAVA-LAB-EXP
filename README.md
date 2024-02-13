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
