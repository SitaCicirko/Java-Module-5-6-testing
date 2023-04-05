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
        @Test
        @DisplayName("Tests for circle")
        public void testAddCircle() {
            //Given
            Shape circle = new Circle(3);

            //When
            shapeCollector.addFigure(circle);

            //Then
            assertEquals("circle", shapeCollector.getFigure(0).getShapeName());
        }
        @Test
        @DisplayName("Tests for rectangle")
        public void testAddRectangle() {
            //Given
            Shape rectangle = new Rectangle(4, 6);

            //When
            shapeCollector.addFigure(rectangle);

            //Then
            assertEquals("rectangle", shapeCollector.getFigure(0).getShapeName());
        }

    }
    @Nested
    @DisplayName("Tests for removing shapes")
    class RemveFigureTests{
        @Test
        @DisplayName("remove a square from the list")
        void testRemoveSquare(){
            //Given
            Shape square = new Square(5);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            assertNull(shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("remove a circle from the list")
        public void testRemoveCircle() {
            //Given
            Shape circle = new Circle(3);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            assertNull(shapeCollector.getFigure(0));
        }
        @Test
        @DisplayName("remove a rectangle from the list")
        public void testRemoveRectangle() {
            //Given
            Shape rectangle = new Rectangle(4, 6);
            shapeCollector.addFigure(rectangle);

            //When
            shapeCollector.removeFigure(rectangle);

            //Then
            assertNull(shapeCollector.getFigure(0));
        }
    }
    @Nested
    @DisplayName("Tests for getting a figure")
    class GetFigureTests {
        @Test
        @DisplayName("should return a square")
        public void testGetFirstShape() {
            //Given
            Shape square = new Square(5);
            shapeCollector.addFigure(square);

            //When
            Shape shape = shapeCollector.getFigure(0);

            //Then
            assertEquals("square", shape.getShapeName());
        }

        @Nested
        @DisplayName("Tests for showing figures")
        class ShowFiguresTests {
            @Test
            @DisplayName("should return all shapes")
            void testShowAllFigures() {
                //Given
                Shape square = new Square(5);
                Shape circle = new Circle(3);
                Shape rectangle = new Rectangle(4, 6);
                shapeCollector.addFigure(square);
                shapeCollector.addFigure(circle);
                shapeCollector.addFigure(rectangle);

                //When
                String result = shapeCollector.showFigures();

                //Then
                assertEquals("square circle rectangle", result);
            }
        }
    }
}





