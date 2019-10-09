public class test {


    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "CAT";
        String s3 = new String("CAT");

        System.out.println(s2 == s1);
        System.out.println(s2 == s3);
    }
}
