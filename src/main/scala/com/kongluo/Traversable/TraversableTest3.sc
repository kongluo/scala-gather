val t = Traversable.empty
println(t.isEmpty)
println(t.nonEmpty)
println(!t.isEmpty)

val t1 = Traversable(1 to 10:_*)
println(t1)
println(t1.head)
println(Traversable.empty.headOption.isDefined)

println(t1.last)
println(Traversable.empty.lastOption.isDefined)
println(t1.find(_ %2==0))

val t3 = Traversable(1 to 5:_*)
println(t3)
println(t3.tail)
println(t3==(t3.head::t3.tail.toList))

for (i<-t3.tails) println(i)

println(t3.init)

for (i<-t3.inits)println(i)

val t4 = Traversable(1 to 5:_*)
println(t4.slice(1,3))
println(t4.slice(-100,100))

val t5 = Traversable(1 to 10:_*)
println(t5)
println(t5.take(5))
println(t5.takeWhile(_<6))

val t6 = Traversable(1 to 10:_*)
println(t6.drop(5))
println(Traversable(1,2,6,8,3,4).dropWhile(_<6))
println(t6==(t6.take(5) ++ t6.drop(5)))

val t7 = Traversable(1 to 10:_*)
println(t7.filter(_>6))
println(t7.filterNot(_<6))
println(t7.withFilter(_<6).withFilter(_>2).withFilter(_%2==0).foreach(println))

