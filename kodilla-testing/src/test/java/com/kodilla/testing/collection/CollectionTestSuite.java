package com.kodilla.testing.collection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@DisplayName("Tests for OddNumbersExterminator class")
class CollectionTestSuite {
    OddNumbersExterminator exterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Finishing test...");
    }
    @DisplayName("Test filtering odd numbers from an empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> expectedResult = exterminator.exterminate(emptyList);

        // Then
        assertTrue(expectedResult.isEmpty());
    }

    @DisplayName("Test filtering odd numbers from a mixed list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();


        // When
        List<Integer> result = exterminator.exterminate(numbers);

        // Then
        assertEquals(Arrays.asList(2, 4, 6), result);
    }
}
