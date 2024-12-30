/* 
--1. Challenge: Create a class Person with private, public, and protected fields. Write a program to demonstrate access control. 
--2. Challenge: Extend the Person class by adding protected fields email and phoneNumber. Create a subclass Employee that uses getters and setters to access and modify these fields.
        Hint: Demonstrate how protected fields can be accessed within the subclass but not directly outside the class hierarchy.
--3. Challenge: Add a static method validateAccess(String role) to the Person class. This method should check if a person with a given role (e.g., "Admin", "User") 
    has access to modify the salary field, which should remain private.
        Hint: Call the static method from the main program to demonstrate controlled access.       
--4. Challenge: Modify the Person class to include a private socialSecurityNumber field. Add getter and setter methods with validation:
        Allow retrieval only for authorized roles.
        Encrypt the social security number before storing it.
        Hint: Simulate simple encryption by reversing the string (e.g., "12345" becomes "54321"). 
--5. Challenge: Create an Admin subclass of Person with a method to update private fields of other Person objects (like salary or address). Use access modifiers and 
    methods to control what Admin can and cannot modify.
        Hint: Use private fields with public/protected setter methods in Person, and demonstrate the interaction between the Admin and Person objects.
*/