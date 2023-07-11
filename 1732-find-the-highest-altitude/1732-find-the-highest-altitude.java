class Solution {
    public int largestAltitude(int[] gain) {
        int ground = 0;
        int mxm = 0;
        for(int i = 0; i < gain.length; i++){
            ground += gain[i];
            
            mxm = Math.max(mxm, ground);
            

        }
        return mxm;
        
    }
}