package Arrays;

public class Ejer7410 {
    public static void main(String[] args) {
        char[][] array = new char[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 1) {
                    array[i][j] = 'A';
                    System.out.print(array[i][j]);
                } else {
                    array[i][j] = '.';
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
