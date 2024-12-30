/* 
--1. Challenge: Write a program that demonstrates:
        A checked exception (e.g., FileNotFoundException).
        An unchecked exception (e.g., ArithmeticException).
--2. Challenge: Write a program that reads a file and performs a division operation. Demonstrate handling of both a checked exception (e.g., FileNotFoundException) 
    and an unchecked exception (e.g., ArithmeticException) in the same try-catch block.
        Hint: Use try-catch with multiple catch blocks to handle specific exceptions.
            Example:
            FileNotFoundException if the file doesn't exist.
            ArithmeticException for division by zero during calculations.
--3. Challenge: Write a method readFileAndCalculate() that throws both a checked exception (IOException) and an unchecked exception (NumberFormatException). 
    Call this method from main() and handle the exceptions in the calling code.
        Hint: Use a throws clause in the method signature and try-catch in the main method.      
            Example:
            IOException when reading from a file.
            NumberFormatException when parsing a malformed number.
--4. Challenge: Create a custom checked exception InvalidFileFormatException. Write a program to read a file and throw this exception if the file’s content does not 
    meet specific criteria (e.g., the file should only contain integers). Handle this exception gracefully in the main method.
        Hint: Extend Exception for a checked exception and use a throw statement when the condition is not met.            
            Example:
            Input file: "data.txt" with content "abc123".
            Output: Throws InvalidFileFormatException for non-numeric data.
--5. Challenge: Write a program to demonstrate chained exceptions. Create a method that:
        Tries to read a file and catches an IOException.
        Wraps this exception into a RuntimeException and throws it further up the call stack.
        Handle the chained exception in the main() method and print the full stack trace.
        Hint: Use the Throwable constructor to pass the original exception into the wrapper exception.     
            Example:
            FileNotFoundException wrapped in RuntimeException.
            Output: Complete exception chain in stack trace.               
*/