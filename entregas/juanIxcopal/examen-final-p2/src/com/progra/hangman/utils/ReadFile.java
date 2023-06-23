package com.progra.hangman.utils;

public class ReadFile {
    public java.util.List<String> loadSource(String fileName) throws java.io.FileNotFoundException {
        if (fileName == null || fileName.length() < 1) {
            throw new IllegalArgumentException("Filename may not be null or empty");
        }
        java.io.File file = new java.io.File(fileName);
        if (!file.exists()) {
            throw new java.io.FileNotFoundException("Ups, there is no file in " + file.getAbsolutePath());
        }
        java.util.List<String> data = new java.util.ArrayList<String>();
        java.io.BufferedReader in = null;
        try {
            in = new java.io.BufferedReader(new java.io.FileReader(file));
            while (in.ready()) {
                String line = in.readLine();
                if (line.length() > 0) {
                    data.add(line);
                }
            }
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (java.io.IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println(data.size() + " Elements loaded.");
        return data;

    }


}
