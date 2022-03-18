class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int firstInt = hm.get(s.charAt(i));
            int secondInt;
            if(i != s.length()-1){
               secondInt = hm.get(s.charAt(i+1));
            } else{
                secondInt=0;
            }
            
            if(s.length()>1){
                if(firstInt<secondInt){
                    firstInt = -firstInt;
                    sum+=firstInt;
                } else{
                    sum+=firstInt;
                }
            }else{
                sum+=firstInt;
            }
        }
        return sum;
    }
}
