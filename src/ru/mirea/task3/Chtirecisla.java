
package ru.mirea.task3;

import java.util.Arrays;

public class Chtirecisla {
    public static void main(String[] args) {
        massiv4();
    }
        public static void massiv4() {


            int [] mas = new int[4];

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int)(Math.random()*90)+10;
            }
            System.out.println(Arrays.toString(mas));

            boolean proverka = true;
            for (int i = 1; i < mas.length; i++) {
                if(mas[i]<=mas[i-1]){
                    proverka = false;
                    break;
                }
            }
            if(proverka){
                System.out.println("Массив возрастающий");
            } else {
                System.out.println("Массив не возрастающий");
            }
        }
            }











