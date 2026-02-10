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
        //after this was done in GitHub and will be used to pull for HW
         Name.addToBucket("I");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
         Name.addToBucket("added");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
         Name.addToBucket("this");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
         Name.addToBucket("in");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
         //The code on the bottom will be used for Merge Conflict
        Name.addToBucket("MergeConflictt");
        System.out.println(Name.getSize()+" Has "+Name.getBucket(Name.getSize()));
    }
}
