let array = ["one","two","three"]
let string = "four, five, six"
let combo = array.concat(string).filter(i=>i.trim()).join(",")
console.log(combo)