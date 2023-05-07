package Problems;

public class CompareStr {
	
    public static void main(String[] args) {
        String str1 = "Apple";          
        String str2 = "Pineapple";      
         
        int result = str1.compareTo(str2);     
        
        System.out.println("Compare Result : " +result);
        
        if(result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if(result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println(str1 + " is equal to " + str2);
        }
    }
}
