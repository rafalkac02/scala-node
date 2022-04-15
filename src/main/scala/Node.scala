class Node(s: String) {
  val name = s
  var children = List.empty[Node]

  def addChild(n: Node) = {
    children = children :+ n
  }

  def show(level: Int): Unit = {
    val spaces = " " * 3 * level
    println(spaces + "+- " + name)
    children.foreach(f => f.show(level + 1))
  }

  def display = {
    show(0)
  }
}