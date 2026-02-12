import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of file");
        String name = in.nextLine();
        System.out.println("Word to be counted in file ");
        String findWord = in.nextLine();

        File file = new File(name);
        int count = 0;

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String word = scanner.next();
                if(word.equalsIgnoreCase(findWord)){
                    count++;
                }

            }

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Total count of "+ findWord + " is "+ count);
        }


    }
}
