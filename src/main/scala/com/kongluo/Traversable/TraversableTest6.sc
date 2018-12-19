val t = Traversable(1 to 5:_*)
var v = t.view(0, 2)
v.foreach(println)
v = t.view
v.foreach(println)

val t2 =Traversable.fill(5)("A")
println(t2)

val t3 = Traversable.fill(5,2)("A")
println(t3)

val t4 = Traversable.range(1,20,5)
println(t4)

val t5 = Traversable.range(1,5)
println(t5)



