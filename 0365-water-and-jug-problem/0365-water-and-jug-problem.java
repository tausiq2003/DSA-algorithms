class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity < targetCapacity){
            return false;
        }
        if (targetCapacity % gcd(jug1Capacity, jug2Capacity) == 0){
            return true;
        }
        return false;
    }
    static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}