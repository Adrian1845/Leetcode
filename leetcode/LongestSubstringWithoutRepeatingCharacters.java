package Ejercicios.leetcode;
/*
Given a string s, find the length of the longest
substring
without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
public class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public static int lengthOfLongestSubstring(String s) {

            String aux = "";
            String occText = "";

            for(int i = 0; i < s.length(); i++) {
                if(aux.contains(s.substring(i, i+1))) {
                    i = 0;

                    s = s.substring(aux.indexOf(s.substring(i, i+1))+1, s.length());
                    aux = s.substring(i, i+1);

                    if(aux.contains(s.substring(i, i+1))) {
                        aux = s.substring(i, i+1);
                    }
                    else {
                        aux += s.substring(i, i+1);
                    }
                }

                else {
                    aux += s.substring(i, i+1);
                    if(aux.length() >  occText.length()){
                        occText = aux;
                    }
                }
            }

            return occText.length();
        }
    }
}
