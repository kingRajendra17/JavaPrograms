public class Array3D {

    public static void main(String[] args) {
        
        // 3D array with 2 layers, 3 rows, and 4 columns
        //int[][][] myArray = new int[2][3][4];
        int[][][] myArray = {{ {1,2,3,4}, {5,6,7,8}, {9,10,11,12}}, {{13,14,15,16}, {17,18,19,20}, {21,22,23,24}} };
        
        // populate the array with values
        /*myArray[0][0][0] = 1;
        myArray[0][0][1] = 2;
        myArray[0][0][2] = 3;
        myArray[0][0][3] = 4;
        
        myArray[0][1][0] = 5;
        myArray[0][1][1] = 6;
        myArray[0][1][2] = 7;
        myArray[0][1][3] = 8;
        
        myArray[0][2][0] = 9;
        myArray[0][2][1] = 10;
        myArray[0][2][2] = 11;
        myArray[0][2][3] = 12;
        
        myArray[1][0][0] = 13;
        myArray[1][0][1] = 14;
        myArray[1][0][2] = 15;
        myArray[1][0][3] = 16;
        
        myArray[1][1][0] = 17;
        myArray[1][1][1] = 18;
        myArray[1][1][2] = 19;
        myArray[1][1][3] = 20;
        
        myArray[1][2][0] = 21;
        myArray[1][2][1] = 22;
        myArray[1][2][2] = 23;
        myArray[1][2][3] = 24;*/
        
        // print the values in the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < myArray[i].length; j++) {
            	
                for (int k = 0; k < myArray[i][j].length; k++) {
                	
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
