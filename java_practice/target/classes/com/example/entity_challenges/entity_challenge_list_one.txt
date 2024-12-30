/* 
--1. Challenge: Create a class Book with properties title, author, and price. Write a method to display the book's details. 
--2. Challenge: Extend the Book class to include a method applyDiscount(double percentage) that reduces the price by the given percentage. 
    Update the method to display the book’s details to reflect the new price after applying the discount.
        Hint: Ensure the percentage is between 0 and 100. If not, throw an exception or display an error message.
            Input: Price = 200, Discount = 10%
            Output: New Price: 180
--3. Challenge: Create a class Inventory to manage multiple Book objects. Add methods to:
        Add a new book to the inventory.
        Remove a book by title.
        Display details of all books in the inventory.
        Hint: Use a List<Book> to store the books.    
            Input: Add Book1, Add Book2, Remove Book1
            Output: Remaining books in inventory        
--4. Challenge: Add methods to the Inventory class to:
        Search for books by a specific author and return the list of matching books.
        Search for books within a given price range.
        Hint: Use loops or streams to filter books based on the search criteria.            
            Input: Search Author = "John Doe", Price Range = 100 to 200
            Output: Matching books
--5. Challenge: Create a subclass EBook that extends Book. Add additional properties like fileSize (in MB) and format (e.g., PDF, EPUB). 
    Override the displayDetails() method to include these properties.
        Hint: Use super.displayDetails() to reuse the existing functionality of the parent class.            
            Input: Title = "Digital Transformation", File Size = 5MB, Format = PDF
            Output: Book details including file size and format
*/