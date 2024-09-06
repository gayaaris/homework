package com.assesment;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        for( int x =0; x<=100; x++)
            if ( x%5 ==0 && x%3 == 0){
                System.out.println(x+ " , ");
            }
    }
}
