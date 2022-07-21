package 스터디준비.선우;

import java.io.IOException;
import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");

        int ch = System.in.read();
        Sort sort;
        if (ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        }
        if (ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        }
        if (ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        } else {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

    }
}

interface Sort {
    void ascending(int[] arr);

    void descending(int[] arr);

    void description();
}

class QuickSort implements Sort {
    @Override
    public void ascending(int[] arr) {

    }

    @Override
    public void descending(int[] arr) {

    }

    @Override
    public void description() {

    }
}

class HeapSort implements Sort {
    @Override
    public void ascending(int[] arr) {

    }

    @Override
    public void descending(int[] arr) {

    }

    @Override
    public void description() {

    }
}

class BubbleSort implements Sort {
    @Override
    public void ascending(int[] arr) {

    }

    @Override
    public void descending(int[] arr) {

    }

    @Override
    public void description() {

    }
}