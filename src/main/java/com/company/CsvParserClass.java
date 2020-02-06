package com.company;

import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvValidationException; //Would cause error
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParserClass {

  private List fileRows = new ArrayList(); //The rows of our csv file

  /**
   * The class to initiate the parsing of the csv file we need to print.
   *
   * @param infile The csv file coming into the program to be read, parsed, and printed.
   * @throws IOException Any possible exceptions that might be thrown during runtime.
   */
  public CsvParserClass(String infile) throws IOException {
    if (checkFile(infile)) {
      readCsv(infile);
    }
  }

  /**
   * This method reads the csv file line by line.
   *
   * @param csvinfile The csv file coming in to be read.
   * @throws IOException Any exceptions that may be thrown during runtime.
   */
  protected void readCsv(String csvinfile) throws IOException {
    FileInputStream CsvStream = new FileInputStream(csvinfile);
    InputStreamReader inputStream = new InputStreamReader(CsvStream, StandardCharsets.UTF_8);
    CSVReader reader = new CSVReader(inputStream);

    String[] nextLine;
    while ((nextLine = reader.readNext()) != null) {
      fileRows.add(nextLine);
    }
    reader.close();
  }

  /**
   * The method that will print the csv file to the system in the format we specify.
   */
  protected void printCsv() {
    for (Object row : fileRows) {
      for (String fields : (String[]) row) {
        System.out.println(fields + ", ");
      }
      System.out.println("\b\b\n--------------------------");
    }
  }

  /**
   * This method will check if the csv file even exists, otherwise executing the rest of the methods
   * to read, parse, and execute it won't need to be performed.
   *
   * @param csvFile The csv file that will be checked to see if it exists.
   * @return Returns a true or false boolean value based on if the csv file exists or not.
   */
  private boolean checkFile(String csvFile) {
    if (!Files.exists(Paths.get(csvFile))) {
      System.out.println("File doesn't exist.");
      return false;
    }
    return true;
  }
}