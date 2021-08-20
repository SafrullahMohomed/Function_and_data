object Q2 extends App
{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    println(x-y-z)

}

class Rational(x:Int, y:Int)
{
    def numer = x / gcd(Math.abs(x),y)
    def denom = y / gcd(Math.abs(x),y)

    def gcd(a:Int, b:Int):Int = if (b == 0) a else gcd(b, a%b)

    //def neg = new Rational(-this.numer, this.denom)
    def -(r:Rational) = new Rational(this.numer*r.denom - r.numer*this.denom, r.denom*this.denom)
    override def toString = numer+"/"+denom

}