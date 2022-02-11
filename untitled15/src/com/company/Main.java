package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input=new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz");
        int heat= input.nextInt();
        if(heat<5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if(heat>=5 && heat<=25){
               if( heat<=15){
                   System.out.print("Sinemaya gidebilirsiniz.");
               }
               if(heat>15){
                   System.out.print("Pikniğe gidebilirsiniz.");

               }

            }else System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }

