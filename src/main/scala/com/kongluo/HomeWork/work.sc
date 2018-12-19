val nums = Array(1, 0, -1, 0, -2, 2)
val numsType = nums.combinations(4).filter((data)=>{
  data.apply(0)+data.apply(1)+data.apply(2)+data.apply(3)==0
}).map(_.toList).toList

