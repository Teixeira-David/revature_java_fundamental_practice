/* 
--1. Challenge: Declare and initialize variables of all primitive data types, then print their default or assigned values. 
--2. Challenge: Write a program to demonstrate type promotion in arithmetic operations and explicit type conversion. Use different primitive data types 
    (e.g., byte, short, int, float, and double) to perform calculations and cast the result to another type.
        Hint: Show how smaller data types are promoted to larger types in mixed expressions.
            Example:
            Input: byte b = 10; int i = 20; double d = 15.5;
            Output: 45.5 (double result from b + i + d)        
--3. Challenge: Create arrays of different primitive data types (e.g., int[], double[], char[]) with 10 elements each. Calculate and display the memory used by each array.
        Hint: Use size of data type x number of elements to estimate memory usage.            
            Output:
            Memory used by int array: 40 bytes
            Memory used by double array: 80 bytes
            Memory used by char array: 20 bytes        
--4. Challenge: Write a program to simulate overflow and underflow for primitive data types like byte and short. Show how values wrap around when they exceed their maximum or minimum limits.
        Hint: Use the maximum and minimum constants of wrapper classes (e.g., Byte.MAX_VALUE) to trigger overflow and underflow.
            Example:
            Input: byte b = 127;
            Output: Overflow: -128
            Input: byte b = -128;
            Output: Underflow: 127        
--5. Challenge: Write a program to demonstrate conversion between primitives and String.
        Convert String to each primitive type using parsing methods (e.g., Integer.parseInt()).
        Convert primitives back to String using String.valueOf() or concatenation.
        Hint: Handle potential exceptions (e.g., NumberFormatException) gracefully during parsing.            
            Input: String str = "123";
            Output: int: 123, double: 123.0, boolean: true (from "true")
            String from int: "123"        
*/