public class multi_arrays {
    public static void main(String[] args) {
        //int[] number = {1,2,3};
        int[][] matrice = {{1, 2, 3},
                {4, 5},
                {7, 8, 9, 6, 25}};
        System.out.println(matrice[2][4]);
        System.out.println(matrice[0][2]);
        System.out.println(matrice[1][1]);
        System.out.println();

        String[][] strings = new String[2][3];
        strings[0][1] = "hello";
        System.out.println(strings[0][1]);
        System.out.println();

        //вывод масива на экран

        int[][] matrice1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
