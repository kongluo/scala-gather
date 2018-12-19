import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

val a = new Array[Int](10)

val b = new ArrayBuffer[Int]()

val matric = Array.ofDim[Double](3,4)
matric(1)(1)=12.0

val command = ArrayBuffer("ls","-al","/")

val scores = Map("Alice"->10,"Bob"->3,"Cindy"->8)
val score1 = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8)
val score2 = new scala.collection.mutable.HashMap[String,Int]
val score3 = Map(("Alice",10),("Bob",3),("Cindy",8))
val BobScore = score3.get("Bob")

for ((k,v)<- score3)
  println(k+ "is mapped to "+v)

val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = counts.zip(symbols)
println(pairs)

val t = Map("Alice"->10,"Bob"->3,"Cindy"->8)
val unzip = t.unzip
println(unzip._1)

val q1 = new mutable.Queue[Int]()
q1+=1
q1+=2
q1++=List (3,4)
q1.dequeue()
q1.enqueue()
println(q1)
q1.head
q1.tail


