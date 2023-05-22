package twodimention;

public class HouseHold {

	public static void main(String[] args) {
		int[][] apt = new int[5][3];
		//1행 3열 1차원 배열
		apt[2] = new int[1];
		
		System.out.printf("5층 %d세대\n",apt[4].length);
		System.out.printf("4층 %d세대\n",apt[3].length);
		System.out.printf("3층 %d세대\n",apt[2].length);
		System.out.printf("2층 %d세대\n",apt[1].length);
		System.out.printf("1층 %d세대\n",apt[0].length);
		
	}

}
