package Interfaces;

//урок 26

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Arthur");
        //полиморфизм (урок 29)
        //info1.showInfo();
        //info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

        Animal animal1 = new Animal(2);
        Person person1 = new Person("Anastasia");
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
