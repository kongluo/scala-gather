import scala.collection.mutable

val s = Traversable("电影ID,评分,电影名","20645098,8.2,小王子",
                    "26259677,8.3,垫底 ","11808948,7.2,海绵宝宝")

val (a,b,c) = s.unzip3(x=>{
  val a = x.split(",");
  (a(0),a(1),a(2))
})

println(a)
println(b)
println(c)

/********************************************************/

val movieNames = Traversable("小王子","垫底辣妹","海绵宝宝")
val movieIDs = mutable.HashSet(20645098,26259677,11808948)
val movies = movieNames ++ movieIDs
println(movies)
println(movies.getClass)

val result = Traversable.concat(Traversable(1 to 3:_*),Traversable(4 to 5:_*),Traversable(6 to 8:_*))
println(result)

val t = Traversable(1,2,3,4,5,6,7,8,9,10)
def filterEven:PartialFunction[Int,Int]={
  case x if x%2==0 => x
}
val result2 = t collect(filterEven)
println(result2)

/********************************************************/

