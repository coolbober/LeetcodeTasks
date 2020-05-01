public class PalindromeNumber {

    /*
    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    Example 1:
    Input: 121
    Output: true

    Example 2:
    Input: -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String rebmun = "";
        for(int i =  number.length()-1; i >= 0; i--)
            rebmun += String.valueOf(number.charAt(i));
        return rebmun.equals(number) ? true : false;
    }
}
