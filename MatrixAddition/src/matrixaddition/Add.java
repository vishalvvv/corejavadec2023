package matrixaddition;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,},{3,4,}};
		int b[][] = {{5,6},{7,8}};
		
	//	int e[] = new int [19]; for defining increase in the size of matrix
		
		int c[][] = new int[2][2];
		if(a.length == b.length && a[0].length == b[0].length) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j] = a[i][j]+b[i][j];
				
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

	}
		else {
			System.out.println("addition is not possible");
		}
	}

}
