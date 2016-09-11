package ru.sberbank;

import java.io.*;

public class Solution
{

    public static void main(String[] argv) throws IOException {
      // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         File file = new File("E:\\СберТех\\Java school\\HelloWorld\\src\\ru\\sberbank\\input.txt");
         FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        String[] wordsArray = br.readLine().split("[\\W+\\s+\\d]+");

        System.out.println(wordsArray.length);
    }
}
