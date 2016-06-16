// Exercise 1 - map
def byTwo(numbers: List[Int]) = numbers.map(_ * 2)

byTwo(List(1,2,3))


// Exercise 2 - using recursion and tail recursion
def sum(xs: List[Int]): Int = {
  if (xs.isEmpty) 0
  else xs.head + sum(xs.tail)
}

def sumTail(xs: List[Int]): Int = {
  def go(xs: List[Int], count: Int): Int = xs match {
    case Nil => count
    case h :: t => go(t, h + count)
  }
  go(xs, 0)
}

// Exercise 3 - aggregation using fold
def contains(items: List[Int], searchItem: Int) =
  items.foldLeft(false){(prev, cur) => prev || cur == searchItem }

contains(List(1,2,3), 4)


// Exercise 5 - flatmapping
// like a combination of map with flatten
val nestedNumbers = List(List(1, 2), List(3, 4))
nestedNumbers.flatMap(x => x.map(_ * 3))

// what would it look like if i just mapped?
nestedNumbers.map(x => x.map(_ * 3))

// now I add a flatten on the end
nestedNumbers.map(x => x.map(_ * 3)).flatten



// Exercise 6 - Higher Order Functions
val asXml : String => String = field => "<xml-field>" + field + "</xml-field>"
val asJson : String => String = field => s"'json-field':'$field'"

type OutputFormat = String => String

def generateReport(formatter: OutputFormat, fieldContents: String) =
  formatter(fieldContents)

generateReport(asJson, "sample content")
generateReport(asXml, "sample content")

