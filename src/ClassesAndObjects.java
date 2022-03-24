public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        System.out.println("My neame is "+person1.name+". "+"I have "+person1.age+" "+"years old");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 28;
        System.out.println("My neame is "+person2.name+". "+"I have "+person2.age+" "+"years old");
    }
}

class Person{
    //у класса могут быть:
    //1.Данные (поля)
    //2.Действия которые он может выполнять(методы)
    String name;
    int age;
}
