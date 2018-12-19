import java.util

val t = Seq(1 to 5:_*)
println(t.indices)

val t2 = Seq(1 to 5:_*)
println(t2.size)
println(t2.length)

println(t2.lengthCompare(-10))
println(t2.lengthCompare(5))
println(t2.lengthCompare(3))
println(t2.lengthCompare(10))

val t3 = Seq(1 to 5:_*)
println(t3(2))
println(t3.apply(2))

val t4 = Seq(1 to 5:_*) ++ Seq(1 to 5:_*)
println(t4.indexOf(3))
println(t4.indexOf(3,4))

println(t4.lastIndexOf(3))
println(t4.lastIndexOf(3,4))
println(t4.lastIndexOf(4,2))

val t5 = Seq(1 to 10:_*)
println(t5.indexWhere(x=>(x%2==0) && x<5))
println(t5.indexWhere(x=>(x%2==0) && x<5,2))

val t6 = Seq(1 to 10:_*)
println(t6.indexOfSlice(Seq(7,8)))
println(t6.indexOfSlice(Seq(7,8),7))
println(t6.indexOfSlice(Seq(7,9)))

println(t6.lastIndexOfSlice(Seq(7,8)))
println(t6.lastIndexOfSlice(Seq(7,8),7))

val t8 = Seq(1 to 5:_*)
println(t8:+3)
println(3+:t8)
println(t8.padTo(8,6))
























