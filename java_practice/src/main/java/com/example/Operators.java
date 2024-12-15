/* 
--1. Challenge: Write a program that swaps two variables without using a third variable, using arithmetic operators. 
--2. Challenge: Write a program that swaps two variables without using a third variable or arithmetic operators. Use the bitwise XOR operator (^) to achieve the swap.
        Hint: The XOR trick works by exploiting the properties of the XOR operation:
        a = a ^ b
        b = a ^ b
        a = a ^ b
            Input: a = 5, b = 10
            Output: a = 10, b = 5        
--3. Challenge: Write a method swapElements(int[] array, int index1, int index2) that swaps two elements in an array without using a third variable or temporary storage.
        Hint: Use arithmetic or bitwise XOR to perform the swap.
            Input: array = {1, 2, 3, 4}, index1 = 1, index2 = 3
            Output: array = {1, 4, 3, 2}        
--4. Challenge: Write a program that swaps two string variables without using a third variable. Use string concatenation and substring operations to achieve the swap.
        Hint: Concatenate both strings into one variable and extract them using substring().            
            Input: str1 = "Hello", str2 = "World"
            Output: str1 = "World", str2 = "Hello"        
--5. Challenge: Write a program to swap the values of two nodes in a linked list without using a temporary variable or modifying the structure of the linked list. 
    Swap their values using arithmetic or bitwise XOR.
        Hint: Traverse the linked list to locate the two nodes, then swap their data fields.            
            Input: Linked List = 1 -> 2 -> 3 -> 4, swap nodes with values 2 and 4
            Output: Linked List = 1 -> 4 -> 3 -> 2        
*/