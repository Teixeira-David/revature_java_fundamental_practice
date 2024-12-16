/* 
--1. Challenge: Create a class Counter with a static variable to count the number of instances created for that class. 
--2. Challenge: Extend the Counter class to track the number of instances created for different types of objects. Create subclasses (TypeA and TypeB) and update the counter for each type separately.
        Hint: Use a static variable in each subclass to maintain its own count, and increment it in the constructor.
            Example Output:
            TypeA instances: 3
            TypeB instances: 2        
--3. Challenge: Add a static method resetCounter() to the Counter class that resets the instance counter to zero. Demonstrate the usage of the method by creating instances, 
    resetting the counter, and verifying the reset.
        Hint: Ensure the method only affects the static counter and doesn’t delete the instances.            
            Example Output:
            Instances created: 5
            Counter reset.
            Instances created: 0        
--4. Challenge: Create a base class Entity with a static counter to track the total number of objects created across all its subclasses (Person, Product, etc.). 
    Each subclass should also maintain its own static counter.
        Hint: Use the super constructor in subclasses to increment the global counter in the Entity class.            
            Example Output:
            Total instances: 6
            Person instances: 3
            Product instances: 3        
--5. Challenge: Modify the Counter class to ensure that the instance count is thread-safe when used in a multithreaded environment. Use synchronized methods or blocks to 
    protect the counter from race conditions.
        Hint: Simulate multiple threads creating instances of the class and verify the accuracy of the counter.            
            Example Output:
            Total instances created: 100 (using 10 threads creating 10 instances each)                    
*/