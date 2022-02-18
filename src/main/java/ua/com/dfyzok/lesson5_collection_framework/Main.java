package ua.com.dfyzok.lesson5_collection_framework;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input our string:");
        String inputData = scanner.nextLine();

        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> resultList = charactersCalculator.calculateCharacters(inputData);

        ResultPrinter resultText = new ResultPrinter();
        String result = resultText.prepareResult(resultList);

        System.out.println(result);
    }
}
