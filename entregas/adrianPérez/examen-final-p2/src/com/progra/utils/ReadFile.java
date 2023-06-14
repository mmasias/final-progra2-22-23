package com.progra.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> loadSource(String fileName) throws FileNotFoundException {
        if (fileName == null || fileName.length() < 1) {
            throw new IllegalArgumentException("Filename may not be null or empty");
        }
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Ups, there is no file in " + file.getAbsolutePath());
        }
        List<String> data = new ArrayList<String>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            while (in.ready()) {
                String line = in.readLine();
                if (line.length() > 0) {
                    data.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println(data.size() + " elements loaded.");
        return data;

    }


}
