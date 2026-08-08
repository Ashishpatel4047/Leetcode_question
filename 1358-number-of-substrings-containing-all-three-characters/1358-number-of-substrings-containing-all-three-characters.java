class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // For 'a', 'b', 'c'
        int res = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            // Move left pointer as far as we can while still having all three characters
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += s.length() - right; // All substrings from left to end are valid
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return res;
        
    }
}