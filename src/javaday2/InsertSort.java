package javaday2;

public class InsertSort extends DaySo implements Sort {

	public InsertSort(int n) {
		super(n);
		
	}

	@Override
	public void Sort() {
		InsertSort(t,n);
	}
	private static void InsertSort(int []A, int n) {
		for(int i=1; i<n; i++) {
			int x = A[i];
			int y = i;
			while( y > 0 && A[ y - 1 ] > x ) {
				A[y]=A[y-1];
				y--;
			}
			A[y]=x;
		}
	}
}
