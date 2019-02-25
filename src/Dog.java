public class Dog extends Animal {
    public final static int LEGS_COUNT=4; // final - константа
    protected String name;

    @Override
    public void say() {
        System.out.println(name + ": Гав");
    }

    public void info() {
        System.out.println(name + " Ног: " + LEGS_COUNT);
    }


    @Override
    public String toString() {
        return "Собака " + name;
    }

    @Override
    public void myPet () {
        System.out.print("Моя любимая собака " + name);
    }
}
