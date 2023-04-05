package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ShapeCollector tests")
class ShapeCollectorTestSuite {
    public ShapeCollector shapeCollector = new ShapeCollector();
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding shapes")
    class AddShapesTests {
        @Test
        void testAddSquare() {
            //Given
           Shape square = new Square(5);

            //When
            shapeCollector.addFigure(square);

            //Then
            assertEquals("square", shapeCollector.getFigure(0).getShapeName());
        }

    }




}
