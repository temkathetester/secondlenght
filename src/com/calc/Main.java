package com.calc;
import java.io.*;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> tempList = new ArrayList<String>();

        // The name of the file to open.
        String fileName = "D:\\test.txt";

        // declare string item for ArraysList
        String line;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                list.add(line);
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");

        }


        System.out.println();
        System.out.println(list);

        VowelsCountComparator vowelsCountComparator = new VowelsCountComparator();
        ConsonantsCountComparator consonantsCountComparator = new ConsonantsCountComparator();

//      Sorting list by Vowels Count
        list.sort(vowelsCountComparator);
        System.out.println(list);

//      Sorting list by Consonants Count
        list.sort(consonantsCountComparator);
        System.out.println(list);

        for (String tempString: list)
                {
            String reverse = new StringBuffer(tempString).reverse().toString();
            tempList.add(reverse);
                }
//     reversing list elements
        System.out.println(tempList);

    }



}