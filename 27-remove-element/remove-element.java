class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i]; // Move it to the 'k' position
                k++; // Increment k to the next available slot
            }


        }

        return k;
    }
}