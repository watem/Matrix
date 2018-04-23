/**
 *
 */
public static class MatrixArrays {
	public static void main (String[] args)  {
		// test data supplied by the teacher
		int staticArray1 = { 15, 5, 4,7, 9 },
			  staticArray2 = { 11, 20, 9 ,2,1 },
			  staticArray3 = { 10, 5, 4 },
			  staticArray4 = { 12, 11, 20,3,2,1 }
			  static2dArray = { {1,2,3 }, {4,5,6, 7} {8,9}};
		// end test data supplied by the teacher
	}  // main()

	/**
	team member a
	**/
	public static void print1DArray(int array[]) {
		for (int i=0;i<array.length;i++) {
			System.out.print(i": "+array[i]+"\t");
		}
	}  //end print1DArray()


	/**
	team member a
	**/
  public static int [][]  matrixMult(int [] array1, int [] array2){
		int[][] arrayMult = new int[array1.length][array2.length];
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				arrayMult[i][j]=array[i]*array2[j];
			}
		}
		print2DArray(arrayMult);
		Return arrayMult;
	}  //end matrixMult()

	/**
	team member b
	**/
	public static void print2DArray(int array[][]) {

	}  //end print2DArray()

	/**
	team member b
	**/
	public static int [][] scalarMultiply(int [][] array, int mult) {

//Return a new array
	}  //end scalarMultiply()

	/**
	both members
	**/
	public static boolean areEqual2d(int [][] array1, int [][] array2) {

	}  //end areEqual2d()
}  // end class
