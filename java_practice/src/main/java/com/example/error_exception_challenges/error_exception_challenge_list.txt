/* 
--1. Challenge: Demonstrate how to handle an OutOfMemoryError by allocating large memory in a controlled manner. 
--2. Challenge: Write a program to deliberately cause a StackOverflowError by creating a method that recursively calls itself without a proper base case. 
        Handle the error using a try-catch block and print a message when the error occurs.
        Hint: Design the recursion to intentionally run infinitely until the stack overflows.
            Input: None
            Output: "StackOverflowError: Recursive call limit exceeded"
--3. Challenge: Create a program that demonstrates a memory leak using a collection, such as an ArrayList, by continuously adding elements without proper 
    removal or termination. After simulating the issue, refactor the code to handle the memory leak and prevent the OutOfMemoryError.
        Hint: Use a loop to keep adding elements indefinitely and monitor memory usage.
            Input: None
            Output: "OutOfMemoryError: Java heap space" (before fix)
                    "Program runs efficiently" (after fix)
-4. Challenge: Write a program that allocates memory incrementally (e.g., by creating large arrays or objects). 
    Use the Runtime class to monitor memory usage during the program’s execution and print the memory consumed at each step.
        Hint: Use Runtime.getRuntime().totalMemory() and Runtime.getRuntime().freeMemory() to calculate memory usage.
            Input: None
            Output: Memory usage increases after each allocation step        
-5. Challenge: Build a MemoryManager class that controls memory allocation for an application. Use this class to allocate memory for arrays or objects, 
    track memory usage, and release memory when needed. Throw a custom exception MemoryExceededException if memory usage exceeds a predefined limit.
        Hint: Use a field to track allocated memory and a throw statement to enforce the limit.            
            Input: Allocate 50MB, Allocate 100MB (limit = 100MB)
            Output: Exception: "MemoryExceededException: Allocation exceeds memory limit"
*/