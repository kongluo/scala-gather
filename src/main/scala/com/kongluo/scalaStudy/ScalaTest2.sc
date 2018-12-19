val ch:Char = '+'
val result = ch match {
  case '+' =>1
  case '-' => -1
  case _ =>0
}
println(result)

val result1 = List(1,2,3,4) match {
  case first::second::rest => first+second+rest.length
  case _=>0
}
println(result1)

def plus(x:Double) = 3*x
Array(1.0,2.0,3.0,4.0).map(plus).foreach(println)

val triple = (x:Double)=>3*x
Array(1.0,2.0,3.0).map(triple)
Array(1.0,2.0,3.0).map((x:Double)=>x*3)
Array(1.0,2.0,3.0).map{(x:Double)=>x*3}

def valAtOneQuanter = (z:Double)=>3*z




