public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
        Dictionary<int, int> map = new Dictionary<int, int>();

        for(int i = 0; i < numbers.Length; i++){
            map.Add(numbers[i], i);
        }
        int[] res = new int[2];
        for(int i = 0; i < numbers.Length; i++){
            int diff = target - numbers[i];
            if(map.ContainsKey(diff)){
                res[0] = map[diff] + 1;
                res[1] = i + 1;
            }
        }
        return res;
    }
}
