public class Array2D {

    public static void main(String[] args) {
        
        // 2D array with 3 rows and 4 columns
    	int[][] myArray = new int[3][4];
        //int[][] myArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        
        // populate the array with values
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;
        
        myArray[1][0] = 5;
        myArray[1][1] = 6;
        myArray[1][2] = 7;
        myArray[1][3] = 8;
        
        myArray[2][0] = 9;
        myArray[2][1] = 10;
        myArray[2][2] = 11;
        myArray[2][3] = 12;
        
        // print the values in the array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
