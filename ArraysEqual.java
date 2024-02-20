//check if 2 arrays are equal or not
import java.util.*;
public class ArraysEqual{
    public static void main(String[] args){
        long[] A = {1,2,1,4,0};
        long[] B = {2,4,1,0,1};
        System.out.println(check(A,B,A.length));
        int n=5;
        
        for (int i=0;i< n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static boolean check(long A[],long B[],int N)
    {
        // boolean flag=true;
//         long temp,temp1;

// // with sort() 
//         Arrays.sort(A);
//         Arrays.sort(B);

//         if(Arrays.equals(A, B)){
//             flag = true;
//         }
//         else{
//             flag = false;
//         }
       
// // with Bubble sort
//         for(int i=0;i<N-1;i++){
//             for(int j=0;j<N-i-1;j++){
//                 if(A[j]>A[j+1]){
//                     temp = A[j];
//                     A[j] = A[j+1];
//                     A[j+1] = temp;
//                 }
//             }
//         }


//         for(int i=0;i<N-1;i++){
//             for(int j=0;j<N-i-1;j++){
//                 if(B[j]>B[j+1]){
//                     temp1 = B[j];
//                     B[j] = B[j+1];
//                     B[j+1] = temp1;
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(A));
//         System.out.println(Arrays.toString(B));
//         for(int i=0;i<N;i++){
//             if(A[i]==B[i]){
//                 flag = true;
//             }else{
//                 flag = false;
//             }
//         }
        Map<Long,Integer> freqA = createFreqMap(A);
        Map<Long,Integer> freqB = createFreqMap(B);

        if(freqA.equals(freqB)){
            return true;
        }else{
            return false;
        }
        
    }
    public static Map<Long,Integer> createFreqMap (long[] A){
        Map<Long,Integer> checkMap = new HashMap<>();
        for(long num : A){
            checkMap.put(num,checkMap.getOrDefault(num,0)+1);
        }
        return checkMap;
    }
}