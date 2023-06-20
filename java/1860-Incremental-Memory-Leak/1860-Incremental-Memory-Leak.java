class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int i = 0;
        while(memory1 >= i || memory2 >= i){
            if(memory1 >= i && memory1 >= memory2){
                memory1 -= i;
            }
            else{
                memory2 -= i;
            }
            i++;
        }
        int[] result = new int[]{i, memory1, memory2};
        return result;
    }
}