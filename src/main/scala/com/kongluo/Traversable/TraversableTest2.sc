val t = Traversable(1 to 5:_*)
val result = t.map(x=>x*x)
println(result)

/********************************************************/
def badFactorial(x:Int):Int = if (x==0) 1 else (x*badFactorial(x-1))
val t2 = Traversable(1 to 5:_*)
println(t2.map(badFactorial(_)))

/********************************************************/
val t3 = Traversable(1 to 5:_*)
println(t3)
val result3 = t3.scan(1)(_*_)
println(result3.tail)

/********************************************************/
val t4 = Traversable(1 to 5:_*)
println(t4)
val result4 = t4.scanRight(1)(_*_)
println(result4)

/********************************************************/
val t5 = Traversable("A","B","C","D","E")
println(t5)
val result5 = t5.fold("z")(_+_)
println(result5)

/********************************************************/
val t6 = Traversable("A","B","C","D","E")
println(t6)
val result6 = t6./:("z")(_+_)
println(result6)

/********************************************************/
val t7 = Traversable.empty
println(t7.isEmpty)
println()




