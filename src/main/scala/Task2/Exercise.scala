package Task2

import junit.framework.Test

object Exercise extends App:

    //Exercise 3a
    def positive(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"

    //Exercise 3b - 3c
    def neg[X](pred: X => Boolean): (X => Boolean) = (element => !pred(element))

    //Exercise 4
    val p1: Integer => Integer => Boolean => Boolean = x => y => z => x <= y == z
    val p2: (Integer, Integer, Boolean) => (Boolean) = ((x,y,z) => (x <= y == z)) 
    def p3(x: Integer)(y: Integer)(z: Boolean): Boolean = x <= y == z
    def p4(x: Integer, y:Integer, z:Boolean): Boolean = x <= y == z

    //Exercise 5
    def compose[A, B, C](f: (B => C), g: (A => B)): (A => C) = (number => f(g(number)))

    //Exercise 6
    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = b match
        case b if b == 0 => a
        case _ => gcd(b, a % b) 
    
    //Exercise 7
    enum Shape:
        case Rectangle(widht:Double, height:Double)
        case Circle(radius: Double)
        case Square(side: Double)
    
    object Shape:

        def perimeter(shape: Shape): Double = shape match
            case Rectangle(widht, height) => (widht * height) * 2
            case Circle(radius) => 2 * math.Pi * radius
            case Square(side) => side * 4
        
        def scale(shape: Shape, alpha: Double) : Shape = shape match
            case Rectangle(widht, height) => Rectangle(widht * alpha, height * alpha)
            case Circle(radius) => Circle(radius * alpha)
            case Square(side) => Square(side * alpha)

end Exercise