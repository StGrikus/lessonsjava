package Test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner na = new Scanner(System.in);
        System.out.println("Введите имя");
        String n = na.next();
        person1.setName(n);
        Scanner ag = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int a = ag.nextInt();
        person1.setAge(a);
        System.out.println("Моё имя "+person1.getName()+". Мой возраст "+person1.getAge());
    }
}
class Person{
    private String n;
    private int a;

    public void setName(String user_name){
        if (user_name.isEmpty()) {
            System.out.println("Поле с именем пустое");
        }
        else {
            n = user_name;
        }
    }

    public void setAge(int user_age) {
        if (user_age < 0) {
            System.out.println("Неоректный возраст");
        }
        else {
            a = user_age;
        }
    }

    public String getName(){
        return n;
    }

    public int getAge(){
        return a;
    }
}
