package ua.com.dfyzok.lesson5_collection_framework;

import java.util.Formatter;
import java.util.Map;

public class ResultPrinter {

    public String prepareResult(Map<String, Integer> numberOfCharactersList) {
        StringBuilder resultText = new StringBuilder();
        Formatter fmt = new Formatter(resultText);
        for (Map.Entry<String, Integer> i : numberOfCharactersList.entrySet())
            fmt.format("\"%s\" - %d\n", i.getKey(), i.getValue());
        return resultText.toString();
    }

}
