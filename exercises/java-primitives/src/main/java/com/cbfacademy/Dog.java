package com.cbfacademy;

public class Dog {
  // instance field
  String breed;
  boolean hasOwner;
  int age;
  
    // constructor method
  public Dog(String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
       /* 
    create instance: 
    use 'new' operator and invoke constructor
    */
    Dog fido = new Dog("poodle", false, 4);
    Dog nunzio = new Dog("shiba inu", true, 12);
      /* 
    fields are accessed using: 
    the instance name, `.` operator, and the field name.
    */
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}
