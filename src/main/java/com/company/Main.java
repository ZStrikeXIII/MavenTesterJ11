package com.company;

//import com.opencsv.exceptions.CsvValidationException; //Would cause error

import java.io.IOException;

public class Main {

  /**
   * The main program that will execute all of our csv related tasks, including reading, parsing,
   * and printing.
   *
   * @param args Arguments that will be used in main.
   * @throws IOException Any possible exceptions that may be thrown during runtime.
   */
  public static void main(String[] args) throws IOException {
    //Code will parse our csv file
    System.out.println("Hey, I'm a working program!"
        + "\n-----------------------"); //Initial code to test if the program works
    CsvParserClass csvFile = new CsvParserClass(
        "src/datafolder/SEOExample.csv"); //Getting the csv file
    csvFile.printCsv(); //Printing the csv file to the console.
  }
}
