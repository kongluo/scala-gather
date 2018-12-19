val t = Traversable(1 to 10:_*)
println(t.splitAt(5))
println(t.span(_<6))
println(t.partition(_%2==0))
println(t.groupBy(_%3))

val t2 = Traversable(1 to 10:_*)
println(t2.forall(_<=10))
println(t2.forall(_>=10))
println(t2.exists(_==5))

val t3 = Traversable(1 to 10:_*)
println(t3.count(_%2==0))
println(t3.filter(_%2==0).size)