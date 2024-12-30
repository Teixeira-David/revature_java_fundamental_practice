/* 
--1. Challenge: Create an abstract class Vehicle with abstract methods start() and stop(). Implement it in subclasses Bike and Car. 
--2. Challenge: Extend the Vehicle class by adding an abstract method calculateFuelEfficiency() that returns the fuel efficiency 
    (miles per gallon or kilometers per liter). Implement this method in Bike and Car, each with their specific formulas.
        Hint: Assume a Bike has a fixed efficiency (e.g., 50 km/l) while the Car calculates efficiency based on engine capacity and fuel consumption.
--3. Challenge: Create a Fleet class that maintains a list of Vehicle objects. Add methods to:
        Start all vehicles in the fleet.
        Stop all vehicles in the fleet.
        Display details (e.g., type and fuel efficiency) of each vehicle in the fleet.
        Hint: Use a List<Vehicle> to store the vehicles and polymorphism to manage them.
--4. Challenge: Extend the program to include a RentalSystem class. Add the following functionality:
        Rent out a vehicle (set its availability to false).
        Return a rented vehicle (set its availability to true).
        Display available vehicles.
        Hint: Add a boolean isAvailable field in the Vehicle class and track rental status for each vehicle.         
--5. Challenge: Add a maintain() method to the Vehicle class that resets a "distanceSinceMaintenance" counter. Extend the functionality so that:
        Vehicles track the distance driven since the last maintenance.
        If a vehicle exceeds a maintenance threshold, it cannot start.
        Hint: Use a distanceSinceMaintenance field in the Vehicle class and override the start() method to include maintenance checks.
*/