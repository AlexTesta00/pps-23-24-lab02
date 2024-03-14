package Task2

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

end Exercise