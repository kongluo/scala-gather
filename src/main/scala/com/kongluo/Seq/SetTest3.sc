val t1 = Seq('A','B','C','D','E')
val t2 = t1.map(_.toInt)
println(t1)
println(t2)
println(t1.corresponds(t2)(_==_.toChar))

/********************************************************/
val r1 = Range(1,10,2)
val r2 = Range.apply(1,10,2)
val r3 = new Range(1,10,2)
val r4 = 1 to 10
val r5 = 1 to (10,2)
val r6 = 1 to 10 by 2
val r7 = 1 until 11
val r8 = 1 until (11,2)
val r9 = 1 until 11 by 2
