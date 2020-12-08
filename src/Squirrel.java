//package src;

public class Squirrel{

  String name;
  String color;
  String location;
  int age;

  public Squirrel(String newName, String newColor, String newLocation, int newAge){
    this.name = newName;
    this.color = newColor;
    this.location = newLocation;
    this.age = newAge;
  }

  public void eat(String strFood){
    System.out.println(this.name + "is eating " + strFood);
  }

  public void run(){
    System.out.println(this.name + " is running.");
  }

  public void sleep(int intHours){
    System.out.println(this.name + " slept for " + intHours + " hours");
  }

  
}