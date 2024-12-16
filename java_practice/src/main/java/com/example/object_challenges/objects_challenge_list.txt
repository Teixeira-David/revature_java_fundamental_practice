/* 
--1. Challenge: Override the toString() method in a Product class to return a readable string representation of its properties. 
--2. Challenge: Extend the Product class to include a property Manufacturer, which is represented as another class with attributes like name and address. 
    Override the toString() method in both Product and Manufacturer to display details in a nested format.
        Hint: Call the toString() method of the Manufacturer class from within the Product class.
            Example Output:
            Product[name=Smartphone, price=699.99, category=Electronics, 
            Manufacturer[name=TechCorp, address=123 Tech Ave]]
--3. Challenge: Override the toString() method in the Product class to return a JSON-like string representation of the product properties.
        Hint: Use string concatenation or StringBuilder to format the output.            
            Example Output:
            {
              "name": "Smartphone",
              "price": 699.99,
              "category": "Electronics"
            }        
--4. Challenge: Add a List<String> property to the Product class to represent product features (e.g., "Waterproof", "Bluetooth"). Override the toString() method to include the features in the 
    readable string.
        Hint: Use a loop or String.join() to format the features as part of the output.
            Example Output:
            Product[name=Smartphone, price=699.99, category=Electronics, features=[Waterproof, Bluetooth]]
--5. Challenge: Create a ProductCatalog class that holds a list of Product objects. Override the toString() method in ProductCatalog to display the products in a tabular format, including headers 
    for properties like name, price, and category.
        Hint: Use loops and formatted strings to align the output in columns.
            Example Output:
            Name        | Price   | Category     
            ----------------------------------
            Smartphone  | 699.99  | Electronics  
            Headphones  | 199.99  | Accessories        
*/