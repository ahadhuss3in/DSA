public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,11,33,46,89,90,112,333,449,589,687,1112,1489};
        int target = 90;
        System.out.println(sum(arr,target));
    }
    public static int  sum(int[] arr, int target ){
        int start =0;
        int end = 1;
        while (target > arr[end]){
            // just need to increase the new start value by 1 greater than the prev end
            int newStart = end + 1;
            // for the new end we keep doubling the size of the subarray we take hence for this we need
            // to just end + size of sub array (end-start+1) mult 2
             end += (end-start + 1) * 2;
             start = newStart;

        }
        return binarysearch(arr,target,start,end);
    }

    public static int binarysearch(int[] arr , int target , int start , int end){

        if(target > arr[arr.length-1]){
            return -1;
        }
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

        return -1;
    }
}
