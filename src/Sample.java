public class Sample {
    public static void main(String[] args) {
        Sample s1 = new Sample();

        // for object s1

        System.out.println(s1); // -> ClassName@objectAddress
        System.out.println(s1.toString()); // --> ClassName@objectAddress
        System.out.println(s1.hashCode());

        Sample s2 = new Sample();

        // for object s2

        System.out.println(s2);
        System.out.println(s2.toString());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2)); // false

        // object address of each object is different
        // hashcode of each object also different

        Sample s3 = s2;
        System.out.println(s3.equals(s2));// true
        System.out.println(s3.hashCode()); // same of s2
    }
}
