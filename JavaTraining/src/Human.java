public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) { // <-- Constructor

        this.name = name; // "This" can replace the name of the object, for instance human.name = name
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking *burp*");
    }
}
