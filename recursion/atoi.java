package recursion;
public class atoi {
    public static int myAtoi(String s) {
        int state=0,value=0,pos=0;
        int sign=1;
        int len = s.length();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(pos<len){
            char currentChar=s.charAt(pos);
            if(state==0){
                if(currentChar==' ');

                else if(currentChar=='+' || currentChar=='-'){

                    if(currentChar=='+') state=1;
                    else{
                        sign=-1;
                        state=1;
                    }
                }
                else if(Character.isDigit(currentChar)){
                    value*=10;
                    value+=Character.getNumericValue(currentChar);
                    state=2;
                }
                else return 0;
            }
            else if (state==1){
                if (Character.isDigit(currentChar)){
                    state=2;
                    value*=10;
                    value+=Character.getNumericValue(currentChar);
                }
                else {
                    return 0;
                }
            }
            else if (state==2){

                if(Character.isDigit(currentChar)){
                    int digit = Character.getNumericValue(currentChar);
                    if (value > (max - digit) / 10) {
                        return sign == 1 ? max : min;
                    }
                    value*=10;
                    value+=Character.getNumericValue(currentChar);
                }
                else{
                    break;
                }
            }
            else {
                return 0;
            }
            pos++;
        }
        value*=sign;
        return value;
    }

    public static void main(String[] args) {
        String s = "-91283472332";
        int value = myAtoi(s);
        System.out.println(value);
    }

}


