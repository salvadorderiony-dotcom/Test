public class PetOwner {

    void feedDog(Chihuahua chihuahua) {
        System.out.println("Getting expensive food");
        chihuahua.eat();
    }

    void feedDog(Dog dog) {
        System.out.println("Getting regular food");
        dog.eat();
    }
}