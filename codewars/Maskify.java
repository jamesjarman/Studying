package codewars;

public class Maskify {
    public static String maskify(String str) {

        int length = str.length();
        String hashes = "";

        if (length<5) {
            return str;
        }

        String lastFour = str.substring(length-4);
        for (int i=0;i<length-4;i++) {
            hashes=hashes.concat("#");
        }
        String maskified = hashes.concat((lastFour));
        return maskified;

    }

    public static void main(String[] args) {
        System.out.println(maskify("Password"));
    }
}
