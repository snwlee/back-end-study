package Test_0721;

import java.io.IOException;

public class Interface_Implement {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B : BubbleSort");
		System.out.println("C : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null; // 인터페이스를 upcasting하여 사용(인터페이스를 활용한 다형성 확장)
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		// 정렬 방식과 상관없이 Sort에 선언된 메서드 호출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
		
	}
}

interface Sort { // 인터페이스
	void ascending(int[] arr);
	void descending(int[] arr);
	void description();
}
class BubbleSort implements Sort { // 인터페이스를 상속한 클래스 BubbleSort
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("BubbleSort입니다.");
	}
}
class HeapSort implements Sort { // 인터페이스를 상속한 클래스 HeapSort
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort ascending");
	}
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("HeapSort입니다.");
	}
}
class QuickSort implements Sort { // 인터페이스를 상속한 클래스 QuickSort
	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort ascending");
	}
	@Override
	public void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
		System.out.println("QuickSort입니다.");
	}
}
