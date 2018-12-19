val t = Iterable(1 to 16:_*)
val result = t.grouped(5)

while(result.hasNext){
  println(result.next())
}
//
