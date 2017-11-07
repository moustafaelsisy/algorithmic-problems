package sumNumbers;


public class SumNumbers {
    public static int sumNumbers(String str){
            int sum = 0;
            int index = 0;

            while(index < str.length()){

                if( !Character.isDigit(str.charAt(index)) ){
                    index += 1;
                }
                else{
                    int start = index;
                    int end = start+1;
                    while( end < str.length() && Character.isDigit(str.charAt(end)) ){
                        end += 1;
                    }
                    sum += Integer.parseInt(str.substring(start, end));
                    index = end;
                }

            }

            return sum;
    }
}
