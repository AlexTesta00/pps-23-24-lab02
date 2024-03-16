package Task2

object Exercise extends App:

    //Task 3a
    def positive(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"

    //Task 3b - 3c
    def neg[X](pred: X => Boolean): (X => Boolean) = (element => !pred(element))

    //Task 4
    val p1: Integer => Integer => Boolean => Boolean = x => y => z => x <= y == z
    val p2: (Integer, Integer, Boolean) => (Boolean) = ((x,y,z) => (x <= y == z)) 
    def p3(x: Integer)(y: Integer)(z: Boolean): Boolean = x <= y == z
    def p4(x: Integer, y:Integer, z:Boolean): Boolean = x <= y == z

    //Task 5
    def compose[A, B, C](f: (B => C), g: (A => B)): (A => C) = (number => f(g(number)))

    //Task 6
    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = b match
        case b if b == 0 => a
        case _ => gcd(b, a % b) 
    
    //Task 7
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

    //Task 8
    object Optionals:
        enum Optional[A]:
            case Maybe(value: A)
            case Empty()

    import Optionals.Optional
    import Optionals.Optional.*

    object Optional:
        def isEmpty[A](optional: Optional[A]): Boolean = optional match
            case Empty() => true
            case _ => false

        def orElse[A, B >: A](optional: Optional[A], default: B): B = optional match
            case Maybe(value) => value
            case Empty() => default

        def map[A, B](optional: Optional[A], f: A => B): Optional[B] = optional match
            case Maybe(x) => Maybe(f(x))
            case _ => Empty()

        def filter[A](optional: Optional[A])(predicate: A => Boolean): Optional[A] = optional match
            case Maybe(x) if predicate(x) => Maybe(x)
            case _ => Empty()

end Exercise