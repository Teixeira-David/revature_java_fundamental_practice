/* 
--1. Challenge: Use a List to store 5 names. Sort the names alphabetically and display them. 
--2. Challenge: Modify the program to sort the list of names by their length instead of alphabetically. Display the names along with their lengths.
        Hint: Use a custom comparator or lambda expression to sort the names by their length.
            Input: ["Alice", "Bob", "Catherine", "Dan", "Eve"]
            Output: ["Bob (3)", "Dan (3)", "Eve (3)", "Alice (5)", "Catherine (9)"]            
--3. Challenge: Extend the program to accept a list of names with potential duplicates. Remove the duplicates, sort the list alphabetically, and display the unique names.
        Hint: Use a Set to filter out duplicates before sorting the list.    
            Input: ["Alice", "Bob", "Alice", "Dan", "Eve", "Bob"]
            Output: ["Alice", "Bob", "Dan", "Eve"]             
--4. Challenge: After sorting the list alphabetically, implement a binary search algorithm to check if a specific name exists in the list. Print its position if found or indicate that it's not present.
        Hint: Use the Collections.binarySearch() method or implement your own binary search logic.
            Input: ["Alice", "Bob", "Catherine", "Dan", "Eve"], Search: "Dan"
            Output: "Dan found at position 3"        
--5. Challenge: Group the names by their first letter and display them as a map, where the keys are the first letters and the values are lists of names starting with those letters.
        Hint: Use a Map<Character, List<String>> and iterate through the list of names to populate it.            
            Input: ["Alice", "Bob", "Catherine", "Dan", "Eve", "Charlie"]
            Output: {A=[Alice], B=[Bob], C=[Catherine, Charlie], D=[Dan], E=[Eve]}
*/