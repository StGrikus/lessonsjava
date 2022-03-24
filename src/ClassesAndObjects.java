public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        //person1.calculateYearsToRetirement();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("To Retirement "+years1);
        //не правильный метод System.out.println("My neame is "+person1.name+". "+"I have "+person1.age+" "+"years old");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 28;
        //не правильный методSystem.out.println("My neame is "+person2.name+". "+"I have "+person2.age+" "+"years old");
        person2.speak();
        //person2.calculateYearsToRetirement();
        person2.sayHello();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("To Retirement "+years2);

    }
}

class Person{
    //у класса могут быть:
    //1.Данные (поля)
    //2.Действия которые он может выполнять(методы)
    String name;
    int age;

    int calculateYearsToRetirement(){   //годы до пенсии(перевод)
        int years = 65-age;
        //для вывода в чат System.out.println("Years To Retirement "+years);
        return years;
    }

    void speak(){
        //for (int i = 0; i < 3; i++) {
            System.out.println("My neame is " + name + ". " + "I have " + age + " " + "years old");
        //}
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
