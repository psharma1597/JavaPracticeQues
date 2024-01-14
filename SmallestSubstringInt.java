/*
 * Given a string S consisting of the characters 0, 1 and 2.
 * find the length of the smallest substring of string S that contains all the three characters 
 * 0, 1 and 2. If no such substring exists, then return -1.
 */
public class SmallestSubstringInt{
    public static void main(String[] args){
        String S = "121210";
        int n = S.length();
        int start =0; int end=0;
        int minLength = Integer.MAX_VALUE;
        int[] count = new int[3];
        int foundCount =0;

        while(end<n){
            count[S.charAt(end) - '0']++;
            if (count[0]>0 && count[1]>0 && count[2]>0){
                foundCount++;
            }

            while(foundCount ==1){
                minLength = Math.min(minLength, end-start+1);
                count[S.charAt(start)-'0']--;

                if(count[S.charAt(start)-'0'] == 0){
                    foundCount--;
                }
                start++;
            }
            end++;
        }
        System.out.println((minLength == Integer.MAX_VALUE) ? -1 : minLength);
    }

}
