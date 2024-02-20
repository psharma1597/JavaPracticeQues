//print occurrence of a word in string
public class WordOccrrenceInString{
    public static void main(String[] args){
        String str = "My name is name Payal name is popular name";
        String check = "name";
        int occurrence=0;

        String[] arr = str.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(check.equalsIgnoreCase(arr[i])){
                occurrence++;
            }
        }
        System.out.println("The word "+check+" occurs "+occurrence+" times");
        for(int i=arr.length-1;i>=0.;i--){
            System.out.print(arr[i]+" ");
        }

        String s1="a";
        String s2="A";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}