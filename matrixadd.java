import java.util.*;
public class matrixadd {
    public static void main(String[] args) {
        int r, c, i, j;
        int a[][] = new int[15][15];
        int b[][] = new int[15][15];
        int add[][] = new int[15][15];
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows ");
        r = s.nextInt();
        System.out.println("enter number of col ");
        c = s.nextInt();
        System.out.println("enter ele of a matrix...");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("enter ele of b matrix...");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = s.nextInt();
            }

        }

        for (i = 0; i < r; i++) {

            for (j = 0; j < c; j++) {
                add[i][j]=a[i][j]+b[i][j];

            }}

            System.out.println("result matrix...");

            for (i = 0; i < r; i++) {

                for (j = 0; j < c; j++) {

                    System.out.println(add[i][j]+" ");
                }

                System.out.println("/n");
            }



    }}
