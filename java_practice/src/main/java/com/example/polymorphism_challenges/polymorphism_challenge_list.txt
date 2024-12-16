/* 
--1. Challenge: Create a class Shape with a method draw(). Override this method in subclasses Circle and Square. 
--2. Challenge: Extend the Shape class by adding a color property. Modify the draw() method in each subclass (Circle and Square) to include the color in the output.
        Hint: Use the color property to differentiate between the shapes visually.
            Output:
            Drawing a red Circle.
            Drawing a blue Square.        
--3. Challenge: Create a List<Shape> containing instances of different shapes (Circle, Square, etc.). Use a loop to call the draw() method on each shape, demonstrating polymorphism.
        Hint: Store all shapes as Shape objects and call draw() without knowing the exact subclass.            
            Output:
            Drawing a Circle.
            Drawing a Square.
            Drawing a Circle.        
--4. Challenge: Add a size property to the Shape class and override the toString() method in each subclass to display the shape’s type, size, and color. Use this information 
    in the draw() method for detailed output.
        Hint: Call the overridden toString() method within draw().            
            Output:
            Circle: size=10, color=red
            Square: size=5, color=blue        
--5. Challenge: Add a new subclass Triangle with its own implementation of draw(). Create a ShapeFactory class with a method createShape(String type, String color, int size) 
    that dynamically generates a Shape object based on the type provided.
        Hint: Use the factory method to handle shape creation and call draw() on the resulting object.            
            Input: "Circle", "red", 10
            Output:
            Created a red Circle of size 10.
            Drawing a Circle.        
*/