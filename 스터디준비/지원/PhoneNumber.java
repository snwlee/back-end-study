class Solution {
    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.setCharAt(i, '*');
        }
        return sb.toString();
    }
}
