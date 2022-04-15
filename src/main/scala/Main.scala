object Main extends App {

  val main = new Node("main")
  val folder1 = new Node("folder1")
  val folder2 = new Node("folder2")
  val folder3 = new Node("folder3")

  main.addChild(folder1)
  main.addChild(folder2)
  main.addChild(folder3)


  val grandchild = new Node("grandchild")
  folder1.addChild(grandchild)


  main.display
}
