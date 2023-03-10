package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    public static Integer min(Integer[] numbers) {
        Integer min = Integer.MAX_VALUE;
        for (Integer num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static Integer maksimum(Integer [] numbers){
        Integer max = Integer.MIN_VALUE;
        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
     public static double average(Integer [] numbers){
        double sum = 0;
         for (Integer num : numbers) {
             sum+=sum;
         }
        return sum;
     }
}
