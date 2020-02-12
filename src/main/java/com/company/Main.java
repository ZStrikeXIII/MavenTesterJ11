package com.company;

//import com.opencsv.exceptions.CsvValidationException; //Would cause error

import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class Main {

  //private static Object Gson;

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

    //JSON being loaded
    Gson gson = new Gson();
    JsonReader jreader = new JsonReader(new FileReader("src/datafolder/authors.json"));
    JSONAuthorParser[] author_list = gson.fromJson(jreader, JSONAuthorParser[].class);

    for (var element : author_list) {
      System.out.println(element.getAuth_name());
    }
  }
}
