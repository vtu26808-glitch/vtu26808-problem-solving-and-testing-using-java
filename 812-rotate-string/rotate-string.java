class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        // s+s contains all possible rotations of s
        String newString = s + s;

        return newString.contains(goal);
    }
}