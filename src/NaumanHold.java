public class NaumanHold {
    private String buckets[];
    private int size;

    public NaumanHold()
    {
        buckets = new String [10] ;
        size = 0;
    }

    public void addToBucket (String Buckets){
        buckets[size] = Buckets;
        size++;
    }

    public int getSize () {
        return size;
    }

    public String getBucket(int size) {
        return buckets[size];
    }

    public void printAllBucket() {
        for (int i = 0; i < size; i++) {
            System.out.print(buckets[i]);
        }

    }
}
