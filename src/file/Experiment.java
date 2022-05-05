package file;
import java.util.Arrays;
import java.io.*;

public class Experiment {
    private static void fileShowcase() throws IOException {
        File testRootDir = new File("E:\\Programs\\Java Course");
        File childDir = new File(testRootDir, "inner_directory");
        File childFile = new File(testRootDir, "some_file");
        System.out.println("testRootDir exists: " + testRootDir.exists()); // false при першому запуску
        childDir.mkdirs(); // створить всі необхідні директорії, включаючи inner_directory
        System.out.println("testRootDir is a directory: " + testRootDir.isDirectory()); // true
        if (childFile.createNewFile()) { // створить файл some_file всередині lesson10_files/files/
            System.out.println("File created: " + childFile.getAbsolutePath());
            System.out.println("Modified at (ms): " + childFile.lastModified());
        } else {
            System.out.println("File not created: " + childFile.getAbsolutePath());
        }
        System.out.println(Arrays.toString(testRootDir.list())); // виведе [inner_directory, some_file]
    }

}
