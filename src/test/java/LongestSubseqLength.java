import java.util.Arrays;

/**
 * Created by srikanthsadhu
 */
public class LongestSubseqLength {

    public static void main(String args[]) {
//    Define example lists
        int[] arr = new int[]{1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] arr3 = {2, 7, 1, 8, 2, 8, 1};
        int[] arr4 ={};
//       display results
        System.out.println("Longest subseq for array: " + Arrays.toString(arr) + "is: " + LongestSubseqLength.maxLengthOfSubSeqIn(arr));
        System.out.println("Longest subseq for array: " + Arrays.toString(arr1) + "is: " + LongestSubseqLength.maxLengthOfSubSeqIn(arr1));
        System.out.println("Longest subseq for array: " + Arrays.toString(arr3) + "is: " + LongestSubseqLength.maxLengthOfSubSeqIn(arr3));
        System.out.println("Longest subseq for array: " + Arrays.toString(arr4) + "is: " + LongestSubseqLength.maxLengthOfSubSeqIn(arr4));

    }

    public static int maxLengthOfSubSeqIn(int[] array) {
        if (array.length <= 1) return array.length; // check for null elements
        int longestLengthSubseq = 1;
        int presentLengthSubseq = 1;
        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i - 1]) {
//                System.out.println("array["+i+"]:"+array[i]+"is > array[i-1]:"+array[i-1]+" hence increasing presentLengthSubseq");
                presentLengthSubseq++;
//                System.out.printlon("presentLengthSubseq is :"+presentLengthSubseq);
            } else {
                if (longestLengthSubseq < presentLengthSubseq)
                    longestLengthSubseq = presentLengthSubseq;
                presentLengthSubseq = 1;

            }

        }
        //if final element is included in longestLengthSubseq
        if (longestLengthSubseq < presentLengthSubseq)
            return presentLengthSubseq;
        return longestLengthSubseq;
    }

}
