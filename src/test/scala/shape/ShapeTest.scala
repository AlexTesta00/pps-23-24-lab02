package shape

import org.junit.Test
import org.junit.Assert.*
import Task2.Exercise.Shape
import Task2.Exercise.Shape.*

class ShapeTest:

    val rectangle: Shape = Rectangle(5,5)
    val circle: Shape = Circle(5)
    val square: Shape = Square(1)
    val delta: Int = 1
    var alpha: Int = 5

    @Test def correctRectanglePerimeter(): Unit = {
        val expectedResult: Double = 50
        assertEquals(expectedResult, perimeter(rectangle), delta)
    }

    @Test def correctCirclePerimeter(): Unit = {
        val expectedResult: Double = 31.4
        assertEquals(expectedResult, perimeter(circle), delta)
    }

    @Test def correctSquarePerimeter(): Unit = {
        val expectedResult: Double = 4
        assertEquals(expectedResult, perimeter(square), delta)
    }

    @Test def correctRectangleScaling(): Unit = {
        val expectedScaledRectangle: Shape = Rectangle(25,25)
        assertEquals(expectedScaledRectangle, scale(rectangle, alpha))
    }

    @Test def correctCircleScaling(): Unit = {
        val expectedScaledCircle: Shape = Circle(25)
        assertEquals(expectedScaledCircle, scale(circle, alpha))
    }

    @Test def correctSquareScaling(): Unit = {
        val expectedScaledSquare: Shape = Square(5)
        assertEquals(expectedScaledSquare, scale(square, alpha))
    }