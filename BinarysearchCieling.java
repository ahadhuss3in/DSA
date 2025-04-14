// to find the smallest number greater than the target number in a array;

public class BinarysearchCieling {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,19,22,23,28};
        int target = 20;
        int ans = cieling(arr,target);
        System.out.println(arr[ans]);
    }

    public static int cieling(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){
            int mid = start +(end - start) /2;

            if (target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

        }

        return  start ;//return the start element , since the loop exists when condition start>end comes true
        // that means its in the next element after target
    }

}
