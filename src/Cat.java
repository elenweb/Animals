public final class Cat extends Animal {
    public void say() {
        super.say();
        System.out.println(color + " " + name + " сказал" + ": Мяу");
    }

    @Override
    public void myPet () {
        System.out.print("Мой любимый кот" + name);
    }
    @Override
    public String toString() {
        return "Кошка " + name;
    }
}
