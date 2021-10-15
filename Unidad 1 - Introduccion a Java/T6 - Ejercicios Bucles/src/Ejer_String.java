public class Ejer_String {
    public static void main(String[] args) {
        String s = "56789";

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
