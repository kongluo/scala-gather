import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions

val nums = new Array[Int](10)
val b = ArrayBuffer[Int]()
b.toArray
nums.toBuffer

val a = new Array[Int](10)
for (i<- 0 until(a.length))
  println(i+":"+a(i))

for (elem<-a)
  println(elem)

val matrix = Array.ofDim[Double](3,4)
matrix(1)(2) = 12

val scores = Map("Alice"->10)
