object Collection {

  def calculprod(a:Int, b:Int):Int={
    var resu:Int=a*b
    return resu
  }



  def calculplus(a: Int, b: Int): Int = {
    var resultat = 0
    if (a<0 || b<0){println("que des nombres positifs")}

    else{ resultat=a+b}
    return resultat
  }




  def main(args: Array[String]): Unit = {
    println("le produit est égal à : "+calculprod(5,6))

    val montuple=("10","willy","zidane",19.5)
    println(montuple._1)

    val la=List(11,15,20)

  //tuples
    val monMap:Map[String, String]=Map(
      "ab"-> "abobo",
      "yop" -> "yopougon",
      "cc" -> "cocody"
    )
    println(monMap.toList)
    println("**************")


    //tableau
    val montableau: Array[String]=Array("willy","fafa")
    montableau(0)="GBAMA"
    println(montableau(1))
    //montableau.foreach(e=>println(e))







  }
}
