package ua.com.dfyzok.lesson5_collection_framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CharactersCalculator {

    private final Map<String, Map<String, Integer>> mapCache = new HashMap<String, Map<String, Integer>>();

    public Map<String, Integer> calculateCharacters(String inputText) {
        Map<String, Integer> result = mapCache.get(inputText);
        if (result != null) {
            return result;
        }
        result = calculateEachCharacter(inputText);
        mapCache.put(inputText, result);
        return result;
    }

    private Map<String, Integer> calculateEachCharacter(String inputText) {
        List<String> charactersList = splitІntoСharacters(inputText);
        Set<String> uniqueCharacters = new LinkedHashSet<>(charactersList);
        Map<String, Integer> numberOfCharactersList = new LinkedHashMap<>();
        for (String i : uniqueCharacters) {
            int numberOfCharacters = 0;
            for (String j : charactersList) {
                if (i.equals(j)) {
                    numberOfCharacters++;
                }
            }
            numberOfCharactersList.put(i, numberOfCharacters);
        }
        return numberOfCharactersList;
    }

    private List<String> splitІntoСharacters(String input) {
        String[] characterArray = input.split("");
        return Arrays.asList(characterArray);
    }

}
