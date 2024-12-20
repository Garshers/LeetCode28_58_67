
public class App {
    public static void main(String[] args) {
        String haystack = "LeetCode";
        String needle = "Cod";
        int result;
        result = strStr(haystack, needle);
        System.out.println(result);

        String exampleString = " To be or not to be, taht is a question.  ";
        int result1 = lengthOfLastWord(exampleString);
        System.out.println("Last word: " + result1);

        String a = "1010";
        String b = "1011";
        String result2 = addBinary(a, b);
        System.out.println(a + "+" + b + "=" + result2);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return -1;
        }

        return haystack.indexOf(needle);
    }

    public static int lengthOfLastWord(String s) {
        s=s.trim();
        String [] sArray = s.split(" ");
        return sArray[sArray.length-1].length();
    }

    public static String addBinary(String a, String b) { //67
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0; //if i >= 0 is true translate string character to intiger one, if false then make it 0
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            
            int sum = digitA + digitB + carry; // Compute the sum of current digits and the carry
            result.append(sum % 2); // Append the result of sum % 2 to the result (binary addition rule)
            carry = sum / 2; // Update the carry (sum / 2 for binary)

            i--; // Move to the previous digit
            j--;
        }
        return result.reverse().toString();
    }
}