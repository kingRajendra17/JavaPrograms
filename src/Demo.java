public class Demo {
	public static void main (String [] args) {

     int[][][][] arr =  {{{{1,2},{5,6},{9,10},{13,14}}}}; // 4D Array
     
    for (int i = 0;i <arr.length;i++) {
    	for (int j = 0;j <arr[i].length;j++) {
    		for (int k = 0; k <arr[i][j].length;k++) {
    			for (int l = 0; l <arr[i][j][k].length;l++) {
    				System.out.print(arr[i][j][k][l] + " ");    // 2 values, 4 rows, 2 columns.
    			}
      System.out.println();
     } 
    }
  }
 }
}

