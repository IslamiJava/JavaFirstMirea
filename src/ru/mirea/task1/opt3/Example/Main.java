
/*
package ru.mirea.task1.opt3.Example;
public class Main {
    public static void main(String[] args) {
        int[] array = {12, 4, 3, 5, 7, 1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("SUMMA " + sum);
    }
}

 */


/*
package ru.mirea.task1.opt3.Example;
public class Main {
    public static void main(String[] args){
        int[] array = {2,6,5,3,2,5,6};
        int sum=0;
        int i=0;
        while(i< array.length)
        {
            sum += array[i];
            i++;
        }
        System.out.println("SUMMA " + sum);
        }
    }

 */

/*
package ru.mirea.task1.opt3.Example;
public class Main {
    public static void main(String[] args){
        int[] array = {2,6,5,3,2,5,6};
        int sum=0;
        int i=0;
        do{
            sum += array[i];
            i++;
        }while(i< array.length);
        System.out.println("SUMMA " + sum);
        }

    }
 */

/*
package ru.mirea.task1.opt3.Example;
public class Main {

    public static void main(String args[])
    {


        int num = 10;
        double result = 0.0;

        System.out.println("Гармонический ряд: ");


        for (int i = num; i > 0; i--) {


            result = result + (double)1 / i;
            System.out.print(result + ", ");
        }
    }
}

 */

/*
package ru.mirea.task1.opt3.Example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int f=1;
        for (int i = 1; i < number; i++, f*=i);
        System.out.println("Факториал = " +f);
    }
}

 */


/*
package ru.mirea.task1.opt3.Example;
import java.util.Scanner;
public class Main {


            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите число:");
                int number = sc.nextInt();
                int[] array = new int[number];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int)(Math.random()*1000);
                    System.out.println(array[i]);
                }
                }
            }

 */

/*
package ru.mirea.task1.opt3.Example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        Random arr=new Random();
        int[] array = new int[number];
        System.out.print("Числа массива = ");
        for (int i = 0; i < array.length; i++) {
            array[i] = arr.nextInt(100);
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.print("Сортированный массив= ");
        for(int j : array){
            System.out.print(j + " ");


        }
    }
}

 */



