/**
 *
 */
public class MatrixArrays {
	public static void main (String[] args)  {
		// test data supplied by the teacher
		int staticArray1[] = { 15, 5, 4,7, 9 },
			  staticArray2[] = { 11, 20, 9 ,2, 1 },
			  staticArray3[] = { 10, 5, 4 },
			  staticArray4[] = { 12, 11, 20,3,2,1 },
			  static2dArray[][] = { {1,2,3 }, {4,5,6, 7}, {8,9}};
		// end test data supplied by the teacher

		//Matthew
		  System.out.println("\nMatrix multiplication of array1 and array2 =");
			print1DArray(staticArray1);
			System.out.println("X");
		  print1DArray(staticArray2);
			System.out.println("=");
			matrixMult(staticArray1,staticArray2);

			System.out.println("\nMatrix multiplication of array3 and array4 =");
		  print1DArray(staticArray3);
			System.out.println("X");
		  print1DArray(staticArray4);
			System.out.println("=");
			matrixMult(staticArray3,staticArray4);


		  //Yulia

		  //Display first 2D array
		  System.out.println();
		  System.out.println("The initial 2D array is : ");
		  print2DArray(static2dArray);


		  //Create and display the multiple array of the first one

		  System.out.println("The multiplied 2D array is : ");
		  int[][] multArray = scalarMultiply(static2dArray, 5);
		  print2DArray(multArray);

		//Compare initial 2D array with its new MultArray
		System.out.println("\ncomparison between new array to static2dArray");
		 if (areEqual2d(static2dArray, multArray)) {
			 System.out.println("The 2 arrays are equal");
		 }else {
			 System.out.println("The 2 arrays are not equal");
		 }

		 //Compare initial 2D Array to itself
		 System.out.println("\ncomparison between static2dArray to itself");
		 if(areEqual2d(static2dArray, static2dArray)) {
			 System.out.println("The 2 arrays are equal");
		 }else {
			 System.out.println("The 2 arrays are not equal");
		 }




	}  // main()

	/**
	team member a
	**/
	public static void print1DArray(int array[]) {
		for (int i=0;i<array.length;i++) {
			System.out.print(i+": "+array[i]+"\t");
		}
		System.out.println();
	}  //end print1DArray()


	/**
	team member a
	**/
  public static int [][]  matrixMult(int [] array1, int [] array2){
		if (array1.length==array2.length) {
			int[][] arrayMult = new int[array1.length][array2.length];
			for (int i=0;i<array1.length;i++) {
				for (int j=0;j<array2.length;j++) {
					arrayMult[i][j]=array1[i]*array2[j];
				}
			}
			print2DArray(arrayMult);
			return arrayMult;
		}
		else {
			System.out.println("Error: matrix size mismatch");
			return null;
		}
	}  //end matrixMult()

	/**
	* This method will display the content of a 2D array
	*
	* @param int array[][]
	* @author Yulia Kosharych
	* @version 2018/04/24
	*
	**/
	public static void print2DArray(int array[][]) {
		// int row = array.length;
		for (int r = 0; r<array.length ; r++) {
		// int col = array[r].length;
			for(int c = 0; c < array[r].length; c++) {
				System.out.print("(" + r + "," + c + "): " + array[r][c] + "\t");
			}
			// System.out.println();
			System.out.println();
		}
	}  //end print2DArray()

	/**
	* This method will return a new array obtained by multyplying the initial 2D array by a scalar
	*
	* @param int [][] array, int mult
	* @author Yulia Kosharych
	* @version 2018/04/24
	*
	**/
	public static int [][] scalarMultiply(int [][] array, int mult) {

	int row = array.length;

	int [][] multArray = new int[row][];

	for (int r = 0; r< row ; r++) {

	int col = array[r].length;

	multArray[r] = new int[col];
	for(int c = 0; c < col; c++) {

	multArray[r][c] = mult*array[r][c];

	 }
	 }
	return multArray;


	}  //end scalarMultiply()

	/**
	both members
	**/
	public static boolean areEqual2d(int [][] array1, int [][] array2) {

	//Compare the number of rows of two arrays, if they is not the same the arrays are automatically not equal
	if (array1.length == array2.length) {

	//Compare the number of columns of two arrays, if they are not the same the arrays are automatically not equal
	for(int row=0; row<array1.length; row++) {

	//Compare the values of two arrays stored in [row][col]
	if(array1[row].length == array2[row].length) {

	for(int col = 0; col<array1[row].length; col++) {

	if(array1[row][col] != array2[row][col]) {

	return false;

	}
	}
	}else {

	return false;
	}
	}

	}else {

	return false;
	}

	return true;

	}//end areEqual2d()
}  // end class
