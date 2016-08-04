package com.example;

public class Demo {
    public static void main(String[] args) {

        int [] elements = { 5, 7, 12, 100, -1, 100, 8, 3 };
        int sumTotal = 0;
        int indexPos = 0;

        do{

            System.out.println("Processing: " + indexPos);

            if(elements[indexPos] < 0){
                System.out.println("Break!");
                break;
            }

            if(elements[indexPos]> 99){
                System.out.println("Continue!");
                indexPos++;
                continue;
            }

            sumTotal += elements[indexPos];
            indexPos++;
        }while(indexPos < elements.length);

        System.out.println("The total is: " + sumTotal);
    }
}
