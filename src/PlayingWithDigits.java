import java.util.Arrays;

public class PlayingWithDigits {

    public int exec(Integer number, Integer base){
            int totalPow = powRun(number.toString().split(""), base);
            boolean funnyPropertie = true;
            for (int exponent = 1; funnyPropertie; exponent++){
                long valFunnyNum =  number*exponent;
                if (totalPow == valFunnyNum){
                    return exponent;
                }
                else if (valFunnyNum>totalPow || exponent>1000000){
                    return -1;
                }
            }
            return -1;
        }
        /**
         *Method used to return the pow of every digit
         * Example
         * numberSplitted = [1,2,3,4,5,6]
         * base = 3
         *
         * @operation =  (1**2) + (2**3) + (3**4) + (4**5) + (5**6);
         *
         * @return int
         * @params numberSplitted array from the digits of the numbers
         * @params base, base of the pow where will begin
         */
        private int powRun (String[] numberSplited, Integer base){

            int tmp = 0;
            int numberIndex = 0;
            for (Integer i = base; i<numberSplited.length+base; i++){
                Double digit = Double.parseDouble(numberSplited[numberIndex]);
                tmp += Math.pow(digit,i);
                numberIndex++;
            }
            return tmp;
        }
}
