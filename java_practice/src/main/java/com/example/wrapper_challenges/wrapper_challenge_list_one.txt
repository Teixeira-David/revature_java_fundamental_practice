/* 
--1. Challenge: Write a program that takes a string input of a number, converts it to an Integer using Integer.parseInt(), and doubles its value. 
--2. Challenge: Modify the program to handle cases where the input string cannot be parsed into an integer. If parsing fails, catch the NumberFormatException and display an error message.
        Hint: Use a try-catch block to handle invalid input.
            Example Input: "123abc"
            Output: "Invalid input: not a valid integer."        
--3. Challenge: After converting the input string to an integer, calculate the sum of its digits. Handle invalid input gracefully as in Challenge 2.
        Hint: Use a loop to extract and add each digit from the integer.            
            Example Input: "456"
            Output: "Sum of digits: 15"
--4. Challenge: After converting the input string to an integer, calculate its factorial. Handle invalid input and negative numbers gracefully (factorial is undefined for negative numbers).
        Hint: Use a loop or recursion to compute the factorial.
            Example Input: "5"
            Output: "Factorial: 120"
            Example Input: "-5"
            Output: "Invalid input: factorial is undefined for negative numbers."        
--5. Challenge: Modify the program to accept a comma-separated string of numbers (e.g., "12,34,56"). Convert each number, double its value, and find the maximum among the doubled values. 
    Handle invalid inputs in the list gracefully.
        Hint: Split the string using String.split(",") and process each number individually.            
            Example Input: "12,34,56"
            Output: "Doubled values: [24, 68, 112]. Maximum: 112"
            Example Input: "12,abc,56"
            Output: "Invalid input: 'abc' is not a valid integer."        
*/