/* 
--1. Challenge: Create a class Animal with a method speak(). Derive classes Dog and Cat, each overriding the speak() method.
--2. Challenge: Create a list of Animal objects that contains both Dog and Cat instances. Use a loop to call the speak() method on each animal in the list, demonstrating polymorphism.
        Hint: Use a List<Animal> to store the objects and iterate through it.
            Output: 
            Dog says: Woof!
            Cat says: Meow!
--3. Challenge: Extend the program to include a new class, Cow, that also derives from Animal and overrides the speak() method. Demonstrate how the code adapts without 
    modifying the loop logic that calls the speak() method.
        Hint: Add a new class and include an instance of it in the same List<Animal>.   
            Output: 
            Dog says: Woof!
            Cat says: Meow!
            Cow says: Moo!                 
--4. Challenge: Create a Zoo class that organizes animals into groups (e.g., "Mammals" and "Birds"). Add methods to:
        Add animals to specific groups.
        List all animals in a group, displaying their speak() output.
        Hint: Use a Map<String, List<Animal>> to group animals.
            Output:
            Mammals:
            - Dog says: Woof!
            - Cat says: Meow!
            Birds:
            - Parrot says: Squawk!        
--5. Challenge: Add an interface Swimmable with a method swim(). Implement this interface in a new class Fish and optionally in other animals like Dog (if certain breeds swim). 
    Write a program that identifies all Swimmable animals in the zoo and calls their swim() method.
        Hint: Use instanceof to check if an animal implements the interface.            
            Output:
            Fish swims in the water.
            Dog swims in the pool.
*/