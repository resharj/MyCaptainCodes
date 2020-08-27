package arrays;

public class Arrays {
	static int a1[][]= {{1,3,4},{2,4,3},{3,4,5}};
	static int a2[][]= {{1,3,4},{2,4,3},{1,2,4}};
	public static void main(String[] args) {
		
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					int s=a1[i][j]+a2[i][j];
					System.out.print(s+" ");
				}
				System.out.println("\n");
			}
		}
	}