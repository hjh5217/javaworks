package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char[5][5];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<i+1; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<a.length; i++) {
			for(int j = 4; j>=i; j--) {
				a[i][j] = '*';
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		int[][] b = new int[5][5];
		
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				b[i][j] = (b[i].length*i)+(j+1);
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
