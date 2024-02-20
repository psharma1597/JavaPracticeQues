//print common elements from all arrays - O(1) complexity
import java.util.*;
public class CommonElementsInArrays1{
    public static void main(String[] args){
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        HashSet<Integer> commonEle = new HashSet<>();
        System.out.println("Common elements are:");
        for(int num : a1){
            if(checkElements(a2,num) && checkElements(a3,num)){
                commonEle.add(num);
            }
        }
        System.out.println(commonEle);
    }

    private static boolean checkElements(Integer[] a, int num){
        for(int num1: a){
            if(num1 == num){
                return true;
            }
        }
        return false;
    }
}