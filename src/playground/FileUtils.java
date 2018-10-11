package playground;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by minhazur on 5/18/16.
 */
public class FileUtils {

    public static void writeToFiles(byte[] networkData) {
        File file = new File("networkData");

        try {
            if(!file.exists()) {
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
}

