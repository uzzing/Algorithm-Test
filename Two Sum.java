class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        
        int[] array = new int[2];
        
        for (int i = 1; i < nums.length; i++) {
            // nums[i] + nums[j] == target
            // nums[j] == target - nums[i]
            
            int value = target - nums[i];
            
            if (map.containsKey(value)) {
                array[0] = map.get(value);
                array[1] = i;
                break;
            }
            else
                map.put(nums[i], i);
        }
        
        return array;
    }
}