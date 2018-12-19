import scala.collection.mutable

val t = Seq(1 to 5:_*)
println(t.updated(1,8))

/********************************************************/
val t2 = mutable.Seq(1 to 5:_*)
t2(1)=100
println(t2)
t2.update(2,100)
println(t2)

/********************************************************/
import util.Random.nextInt
val t3 = Seq.fill(5)(nextInt(100))

println(t3.sorted)
println(t3.sortBy(x=>(x.toString.length,x)))
println(t3.sortWith(_-_<0))

/********************************************************/
val t4 = Seq(1 to 5:_*)
println(t4.reverse)
println(t4.reverseIterator.next())
println(t4.reverseMap(_+10))

/********************************************************/
val t5 = Seq(1 to 5:_*)
println(t5.startsWith(Seq(1,2)))
println(t5.startsWith(Seq(4,5)))
println(t5.endsWith(Seq(1,2)))
println(t5.endsWith(Seq(4,5)))

/********************************************************/
val t6 = Seq(1 to 5:_*)
println(t6.contains(3))
println(t6.containsSlice(Seq(3,4)))

































