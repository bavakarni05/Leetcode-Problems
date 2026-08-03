class Solution {
    public int calculate(String s) {
        int lastNumber=0;
        int currentNumber=0;
        char lastoperator='+';
        int totalSum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                 currentNumber=currentNumber*10+(ch-'0');
            }
            if(!Character.isDigit(ch) && ch!=' ' || i==s.length()-1){
                if(lastoperator=='+'){
                    totalSum+=lastNumber;
                    lastNumber=currentNumber;
                }
                else if(lastoperator=='-'){
                    totalSum+=lastNumber;
                    lastNumber=-currentNumber;
                }
                else if(lastoperator=='*'){
                    lastNumber=lastNumber*currentNumber;
                }
                else if(lastoperator=='/'){
                    
                    lastNumber=lastNumber/currentNumber;
                }
                 lastoperator=ch;
                 currentNumber=0;
            }
        }
        totalSum+=lastNumber;
        return totalSum;
    }
}