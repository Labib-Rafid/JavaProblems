package PracticeProblem05;

public class PetDog {
    String name, breed;
    PetDog(String name){
        this(name, "UnIdentified");
    }
    PetDog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Its Barking");
    }
    public void spin(){
        System.out.println("Its Spinning");
    }
    public static void main(String[] args) {
        PetDog obj1 = new PetDog("Tumu", "German Shepard");
        PetDog obj2 = new PetDog("Tommy");

        obj1.bark();
    }
}
