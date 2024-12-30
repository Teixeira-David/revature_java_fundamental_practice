/* 
--1. Challenge: Write a program to check if a given string is a palindrome (reads the same backward). 
--2. Challenge: Modify the program to ignore case sensitivity and spaces when checking if a string is a palindrome.
        Hint: Use methods like toLowerCase() and replaceAll(" ", "") to preprocess the string before performing the palindrome check.
            Example Input: "A man a plan a canal Panama"
            Output: "The string is a palindrome"        
--3. Challenge: Write a program to check if a given number (as an integer or string) is a palindrome. Allow input as either a number or a string representation of a number.
        Hint: Convert the number to a string for uniform processing and check if it’s a palindrome.            
            Example Input: 12321
            Output: "The number is a palindrome"        
--4. Challenge: Write a program to find and display all substrings of a given string that are palindromes. Include single-character palindromes as well.
        Hint: Use nested loops to extract substrings and check each one for the palindrome property.            
            Example Input: "ababa"
            Output: ["a", "b", "a", "aba", "bab", "ababa"]            
--5. Challenge: Write a program to find the longest palindromic substring in a given string. Optimize the program to handle large strings efficiently using the expand 
    around center approach or dynamic programming.
        Hint: For a string of length n, consider each character and each pair of characters as the center and expand outward to check for palindromes.
            Example Input: "babad"
            Output: "bab" or "aba" (both are valid)        
*/