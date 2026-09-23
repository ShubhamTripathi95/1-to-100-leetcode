class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : num.toCharArray()) {
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String ans = sb.substring(i);
        return ans.isEmpty() ? "0" : ans;
    }
}