package TarefaDeProgramacaoII;
class Solution1 {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        String str_digits = "" + String.valueOf(digits);

        System.out.println(str_digits);
       /*  for(int i=0; i<digits.length;i++){
            str_digits+= digits[i];
           
        }
         for(int i=0; i<digits.length;i++){
            
           digits[i]= (int)(str_digits.charAt(i));
        }*/
        
        return digits;
    }
}
public class Solution {

    public static void main(String[] args) {
       int[] digit = {1,2,3,4,5};
       Solution1 n = new Solution1();
        System.out.println(n.plusOne(digit));;
    }
}
