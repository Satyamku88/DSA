class Solution {
    static char nonRepeatingChar(String s) {
        // code here
         Map<Character, Integer> map = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeating character is found
        return '$';
    }
}
