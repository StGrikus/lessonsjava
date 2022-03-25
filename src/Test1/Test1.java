package Test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = na.next();
        Scanner ag = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = ag.nextInt();
        Person person1 = new Person();
        person1.setNameAndAge(name, age);
        person1.speak();
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String user_name, int user_age){
        name = user_name;
        age = user_age;
    }
    void speak(){
        System.out.println("Моё имя "+name+". Мой возраст "+age);
    }
}
