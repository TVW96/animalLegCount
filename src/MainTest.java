import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testCountLegsForFourLeggedAnimals() {
        //Arrange
        Main main = new Main();
        String[] animals = {"lion", "monkey", "deer", "snake", "elephant"};

        //Act
        int count = main.countLegs(animals);

        //Assert
        assertEquals(3, count);
    }

    @Test
    public void testCountLegsForNoFourLeggedAnimals() {
        //Arrange
        Main main = new Main();
        String[] animals = {"monkey", "parrot", "ostrich", "ant"};

        //Act
        int count = main.countLegs(animals);

        //Assert
        assertEquals(0, count);
    }

    @Test
    public void testCountLegsForEmptyArray() {
        //Arrange
        Main main = new Main();
        String[] animals = {};

        //Act
        int count = main.countLegs(animals);

        //Assert
        assertEquals(0, count);
    }

    @Test
    public void testCountLegsForNullArray() {
        //Arrange
        Main main = new Main();
        String[] animals = null;

        //Act
        int count = main.countLegs(animals);

        //Assert
        assertEquals(0, count);
    }
}