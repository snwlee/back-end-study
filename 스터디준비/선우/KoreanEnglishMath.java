package 스터디준비.선우;

import java.util.Arrays;

public class KoreanEnglishMath {
    public static void main(String[] args) {
        /*
        * 하드 코딩
        * 심신 미약자는 시청을 자제해주세요.
        */
        String student = "12";
        String student1 = "Junkyu 50 60 100";
        String student2 = "Sangkeun 80 60 50";
        String student3 = "Sunyoung 80 70 100";
        String student4 = "Soong 50 60 90";
        String student5 = "Haebin 50 60 100";
        String student6 = "Kangsoo 60 80 100";
        String student7 = "Donghyuk 80 60 100";
        String student8 = "Sei 70 70 70";
        String student9 = "Wonseob 70 70 90";
        String student10 = "Sanghyun 70 70 80";
        String student11 = "nsj 80 80 80";
        String student12 = "Taewhan 50 60 90";

        String[] studentArr = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12};

        int studentCount = Integer.parseInt(student);

        Student[] students = new Student[studentCount];

        for (int i = 0; i < studentCount; i++) {
            students[i] = new Student(studentArr[i].split(" "));
        }

        /*
        * Arrays.sort() 들어가보니
        * All elements in the array must implement the Comparable interface.
        * 라고 써있다. 처음 알게되었다.
        * Comparable 객체 정렬에 필요한 메서드를 정의한 인터페이스 라고 적어놓았었는데 복습 필요
        */
        Arrays.sort(students);

        for (Student stu : students) {
            System.out.println(stu.name);
        }
    }
}

class Student implements Comparable<Student> {
    public String name;
    public int korean;
    public int english;
    public int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public Student(String... s) {
        this.name = s[0];
        this.korean = Integer.parseInt(s[1]);
        this.english = Integer.parseInt(s[2]);
        this.math = Integer.parseInt(s[3]);
    }
    /*
    * Object 타입으로 매개변수를 받은 후 Student 로 형변환 해서 할려 했더니
    * Object 엔 Student 멤버가 없어서 실패...
    * Comparable 에 지네릭을 사용해서 성공
    * 
    * 처음엔 모든 리턴 값 계산에 o.korean 보다 this.korean 을 앞에 두어 실패
    * 문제를 다시 잘 읽어보니 과목끼리 정렬 기준이 다르다...
    * 문제 정렬 기준대로 다시 수정해서 성공
    *
    * 자바의 String compareTo 는 사전 순이라고 한다. (name)
    */
    @Override
    public int compareTo(Student o) {  
        if (this.korean != o.korean) {
            return o.korean - this.korean;
        }
        if (this.english != o.english) {
            return this.english - o.english;
        }
        if (this.math != o.math) {
            return o.math - this.math;
        }
        return name.compareTo(o.name);
    }
}
