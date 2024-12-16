/* 
--1. Challenge: Create a custom exception InvalidAgeException that is thrown when a person's age is less than 18. 
--2. Challenge: Write a program that takes a list of people's ages as input and checks if each age is valid (>= 18). Throw the InvalidAgeException for any invalid ages and continue checking the rest.
        Hint: Use a loop to iterate through the list of ages, catching the exception for each invalid age.
            Input: [16, 22, 14, 19]
            Output: "InvalidAgeException: Age 16 is not valid"
                     "InvalidAgeException: Age 14 is not valid"
                     "Age 22 is valid"
                     "Age 19 is valid"
--3. Challenge: Extend the program to validate both age and name:
        Throw InvalidAgeException for invalid ages (< 18).
        Throw a new custom exception InvalidNameException for names that are empty or null.
        Hint: Handle these exceptions in a single try-catch block and differentiate the error messages.                     
            Input: [{name: "John", age: 25}, {name: "", age: 20}, {name: "Jane", age: 16}]
            Output: "InvalidNameException: Name cannot be empty"
                    "InvalidAgeException: Age 16 is not valid"
                    "John is valid"
--4. Challenge: Create a Registration class with a method registerPerson(String name, int age).
        If the age is invalid, throw InvalidAgeException.
        If the name is invalid, throw InvalidNameException.
        Add a method to print a list of successfully registered people after handling the exceptions.
        Hint: Maintain a List<Person> for valid registrations.
            Input: [{name: "Alice", age: 20}, {name: "Bob", age: 15}]
            Output: Registered: Alice
                    Exception: Age 15 is not valid for Bob
--5. Challenge: Modify the Registration system to:
        Log all exceptions to a file (error.log) with details of the error and person.
        Prompt the user to re-enter valid details for failed registrations.
        Hint: Use a BufferedWriter to write exceptions to a file, and loop back for retries until valid input is provided.
            Input: {name: "", age: 25} -> Retry after "InvalidNameException"
            Input: {name: "Chris", age: 17} -> Retry after "InvalidAgeException"
            Output: Successfully registered after retry
            Error Log: InvalidNameException: Name cannot be empty (logged)
*/