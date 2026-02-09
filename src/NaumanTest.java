public class NaumanTest {
    public static void main(String[] args) {
        NaumanHold Name = new NaumanHold();
        Name.addToBucket("Hello");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));

        Name.addToBucket("World");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));

        Name.addToBucket("how");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));

        Name.addToBucket("are");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));

        Name.addToBucket("you");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
        Name.printAllBucket();
    }
}