/* 
--1. Challenge: Create an interface Animal with methods makeSound() and move(). Implement it in classes Dog and Bird. 
--2. Challenge: Modify the Dog and Bird classes to include unique behaviors, such as fetch() for Dog and fly() for Bird. Write a program that demonstrates both
     the common interface methods (makeSound() and move()) and the unique behaviors.
        Hint: Add additional methods to each class and call them after the interface methods.
            Output:
            Dog: Woof!
            Dog moves on four legs.
            Dog fetches the ball.
            Bird: Chirp!
            Bird flies in the sky.        
--3. Challenge: Extend the Animal interface to include a getName() method. Implement this in all classes and create a List<Animal>. Sort the list alphabetically 
    by the animal’s name and display their makeSound() output in order.
        Hint: Use a comparator or a lambda expression to sort the list.
            Input: List contains Dog, Bird, Cat
            Output:
            Bird: Chirp!
            Cat: Meow!
            Dog: Woof!
--4. Challenge: Create another interface Habitat with a method liveIn(). Implement it in the Dog and Bird classes to describe their habitat (e.g., "House" for Dog, "Nest" for Bird). 
    Write a program that displays both the sounds/movements of the animals and their habitat information.
        Hint: Use multiple interfaces in the classes and demonstrate calling methods from both interfaces.            
            Output:
            Dog: Woof! Moves on four legs. Lives in a house.
            Bird: Chirp! Flies in the sky. Lives in a nest.
--5. Challenge: Use a custom functional interface Behavior with a method perform(). Create a dynamic behavior system for animals where their actions (makeSound(), move(), 
    or any other custom behavior) are defined using lambda expressions. Demonstrate assigning and executing behaviors dynamically for different animals.
        Hint: Use @FunctionalInterface and pass behaviors as lambda expressions.            
            Output:
            Dog performs: Woof!
            Dog performs: Runs in the park.
            Bird performs: Chirp!
            Bird performs: Flies over the trees.        
*/