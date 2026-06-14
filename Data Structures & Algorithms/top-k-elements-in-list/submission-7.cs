public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        
        var dict = new Dictionary<int, int>();
        for(int i = 0; i < nums.Length; i++){
            dict[nums[i]] = dict.GetValueOrDefault(nums[i], 0) + 1;
        }
        
        List<int>[] arr = new List<int>[nums.Length + 1];
        for(int i = 0; i < arr.Length; i++){
            arr[i] = new List<int>();
        }
        foreach(var num in dict){
            int count = num.Value;
            arr[count].Add(num.Key);
        }

        int[] res = new int[k];
        int index = 0;

        for(int i = nums.Length; i > 0; i--){
            if(index >= k){
                break;
            }
            if(arr[i].Count == 0){
                continue;
            }
            foreach(int j in arr[i]){
                res[index] = j;
                index++;
            }
        }
        return res;



    }
}
