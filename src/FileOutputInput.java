import java.io.ByteArrayInputStream;

public class FileOutputInput {

	public static void main(String[] args) {
    byte[] array = {1, 2, 3};
    try {
    	ByteArrayInputStream input = new ByteArrayInputStream(array);
    	
    	for(int i = 0; i< array.length; i++) {
    		int data = input.read();
    		System.out.print(data + ", ");
    		
    	}
    	input.close();
    }
    catch(Exception e) {
    	e.getStackTrace();
    }

}
}

