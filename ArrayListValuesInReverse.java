// print arraylist values in reverse order
import java.util.*;
public class ArrayListValuesInReverse {
    public static void main(String[] args){
        ArrayList<String> arrLst = new ArrayList<>();
        
        arrLst.add("Payal Sharma");
        arrLst.add("Rohan Kandpal");
        arrLst.add("Age 26");

        System.out.println(arrLst);
        ArrayList<String> newLst = new ArrayList<>(arrLst.size());

        for(String str : arrLst){
            String[] arr = str.split("\\s+");
            String lstValue="";
            if(arr.length>1){
                for(int i=0; i<arr.length; i++){
                    char[] c = arr[i].toCharArray();
                    for(int j=c.length -1; j>=0; j--){
                        lstValue+=c[j];
                    }
                    lstValue+=" ";
                }
                newLst.add(lstValue.substring(0,lstValue.length()-1));
                lstValue="";
            }
        }
        System.out.println(newLst);
    }
}
