import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import  java.util.List;
import  java.util.Set;
import  java.util.HashSet;
import java.util.Iterator;



public class Main {
    public static void main(String[] args) {
       // Cat cat = new Cat();
       //  cat.name = "Пунш";
       //  cat.color = "серый";
       //  cat.say();

       //  Bird bird = new Bird();
       //  bird.say();
        System.out.println();
        Dog dog = new Dog();
        dog.name = "Патрик";
        dog.color = "рыжий";
        dog.say();
        Dog dog1 = new Dog();
        dog1.name = "Боня ";
        dog1.say();
       // Scanner scanner = new Scanner(System.in);
       // print(dog);
       // print(cat);
       // print(bird);
       // print(scanner);
       // print(System.out);
       // say2(cat);

       // Animal[] x = {dog, cat, bird};
        //int legs = Animal.countLegs(x);
       // System.out.println("Всего ног " + legs);


        List a = new ArrayList<>();
        a.add(dog);
        a.add(dog1);
        a.add(33);
        a.add("abc");

        Set s = new HashSet();  //в цикле добавить слова String от пользователя и
        // вывести их на экран
Iterator iterator  = s.iterator();
while (iterator.hasNext()){
    Object object = iterator.next();
    System.out.println("object =" + object);
}


        Object y = a.get(1);
        Dog xx = (Dog)y;
        System.out.println(xx);




    }

   /* public static void say2(Animal b) {
        for (int i = 1; i < 3; i++) {
            b.say();
        }
    }

    public static void print(Object o) {
        String s = o.toString();
        System.out.println(s);
    }
*/
}
