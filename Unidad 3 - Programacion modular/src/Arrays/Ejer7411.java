package Arrays;

public class Ejer7411 {
    public static void main(String[] args) {
        char[][] array = new char[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i - j == 0) {
                    array[i][j] = 'X';
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
