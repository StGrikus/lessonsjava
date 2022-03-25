public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Arthur");
        person1.setAge(23);
        //person1.speak();
        System.out.println("My name is " + person1.getName() + ". " + "I have " + person1.getAge() + " " + "years old");
    }
}

class Person{
    //у класса могут быть:
    //1.Данные (поля)
    //2.Действия которые он может выполнять(методы)
    private String name;
    private int age;

    public void setName(String user_name) {
        if (user_name.isEmpty()) {
            System.out.println("null name");
        } else {
            name = user_name;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int user_age) {
        if (user_age < 0) {
            System.out.println("age > 0");
        } else {
            age = user_age;
        }
    }

    public int getAge() {
        return age;
    }

    void speak(){
            System.out.println("My name is " + getName() + ". " + "I have " + getAge() + " " + "years old");
    }
}
