import java.io.*;
public class fileHandle {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ayush.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Created Sucessfully");
			}
			else {
				System.out.println("File Already exist..");
			}
			
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled..!");
		}
		

	}

}
