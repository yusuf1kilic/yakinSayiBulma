package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {5, 55, 7, 77, 46, 50, 78};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Bir Sayıı Giriniz: ");
        int number = input.nextInt();
        int yakınenküçüksayı = array[0];
        int yakınenbüyüksayı = array[0];
        for (int i : array) {

            if (i < number) {
                yakınenküçüksayı = i;
            }   

            if (i > number) {
                yakınenbüyüksayı = i;
                break;
            }
        }

        System.out.println("Girilen sayının kendisinden büyük en yakın değeri : " + yakınenbüyüksayı);
        System.out.println("Girilen sayının kendisinden küçük en yakın değeri : " + yakınenküçüksayı);
        input.close();

    }
}
