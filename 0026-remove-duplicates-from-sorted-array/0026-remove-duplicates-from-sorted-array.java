class Solution {
    public int removeDuplicates(int[] num){
        int count = 1;
        if (num.length == 0) {
            return 0;
        }

        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[i - 1]) {
                num[count] = num[i];
                count++;
            }
        }

        return count;
    }
}
        
        

        
