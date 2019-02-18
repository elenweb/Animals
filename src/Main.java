import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Пунш";
        cat.color = "серый";
        cat.say();

        Bird bird = new Bird();
        bird.say();
        System.out.println();
        Dog dog = new Dog();
        dog.name = "Патрик";
        dog.color = "рыжий";
        dog.say();
        Dog dog1 = new Dog();
        dog1.name = "Боня ";
        dog1.say();
        Scanner scanner = new Scanner(System.in);
        print(dog);
        print(cat);
        print(bird);
        print(scanner);
        print(System.out);
        say2(cat);

        Animal[] x = {dog, cat, bird};
        int legs = Animal.countLegs(x);
        System.out.println("Всего ног " + legs);

    }

    public static void say2(Animal b) {
        for (int i = 1; i < 3; i++) {
            b.say();
        }
    }

    public static void print(Object o) {
        String s = o.toString();
        System.out.println(s);
    }
}
