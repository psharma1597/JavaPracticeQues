//print common elements from all arrays - O(n) complexity
import java.util.*;
public class CommonElementsInArraysOn{
    public static void main(String[] args){
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        HashSet<Integer> i1 = new HashSet<>();
        for(int i: a1){
            i1.add(i);
        }
        HashSet<Integer> i2 = new HashSet<>();
        for(int i: a2){
            i2.add(i);
        }
        HashSet<Integer> i3 = new HashSet<>();
        for(int i: a3){
            i3.add(i);
        }
        System.out.println("Common Elements are =");
        for(int num : i1){
            if(i2.contains(num) && i3.contains(num)){
                System.out.println(num);
            }
        }
    }
}