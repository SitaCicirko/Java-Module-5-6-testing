package com.kodilla.testing.collection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@DisplayName("Tests for OddNumbersExterminator class")
class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("Test filtering odd numbers from an empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Test " + result);
        // Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("Test filtering odd numbers from a mixed list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // Then
        assertEquals(Arrays.asList(2, 4, 6), result);
    }
}
