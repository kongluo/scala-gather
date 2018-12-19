import scala.collection.mutable

val s1 = mutable.HashSet(1,2,3)
val s2 = mutable.HashSet(3,4,5)
println(s1 & s2)
println(s1 intersect  s2)

println(s1 | s2)
println(s1 union s2)

println(s1 &~ s2)
println(s1 diff s2)

println(s2 &~ s1)
println(s2 diff s1)

/********************************************************/
val s3 = mutable.HashSet(1,2,3,4,5)
s3.update(2,true)
println(s3)
s3.update(2,false)
println(s3)
