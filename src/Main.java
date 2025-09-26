public class Main {

    public static void main(String[] args) {
        GermanSheperd dzhulbars = new GermanSheperd();
        dzhulbars.eat();
        dzhulbars.voice();
        dzhulbars.guard();

        System.out.println(dzhulbars.whoAreYou());

        Chihuahua chichi = new Chihuahua();
        chichi.eat();
        chichi.voice();

        Husky crazy = new Husky();
        crazy.eat();
        crazy.voice();

        PetOwner me = new PetOwner();
        me.feedDog(dzhulbars);
        me.feedDog(chichi);
        me.feedDog(dzhulbars);

        System.out.println(chichi.whoAreYou());

        feedDogs(new Dog[] {dzhulbars, chichi});

    }

    public static void feedDogs(Dog[] array) {
        for (Dog dog : array) {
            System.out.println("Feeding " + dog.whoAreYou());
            dog.eat();
        }
    }
}