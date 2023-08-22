package com.cbfacademy;

public class FileExtention {
    public int check(String fileName) throws InvalidFileNameException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileNameException("File name cannot be null or empty");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }

}
