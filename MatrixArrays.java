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
		
	int size = array.length;
	for (int i = 0; i < size; i++) {
	System.out.print(i + " : " + array[i] + " \t ");

	}  //end print1DArray()


	/**
	team member a
	**/
  public static int [][]  matrixMult(int [] array1, int [] array2){

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
		
	int row = array.length;
			   
	for (int r = 0; r< row ; r++) {
	int col = array[r].length;
				   
			 
	for(int c = 0; c < col; c++) {
				   
	System.out.print(" (" + r + "," + c + "): " + array[r][c] + "\t");
			
				   
	 }
	System.out.println();
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
			   
	int [][] multArray = array;
					   
	for (int r = 0; r< row ; r++) {

	int col = array[r].length;
				   

	for(int c = 0; c < col; c++) {
				   
	multArray[r][c] = mult*array[r][c]; //Multiply the values of the initial array by a scalar
	}
	}
	return multArray; //Return a new array


	}  //end scalarMultiply()

	/**
	both members
	**/
	public static boolean areEqual2d(int [][] array1, int [][] array2) {

	}  //end areEqual2d()
}  // end class
