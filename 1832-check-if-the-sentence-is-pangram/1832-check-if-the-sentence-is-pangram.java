class Solution {
    public boolean checkIfPangram(String sentence) {
        String checker = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        
        List<String> list = new ArrayList<>(Arrays.asList(sentence.split("")));
        List<String> arr = new ArrayList<>(Arrays.asList(checker.split(",")));
        return list.containsAll(arr);

        
    }
}