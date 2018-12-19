val t = Traversable(1 to 10:_*)
println(t.splitAt(5))
println(t.span(_<6))
println(t.partition(_%2==0))
println(t.groupBy(_%3))

/********************************************************/
val t2 = Traversable(1 to 10:_*)
println(t2.forall(_<=10))
println(t2.forall(_>=10))
println(t2.exists(_==5))

/********************************************************/
val t3 = Traversable(1 to 10:_*)
println(t3.count(_%2==0))
println(t3.filter(_%2==0).size)

/********************************************************/
val t4 = Traversable(1 to 10:_*)
println(t4.reduce((acc,x)=>acc+x))
println(t4.reduce(_+_))
println(t4.reduceRight(_*10+_))

/********************************************************/
val t5 = Traversable(1 to 10:_*)
println(t5.sum)
println(t5.product)
println(t5.max)
println(t5.min)

/********************************************************/
val t6 = Traversable("hello a world , good study".split("\\W+"):_*)
println(t6.maxBy(_.length))
println(t6.minBy(_.length))
val chars = t6.aggregate(0)(_+_.length,_+_)
println(chars)
