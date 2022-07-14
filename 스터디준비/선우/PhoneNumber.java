package 스터디준비.선우;

public class PhoneNumber {
    public static void main(String[] args) {
        String phone_number = "01012345678";
        StringBuilder stringBuilder = new StringBuilder(20);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            stringBuilder.append("*");
        }
        System.out.println(stringBuilder.append(phone_number.substring(phone_number.length() - 4)));
    }
}
