// print second largest and samllest element from array

import java.util.Scanner;
public class SecondLargestSmallestNum {
    // public static void main(String[] args){
    //     Integer[] a1 = {1,2,3,15,7,0};

    //     int temp=0;
    //     for(int i=0; i<a1.length-1; i++){
    //         for(int j= i+1; j<a1.length; j++){
    //             if(a1[i]>a1[j]){
    //                 temp = a1[i];
    //                 a1[i] = a1[j];
    //                 a1[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println("Second largest = "+a1[a1.length-2]);
    //     System.out.println("Second smallest = "+a1[1]);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0, n=2,f;
        while(count<num){
            f=0;
            if(num<=1){
                System.out.println("Empty input");
            }
            for(int i=2; i*i <= n; i++){
                if(n % i ==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(n);
                count++;
            }
            n++;
       }
        sc.close();
    }
}
