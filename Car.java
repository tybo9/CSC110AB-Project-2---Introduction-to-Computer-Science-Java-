public class Car
{
public static final double GALLON_VALUE = 1;
public static final double MILE_VALUE = 1;
  
 
  
private String name;
private double milesPerGallon; // fuel efficiency of the car
private double capacity;
private double distance; // distance already travelled in miles
private double gasAvailable;
private double emptySpace;
/**
Constructs a car with default charachteristics.
*/
public Car()
{
name = "defaultCar";
capacity = 20.0;
distance = 0.0;
milesPerGallon = 40.0;
}
  
/**
Constructs a car with the following: name, Fuel Efficiency, tank Capacity, Distance Traveled and available gas.
*/
void Car(String customName,double customfueleff, double tankCapacity ) {
name =customName;
milesPerGallon = customfueleff;
capacity = tankCapacity;
distance = 0.0;
emptySpace = capacity;
gasAvailable = 0.0; //should depend on car
}
  
/**
Adds a specified amount of gas n gallons relative to the tank Capacity
*/
  
public boolean addGas(double gallons){
  
emptySpace = capacity - gasAvailable;
  
if (emptySpace <=0 )
return false;
else if(gallons > emptySpace ) {
gasAvailable =gasAvailable +emptySpace;
return true;
}
else{
gasAvailable= gasAvailable +gallons;
return true;
}
}
  
/**
drives a specified distance proportinate to amount of gas available
*/
  
public boolean drive(double requestedDistance) {
  
double possibleDistance = (gasAvailable*milesPerGallon);
if (requestedDistance < 0) {
return false; }
if (requestedDistance <= possibleDistance) {
distance += requestedDistance;
gasAvailable-=(requestedDistance/milesPerGallon);
return true;
}
else { return false; }
}
  
 
  
/**
Returns the name of the current car as a String
*/
public String getName()
{
return ("The name of the car is "+ name);
}
/**
Returns the fuel efficiency of the current car in miles per gallon
*/
public double getEfficiency()
{
return milesPerGallon;
}
  
/**
returns the gas tank capacity of the current car in gallons
*/
public double getCapacity()
{
return capacity;
}
  
/**
gets the distance traveled in miles
*/
public double getdistance()
{
return distance;
}
/**
gets the amount of gas that currently available in the tank in gallons
*/
  
public double getGasAvailable()
{
return gasAvailable;
}
/**
returns the amount of gas that can currently be added to the taknk in gallons
*/
public double getSpace()
{
emptySpace = capacity - gasAvailable;
return emptySpace;
}
  
 
}
/**
takes out gas from the gas tank
*/
/*
public boolean withdraw(double amount)
{
  
emptySpace = capacity - gasAvailable;
  
if (emptySpace <=0 )
return false;
else if(gallons > emptySpace ) {
gasAvailable =gasAvailable +emptySpace;
return true;
}
else{
gasAvailable= gasAvailable +gallons;
true;
  
 
}
}
}
  
/**
Transfers the specified gas from the strangersCar to MasoodsCar
*/
/*
public double Transfer(double amount);
{
double transfer Amount = gasTransferAmount;
strangersCar.withdraw(gasTransferAmount);
masoodsCar.deposit(gasTransferAmount);
}
*/