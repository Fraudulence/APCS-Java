// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        
        Dog lab = new Labrador("Joker", "black");
        System.out.println(lab.getName() + " says " + lab.speak());
        
        Dog york = new Yorkshire("Morgana");
        System.out.println(york.getName() + " says " + york.speak());
    }
}