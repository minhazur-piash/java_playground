package playground;

import java.io.*;
import java.util.function.Consumer;

/**
 * Created by minhazur on 5/18/16.
 */
public class FileUtils {

    public static void writeToFiles(byte[] networkData) {
        File file = new File("networkData");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }


            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(networkData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName, Consumer<String> consumer) {

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                consumer.accept(line);
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");

        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }

}

