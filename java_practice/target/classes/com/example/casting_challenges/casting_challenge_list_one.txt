/* --1. Challenge: Perform typecasting of:
        A double to int.
        An int to double. 
--2. Challenge: Write a program that accepts two numbers, one as an integer and the other as a double. Perform addition, subtraction, multiplication, 
    and division, ensuring both numbers are cast to the same type before each operation.
        Hint: Use explicit typecasting to ensure consistent data types during operations.
            Example inputs: int num1 = 10; double num2 = 3.5;
            Expected output: Results of all operations with proper typecasting.        
--3. Challenge: Create an array of doubles and an array of integers. Write a program to cast each element in the double array to an integer and store it in the integer array.
        Hint: Use a loop for array traversal and cast each double element explicitly.
            Example: double[] doubles = {1.5, 2.8, 3.9}; Output: int[] ints = {1, 2, 3};
--4. Challenge: Write a program to read user input as a string. Try to cast the input to an integer and a double. If the input cannot be cast, handle the exception gracefully and print an error message.
        Hint: Use try-catch blocks to handle exceptions like NumberFormatException.  
            Example Input: "123abc"; Output: "Cannot cast to int or double."  
--5. Challenge: Create a superclass Animal and subclasses Dog and Cat. Create a list of Animal objects, and use explicit typecasting to call subclass-specific methods (e.g., bark() for Dog and meow() for Cat).
        Hint: Use the instanceof operator to check the object type before casting.     
            Example: Animal animal = new Dog(); if (animal instanceof Dog) { ((Dog) animal).bark(); }       
*/