package com.cbfacademy;

//java.io.* provides classes for file input and output operation
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // File Paths defined
        String filePath = "src/main/resources/exercise.txt";
        String newfilePath = "src/main/resources/new_exercise.txt";

        // The try block ensures that the resources (file readers and
        // writers) are automatically closed when they are no longer needed.
        try (FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(newfilePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            // Inside the try block, the program reads each line from the input file using a
            // BufferedReader. Then, it writes the line to the output file using a
            // BufferedWriter. The newLine() method is used to add a newline character after
            // each line in the output file.
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println(line);

            // In case any IOException occurs during file operations, it will be caught, and
            // the exception details will be printed.
        } catch (IOException e) {

        }
    }
}
