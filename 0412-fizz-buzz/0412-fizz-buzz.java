class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(10);
        for(int i = 1; i <= n; i++){
            String element = "";
            if(i % 3 == 0 && i % 5 == 0){element+="FizzBuzz";}
            else if(i % 3 ==0){element+="Fizz";}
            else if(i % 5 == 0){element+="Buzz";}
            else{element += i;}
            list.add(element);
        }
        return list;
        
    }
}