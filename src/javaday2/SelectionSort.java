package javaday2;

public class SelectionSort extends DaySo implements Sort {

	public SelectionSort(int n) {
		super(n);
	}
	@Override
	public void Sort() {
		SelectionSort(t,n);
	}
	private static void hoan_vi(int []A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	private static void SelectionSort(int []A, int n) {
		for(int i=0; i<n-1; i++) {
			int minArr = i;
			for(int j=i+1; j<n; j++) {
				if(A[minArr]>A[j]) {
					minArr = j;
				}
			}
			if(i!=minArr)
				hoan_vi(A, minArr, i);
		}
	}
}
