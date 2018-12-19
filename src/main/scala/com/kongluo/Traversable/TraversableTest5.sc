val t = Traversable(1 to 10:_*)
println(t.mkString(","))
println(t.mkString("[",",","]"))

val sb:StringBuilder = new StringBuilder
sb.clear()
t.addString(sb,",")
sb.clear()
t.addString(sb,"[",",","]")
println(sb.toString())
println(t.repr.getClass.getName)
println(t.stringPrefix)

/********************************************************/
val t2 = Traversable(1 to 5:_*)
println(t2.toArray.mkString(t.toArray.stringPrefix+"(",",",")"))
println(t2.toParArray)
println(t2.toBuffer)
println(t2.toIndexedSeq)
println(t2.toIterable)
println(t2.toIterator)
println(t2.toList)
println(t2.toSeq)
println(t2.toSet)
println(t2.toStream)
println(t2.toVector)
println(t2.toTraversable)
println(Traversable("a"->1,"b"->2).toMap)

/********************************************************/
val t3 = Traversable(1 to 5:_*)
println(t3.toArray)
val result = new Array[Int](t3.size)
t3.copyToArray(result)
println(result.mkString(result.stringPrefix+"(",",",")"))

/********************************************************/
val result2 = new Array[Int]( t.size*2)
t3.copyToArray(result2,5,4)
result2




