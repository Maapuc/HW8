import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача № 1,2");
        System.out.println();

        int[] one = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(one));
        double[] two = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(two));
        int[] three = {4, 12, 1990};
        System.out.println(Arrays.toString(three));

        System.out.println(" Задача № 3");
        System.out.println();

        {
            for (int i = one.length - 1; i >= 0; i--) {
                System.out.print(one[i]);
                if (i > 0) ;
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
        {
            for (int i = two.length - 1; i >= 0; i--) {
                System.out.print(two[i]);
                if (i > 0) ;
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
        {
            for (int i = three.length - 1; i >= 0; i--) {
                System.out.print(three[i]);
                if (i > 0) ;
                {
                    System.out.print(",");
                }
            }
        }
        System.out.println(" Задача № 4");
        System.out.println();

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0 ) {
                one[i] ++ ;
            }
            System.out.print(Arrays.toString(one));
        }

    }
    }