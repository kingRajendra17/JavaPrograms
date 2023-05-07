package Problems;

public class StrBuffer {
	
    public static void main(String[] args) {
    	
        StringBuffer sb = new StringBuffer("Java");
        
        // appending a string
        sb.append(" Programming");
        System.out.println("After appending: " + sb);
        
        // inserting a string at index 5
        sb.insert(5, " ''' ");
        System.out.println("After inserting: " + sb);
        
        // reversing the string
        sb.reverse();
        System.out.println("After reversing: " + sb);
        
        // replacing a substring
        sb.replace(0, 3, "World");
        System.out.println("After replacing: " + sb);
        
        // deleting a substring
        sb.delete(0, 9);
        System.out.println("After deleting: " + sb);
    }
}

