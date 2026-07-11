class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        int maxValue[]=new int [3];
        for(int [] triplate : triplets){
            if(triplate[0] <= target[0] && triplate[1] <= target[1] && triplate[2] <= target[2]){
                maxValue[0]=Math.max(maxValue[0],triplate[0]);
                maxValue[1]=Math.max(maxValue[1],triplate[1]);
                maxValue[2]=Math.max(maxValue[2],triplate[2]);
            }
        }
        return (maxValue[0]==target[0]&&maxValue[1]==target[1]&&maxValue[2]==target[2]);
    }
}
