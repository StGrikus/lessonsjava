public class Lessons22 {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Arthur", 23);
        Human2 h2 = new Human2("Anastasia", 19);
        Human2 h3 = new Human2("Bob", 15);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}

class Human2 {
    private String name;
    private int age;

    private int countPeople;

    public static String description;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllField(){
        System.out.println(name+"|"+age+"|"+description);
    }

    public void printNumberOfPeople(){
        System.out.println("Numbers of people is "+countPeople);
    }
}
