public class ReverseInteger {
    /*
    Given a 32-bit signed integer, reverse digits of an integer.
     */
    public int reverse(int x) {
        String number = String.valueOf(x);
        String rebmun = "";
        int size = number.length();
        if (x < 0) {
            rebmun = "-";
            for(int i = size - 1; i > 0; i--){
                rebmun += String.valueOf(number.charAt(i));
            }
        } else if (x > 0) {
            for(int i = size - 1; i >= 0; i--)
                rebmun += String.valueOf(number.charAt(i));
        } else {
            rebmun = "0";
        }
        if(Double.parseDouble(rebmun) > 2147483647 || Double.parseDouble(rebmun) < -2147483648)
            return 0;
        else
            return Integer.parseInt(rebmun);
    }
}
