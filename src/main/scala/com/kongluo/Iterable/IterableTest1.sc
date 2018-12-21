import scala.collection.immutable.{HashSet, TreeSet}
import scala.collection.mutable

val t = Iterable(1 to 16:_*)
val result = t.grouped(5)

while(result.hasNext){
  println(result.next())
}

/********************************************************/
val t2 = Iterable(1 to 6:_*)
val result2 = t2.sliding(3,2)

while(result2.hasNext){
  println(result2.next())
}

/********************************************************/
val t3 = Iterable("A","B","C")
val t4 = Iterable(1 to 4:_*)
val result3 = t3.zip(t4)
println(result3)

/********************************************************/
val t5 = Iterable("A","B","C")
val t6 = Iterable(1 to 4:_*)
val result4 = t5.zipAll(t6,"Z",100)
println(result4)

val t7 = Iterable("A","B","C","D","E")
val result5 = t7.zipAll(t6,"Z",100)
println(result5)

/********************************************************/
val t8 = Iterable("A","B","C")
println(t8.zipWithIndex)
val result6 = t8.zipWithIndex
println(result6.map(x=>(x._2,x._1)))
result6.view.map(x=>(x._2,x._1)).force

/********************************************************/
val t9 = Iterable("A","B","C")
val t10 = Iterable("A","B","C","D")
println(t9.sameElements(Iterable("A","B","C")))  //true
println(t9.sameElements(Iterable("A","B","C","D")))  //false
println(t9.sameElements(Iterable("A","C","B")))  //false

val s1 = HashSet(1,2)
val s2 = mutable.HashSet(1,2)
val s3 = TreeSet(1,2)
val s4 = TreeSet(2,1)
val it3 = Seq(1,2)
println(s1.sameElements(s2))  //true
println(s1.sameElements(s3))  //true
println(s1.sameElements(s4))  //true
println(s1.sameElements(it3))  //true

/********************************************************/
val t11 = Iterable(1 to 10:_*)
println(t11.takeRight(5))

/********************************************************/
val t12 = Iterable(1 to 10:_*)
println(t12.dropRight(5))
