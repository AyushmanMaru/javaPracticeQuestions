import java.io.File;

public class handlingMethod {
    
    public static void main(String[] args) {
        File f = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ayush.txt");

        if(f.exists()){
            System.out.println("file Name : " + f.getName());
            System.out.println("File Path :" + f.getAbsolutePath());
            System.out.println("can Write : " + f.canWrite());
            System.out.println("can Read : " + f.canRead());
            System.out.println("File Length : " + f.length());
            // System.out.println("Delete File : " + f.delete());
        }
    }
}
