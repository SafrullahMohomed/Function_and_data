object Q1 extends App
{
    val r = new Rational(2,5)
    println(r.neg)

}

class Rational(x:Int, y:Int)
{
    def numer = x / gcd(x,y)
    def denom = y / gcd(x,y)

    private gcd(a:Int, b:Int):Int = if (b == 0) a else gcd(b, a%b)

    def neg = new Rational(-this.numer, this.denom)

    override def toString = numer+"/"+denom

}