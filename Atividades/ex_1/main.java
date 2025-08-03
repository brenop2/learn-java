package ex_1;

public class main {
    public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
    }
}}
// COMO PERCORRER UM VERTOR

// teste
class vetor {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5};
        for (int i : myNumbers) { // i : faz percorrertos elementos que estão dentro do vetor
            System.out.println(i);
        }
        int[][] myNumberss = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumberss[1][2] = 9;
        System.out.println(myNumberss[1][2]);

        int[][] myNumbersss = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbersss.length; ++i) {
            for (int j = 0; j < myNumbersss[i].length; ++j) {
                System.out.println(myNumbersss[i][j]);
            }
        }
    }

}
