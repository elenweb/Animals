import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import  java.util.HashSet;
import java.util.Iterator;

public class Cats_and_Dogs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List pets = new LinkedList();
        String answer = s.next();
        Dog[] dog = new Dog[];
        Cat[] cat = new Cat[];
        Animal[] animal = new Animal[];
        int dogCounter = 0;
        int catCounter = 0;
        int animalCounter = 0;


        System.out.println("У вас есть домащние животные? (y/n)");
        answer = s.next();
        if (answer != "y") {
            switch (answer) {
                case ("n"):
                    System.out.println("Животные делают нас лучше!");
                    break;
                case ("y"):
                    break;
                default:
                    System.out.println("Неверный ввод. Пожалуйста, введите \"y\", если у вас есть животные и \"n\" если нет животных");
                    answer = s.next();
            }
        } else {
            while (answer == "y") {
                System.out.println("Если это собака, введите 1, если кошка, введите 2, если другое животное, введите название животного и имя через пробел");
                answer = s.next();
                switch (answer) {
                    case ("1"):
                        dog[dogCounter] = new Dog();
                        System.out.println("Введите имя Вашей собаки");
                        answer = s.next();
                        dog[dogCounter].name = answer;
                        pets.add(dog[dogCounter]);
                        dogCounter++;
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        break;
                    case ("2"):
                        cat[catCounter] = new Cat();
                        System.out.println("Введите имя Вашей кошки");
                        answer = s.next();
                        cat[catCounter].name = answer;
                        pets.add(cat[catCounter]);
                        catCounter++;
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        break;
                    default:
                        animal[animalCounter] = new Animal();
                        System.out.println("Введите название и имя Вашего животного через пробел");
                        animal[animalCounter].name = answer;
                        pets.add(animal[animalCounter]);
                        animalCounter++;
                        System.out.println("У вас есть еще домащние животные? (y/n)");
                        answer = s.next();
                        checkAnswer(answer);
                        break;
                }
            }
            Iterator iterator  = s.iterator();
            while (iterator.hasNext()) {
                Object object = iterator.next();
                System.out.println("object =" + object);
            }
        }


        public static void checkAnswer (String string){
            while (string != "y" && string != "n") {
                System.out.println("Неверный ввод. Пожалуйста, введите \"y\", если у вас есть животные и \"n\" если нет животных");
                Scanner s = new Scanner(System.in);
                string = s.next();
            }
            if (string == "n") {
                System.out.println("Спасибо за интервью!");
            }
        }
    }