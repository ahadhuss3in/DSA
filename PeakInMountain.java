// peak index in a Mountain array ( increases in one and then starts decreasing )
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakInMountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // the element is in descending phase of the mountain
                // maybe ans or look left;
                end = mid;

            }
            else{
                // u are in asc part of array;
                start = mid+1;
                // since start is greater so we take next
            }
        }
        // in end start == end which is largest
        return end;
    }
}
