class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] nums3=new int[nums1.length+nums2.length];
        int k=0;

        for(int i=0;i<nums1.length;i++){
            nums3[k]=nums1[i];
            k++;
        }
        for(int i=0;i<nums2.length;i++){
            nums3[k]=nums2[i];
            k++;
        }

        Arrays.sort(nums3);

        int l=nums3.length;

        if(l%2==1){
            int median=nums3[l/2];
            return median;
        }
        else{
            int median1=nums3[(l/2)-1];
            int median2=nums3[(l/2)];
            double median=(median1+median2)/2.0;
            return median;
        }
    }
}