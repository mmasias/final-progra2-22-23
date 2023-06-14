package Hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public ReadFile() {
    }

    public List<String> loadSource(String fileName) throws FileNotFoundException {
        if (fileName != null && fileName.length() >= 1) {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("Ups, there is no file in " + file.getAbsolutePath());
            } else {
                List<String> data = new ArrayList();
                BufferedReader in = null;

                try {
                    in = new BufferedReader(new FileReader(file));

                    while(in.ready()) {
                        String line = in.readLine();
                        if (line.length() > 0) {
                            data.add(line);
                        }
                    }
                } catch (IOException var14) {
                    System.err.println(var14.getMessage());
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException var13) {
                            System.err.println(var13.getMessage());
                        }
                    }

                }

                System.out.println(data.size() + " elements loaded.");
                return data;
            }
        } else {
            throw new IllegalArgumentException("Filename may not be null or empty");
        }
    }
}

