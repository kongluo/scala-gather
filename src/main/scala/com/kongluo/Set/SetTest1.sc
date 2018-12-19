val s = Set(1 to 5:_*)
println(s.contains(2))
println(s(2))
println(Set(3,4).subsetOf(s))

/********************************************************/
val s1 = Set(1 to 5:_*)
println(s1)
println(s1+6)

/********************************************************/
val s2 = Set(1 to 5:_*)
println(s2+(5,6))
println(s2++Set(5,6))
println(s2++Traversable(5,6))
println(s2++:Set(5,6))
println(Traversable(5,6)++:s2)

/********************************************************/
val s3 = Set(1 to 5:_*)
println(s3-3)
println(s3-8)

/********************************************************/
val s4 = Set(1 to 5:_*)
println(s4-(5,6))
println(s4--Set(5,6))
println(s4--Traversable(5,6))