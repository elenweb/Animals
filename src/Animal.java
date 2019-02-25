
public class Animal {
    protected String color;
    protected String name;
    protected String breed;

    public static int countLegs(Animal[] a) {  //считает ноги всех животных
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            counter = counter + a[i].legs();
        }
        return  counter;
    }

    public int legs () {
        return 4;
    }

    public void say () {
        System.out.print("-");
    }

    public void myPet () {
        System.out.print("Мой любимый " + name);
    }

    public String toString() {
        return name;
    }
}
