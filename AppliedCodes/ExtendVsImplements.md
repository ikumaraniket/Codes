### Generally implements used for implementing an interface and extends used for extension of base class behaviour or abstract class.

__extends: A derived class can extend a base class. You may redefine the behaviour of an established relation. Derived class "is a" base class type__

__implements: You are implementing a contract. The class implementing the interface "has a" capability.__

_With java 8 release, interface can have default methods in interface, which provides implementation in interface itself.

_Refer to this question for when to use each of them:

_Interface vs Abstract Class (general OO)

_Example to understand things:

        public class ExtendsAndImplementsDemo{
        public static void main(String args[]){

        Dog dog = new Dog("Tiger",16);
        Cat cat = new Cat("July",20);

        System.out.println("Dog:"+dog);
        System.out.println("Cat:"+cat);

        dog.remember();
        dog.protectOwner();
        Learn dl = dog;
        dl.learn();

        cat.remember();
        cat.protectOwner();

        Climb c = cat;
        c.climb();

        Man man = new Man("Ravindra",40);
        System.out.println(man);

        Climb cm = man;
        cm.climb();
        Think t = man;
        t.think();
        Learn l = man;
        l.learn();
        Apply a = man;
        a.apply();

    }
    }

    abstract class Animal{
    String name;
    int lifeExpentency;
    public Animal(String name,int lifeExpentency ){
        this.name = name;
        this.lifeExpentency=lifeExpentency;
    }
    public void remember(){
        System.out.println("Define your own remember");
    }
    public void protectOwner(){
        System.out.println("Define your own protectOwner");
    }

    public String toString(){
        return this.getClass().getSimpleName()+":"+name+":"+lifeExpentency;
    }
    }

    class Dog extends Animal implements Learn{

    public Dog(String name,int age){
        super(name,age);
    }
    public void remember(){
        System.out.println(this.getClass().getSimpleName()+" can remember for 5 minutes");
    }
    public void protectOwner(){
        System.out.println(this.getClass().getSimpleName()+ " will protect owner");
    }
    public void learn(){
        System.out.println(this.getClass().getSimpleName()+ " can learn:");
    }
    }
    class Cat extends Animal implements Climb {
        public Cat(String name,int age){
        super(name,age);
    }
    public void remember(){
        System.out.println(this.getClass().getSimpleName() + " can remember for 16 hours");
    }
    public void protectOwner(){
        System.out.println(this.getClass().getSimpleName()+ " won't protect owner");
    }
    public void climb(){
        System.out.println(this.getClass().getSimpleName()+ " can climb");
    }
    }
    interface Climb{
    public void climb();
    }
    interface Think {
    public void think();
    }

    interface Learn {
    public void learn();
    }
    interface Apply{
    public void apply();
    }

    class Man implements Think,Learn,Apply,Climb{
    String name;
    int age;

    public Man(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void think(){
        System.out.println("I can think:"+this.getClass().getSimpleName());
    }
    public void learn(){
        System.out.println("I can learn:"+this.getClass().getSimpleName());
    }
    public void apply(){
        System.out.println("I can apply:"+this.getClass().getSimpleName());
    }
    public void climb(){
        System.out.println("I can climb:"+this.getClass().getSimpleName());
    }
    public String toString(){
        return "Man :"+name+":Age:"+age;
    }
}

output:

    Dog:Dog:Tiger:16
    Cat:Cat:July:20
    Dog can remember for 5 minutes
    Dog will protect owner
    Dog can learn:
    Cat can remember for 16 hours
    Cat won't protect owner
    Cat can climb
    Man :Ravindra:Age:40
    I can climb:Man
    I can think:Man
    I can learn:Man
    I can apply:Man

__Important points to understand:__

Dog and Cat are animals and they extended remember() and protectOwner() by sharing name,lifeExpentency from Animal.
Cat can climb() but Dog does not. Dog can think() but Cat does not. These specific capabilities are added to Cat and Dog by implementing that capability.
Man is not an animal but he can Think,Learn,Apply,Climb.
By going through these examples, you can understand that __Unrelated classes can have capabilities through interface but related classes override behaviour through extension of base classes.__
