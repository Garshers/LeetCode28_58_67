# LeetCode Examples in Java

This repository contains Java examples of common problems solved on LeetCode. Each example demonstrates a solution to a specific problem using basic concepts.

## Example Problems and Solutions

### 1. Implement strStr()
   - **Problem Description**: Implement the `strStr()` function which finds the index of the first occurrence of the substring `needle` in string `haystack`.
   - **Example Usage**:
     ```java
     String haystack = "LeetCode";
     String needle = "Cod";
     int result;
     result = App.strStr(haystack, needle);
     System.out.println(result); // Output: 3
     ```

   - **Solution Method**: 
     ```java
     public static int strStr(String haystack, String needle) {
         if (needle.isEmpty()) {
             return -1;
         }
         return haystack.indexOf(needle);
     }
     ```

### 2. Length of Last Word
   - **Problem Description**: Given a string `s`, return the length of the last word in the string. A word is defined as a sequence of non-space characters.
   - **Example Usage**:
     ```java
     String exampleString = " To be or not to be, taht is a question.  ";
     int result1 = App.lengthOfLastWord(exampleString);
     System.out.println("Last word length: " + result1); // Output: 8
     ```

   - **Solution Method**:
     ```java
     public static int lengthOfLastWord(String s) {
         s = s.trim(); // Trim leading and trailing spaces
         String[] sArray = s.split(" "); // Split by spaces
         return sArray[sArray.length - 1].length(); // Length of the last word
     }
     ```

### 3. Add Binary Strings
   - **Problem Description**: Given two binary strings `a` and `b`, return their sum (also a binary string).
   - **Example Usage**:
     ```java
     String a = "1010";
     String b = "1011";
     String result2 = App.addBinary(a, b);
     System.out.println(a + " + " + b + " = " + result2); // Output: 1010 + 1011 = 10101
     ```

   - **Solution Method**:
     ```java
     public static String addBinary(String a, String b) {
         StringBuilder result = new StringBuilder();
         int i = a.length() - 1;
         int j = b.length() - 1;
         int carry = 0;

         while (i >= 0 || j >= 0 || carry != 0) {
             int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
             int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

             int sum = digitA + digitB + carry;
             result.append(sum % 2);
             carry = sum / 2;

             i--;
             j--;
         }
         return result.reverse().toString();
     }
     ```

"# LeetCode28_58_67" 
