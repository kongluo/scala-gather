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

