package ua.com.dfyzok.lesson5_collection_framework;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CharactersCalculatorTest {

    @Test
    public void charactersCalculatorShouldUseCacheForSpaces() {
        String inputData = "     ";
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult1 = charactersCalculator.calculateCharacters(inputData);
        Map<String, Integer> actualResult2 = charactersCalculator.calculateCharacters(inputData);
        assertTrue(actualResult1 == actualResult2);
    }

    @Test
    public void charactersCalculatorShouldUseCache() {
        String inputData = "asdasdeed";
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult1 = charactersCalculator.calculateCharacters(inputData);
        Map<String, Integer> actualResult2 = charactersCalculator.calculateCharacters(inputData);
        assertTrue(actualResult1 == actualResult2);
    }

    @Test
    public void charactersCalculatorShouldReturnResultWhenInputLetters() {
        String inputData = "asdas";
        Map<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put("a", 2);
        expectedResult.put("s", 2);
        expectedResult.put("d", 1);
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult = charactersCalculator.calculateCharacters(inputData);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void charactersCalculatorShouldReturnResultWhenInputGap() {
        String inputData = " ";
        Map<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put(" ", 1);
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult = charactersCalculator.calculateCharacters(inputData);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void charactersCalculatorShouldReturnResultWhenInputSymbols() {
        String inputData = "55$@$$";
        Map<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put("5", 2);
        expectedResult.put("$", 3);
        expectedResult.put("@", 1);
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult = charactersCalculator.calculateCharacters(inputData);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void charactersCalculatorShouldReturnResultWhenInputDifferentCase() {
        String inputData = "aaSsSss";
        Map<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put("a", 2);
        expectedResult.put("S", 2);
        expectedResult.put("s", 3);
        CharactersCalculator charactersCalculator = new CharactersCalculator();
        Map<String, Integer> actualResult = charactersCalculator.calculateCharacters(inputData);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
