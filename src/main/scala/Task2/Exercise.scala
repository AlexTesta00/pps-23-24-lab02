package Task2

import u02.Values.w

object Exercise extends App:

    //Task 3a - svolto da solo
    def positive(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"

    //Task 3b - 3c - svolto da solo
    def neg[X](pred: X => Boolean): (X => Boolean) = (e => !pred(e))

    //Task 4 - svolto da solo
    val p1: Integer => Integer => Boolean => Boolean = x => y => z => x <= y == z
    val p2: (Integer, Integer, Boolean) => (Boolean) = ((x,y,z) => (x <= y == z)) 
    def p3(x: Integer)(y: Integer)(z: Boolean): Boolean = x <= y == z
    def p4(x: Integer, y:Integer, z:Boolean): Boolean = x <= y == z

    //Task 5 - svolto da solo
    def compose[A, B, C](f: (B => C), g: (A => B)): (A => C) = (n => f(g(n)))

    //Task 6 - svolto da solo
    @annotation.tailrec
    def gcd(a: Int, b: Int): Int = b match
        case b if b == 0 => a
        case _ => gcd(b, a % b) 
     
    //Task 7 - svolto da solo
    enum Shape:
        case Rectangle(w:Double, h:Double)
        case Circle(r: Double)
        case Square(s: Double)
    
    object Shape:

        def perimeter(s: Shape): Double = s match
            case Rectangle(w, h) => (w * h) * 2
            case Circle(r) => 2 * math.Pi * r
            case Square(s) => s * 4
        
        def scale(s: Shape, a: Double) : Shape = s match
            case Rectangle(w, h) => Rectangle(w * a, h * a)
            case Circle(r) => Circle(r * a)
            case Square(s) => Square(s * a)

    //Task 8 - svolto da solo
    object Optionals:
        enum Optional[A]:
            case Maybe(value: A)
            case Empty()

    import Optionals.Optional
    import Optionals.Optional.*

    object Optional:
        def isEmpty[A](o: Optional[A]): Boolean = o match
            case Empty() => true
            case _ => false

        def orElse[A, B >: A](o: Optional[A], default: B): B = o match
            case Maybe(value) => value
            case Empty() => default

        def map[A, B](o: Optional[A], f: A => B): Optional[B] = o match
            case Maybe(x) => Maybe(f(x))
            case _ => Empty()

        def filter[A](o: Optional[A])(pred: A => Boolean): Optional[A] = o match
            case Maybe(x) if pred(x) => Maybe(x)
            case _ => Empty()

end Exercise