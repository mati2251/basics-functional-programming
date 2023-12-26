package basics

def collections: Unit =
  list

def list: Unit = 
  println("LIST")
  val prices = List(10, 20, 30, 40, 50)
  prices.foreach { price => println(price)}  
  println("The first price is " + prices(0))
  
  println("First price > 40 is " + prices.find { price => price > 40 })
  println("Prices above 40 " + prices.filter { price => price > 40})
  println("Any > 40 " + prices.exists {price => price > 40})
  println("All > 40 " + prices.forall {price => price > 40})

  val items = List("A", "B", "C", "D", "E")
  println(items.zip(prices))

  val newPrices = 5::prices
  println(newPrices)

