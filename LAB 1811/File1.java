import java.io.*;

public class File1 {

    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");

        if (file.exists()) {
            System.out.println("File already exists");
        }

        else {
            // createNewFile
            file.createNewFile();
            System.out.println("File created successfully");
        }

        // write to file
        FileWriter fw = new FileWriter(file);
        fw.write("Hello World!");
        fw.write("\nHello friday!");

        System.out.println("Wrote to " + file.getAbsolutePath());

        // closing is a must
        fw.close();


        // Reading from file
        BufferedReader bf = new BufferedReader(new FileReader(file));

        String line = bf.readLine();

        while (line != null)
        {
            System.out.println(line);
            line = bf.readLine();
        }
    }
}
