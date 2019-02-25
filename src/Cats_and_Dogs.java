import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class Cats_and_Dogs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List pets = new LinkedList();

        System.out.println("У вас есть домащние животные? (y/n)");
        String answer = s.next();
        checkAnswer(answer);
        if (answer.equals("n")) {
            System.out.println("Животные делают нас лучше!");
        } else {
            while (answer.equals("y")) {
                System.out.println("Если это собака, введите 1, если кошка, введите 2, если другое животное, введите название животного");
                answer = s.next();
                switch (answer) {
                    case ("1"):
                        Dog dog = new Dog();
                        System.out.println("Введите имя Вашей собаки");
                        answer = s.next();
                        dog.name = answer;
                        pets.add(dog);
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        if (answer.equals("n") || answer.equals("y")) break;
                    case ("2"):
                        Cat cat = new Cat();
                        System.out.println("Введите имя Вашей кошки");
                        answer = s.next();
                        cat.name = answer;
                        pets.add(cat);
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        if (answer.equals("n") || answer.equals("y")) break;
                    default:
                        Animal animal = new Animal();
                        animal.name = answer;
                        pets.add(animal);
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        if (answer.equals("n") || answer.equals("y")) break;
                }
            }

          /*  Iterator iterator = s.iterator();
            while (iterator.hasNext()) {
                Object object = iterator.next();
                System.out.println("object =" + object);
            }    */
        }
        Iterator it = pets.iterator();

        System.out.println("Ваши животные:");
        while (it.hasNext()) {
            System.out.println(it.next());

            //System.out.println(pets);
        }
    }

    public static void checkAnswer(String string) {
        while (!string.equals("y") && !string.equals("n")) {
            System.out.println("Неверный ввод. Пожалуйста, введите \"y\", если у вас есть животные и \"n\" если нет животных");
            Scanner s = new Scanner(System.in);
            string = s.next();
        }
        if (string == "n") {
            System.out.println("Спасибо за интервью!");
        }
    }
}
