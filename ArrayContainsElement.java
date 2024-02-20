// check if array contains an element or not
public class ArrayContainsElement {
    public static void main(String[] args){
        int arr[] = {1,2,3,4};  
        int num = 5;
        System.out.println(search(arr,arr.length,num));
    }

static int search(int arr[], int N, int X)
{
    int index=-1;
    for(int i = 0 ; i < N ; i++){
        if(arr[i]  == X){
            index = i;
        }
    }
    return index;
    }
}
