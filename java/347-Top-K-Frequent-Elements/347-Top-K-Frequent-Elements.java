class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<NumFreq> NumFreqs = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length == 1)
            return nums;

        int frequency = 0;
        for(int i = 1; i < nums.length; i++){
            frequency--;
            if(nums[i-1] != nums[i]){
                NumFreqs.add(new NumFreq(nums[i-1], frequency));
                frequency=0;
                if(i == nums.length-1){
                    NumFreqs.add(new NumFreq(nums[nums.length-1], 1));
                }
            }
            else if(i == nums.length-1){
                frequency--;
                NumFreqs.add(new NumFreq(nums[nums.length-1], frequency));
            }
        }

        Collections.sort(NumFreqs, Comparator.comparing(item -> item.frequency));

        int[] output = new int[k];
        for(int i = 0; i < k; i++){
            output[i] = NumFreqs.get(i).number;
        }

        // for(int i = 0; i < NumFreqs.size(); i++){
        //     System.out.println(NumFreqs.get(i).number + " : " + NumFreqs.get(i).frequency);
        // }

        return output;
    }
}

class NumFreq {
    int frequency = 0;
    int number = 0;
    
    NumFreq(int a, int b){
        number = a;
        frequency = b;
    }
}
        