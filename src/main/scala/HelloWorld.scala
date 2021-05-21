import Personne._

import java.text.SimpleDateFormat
import java.time
import java.util.{Calendar, Date}

import scala.collection.mutable._

object HelloWorld {
  val variable2: String = ""

  def main(args: Array[String]): Unit = {

    val text: String = "salut"

    val text2: String = text + variable2

    //val test=print(text2)
    //test
    //println("hello world, mon premier programme en scala")

    val wilfried = new Personne("GBAMA", "Wilfried", 27, "ivoirienne", 2350000)

    //print("le nom de la deuxième personne est : " + fafa.nom + " " + fafa.Prenom + "\n")
    val age_personne = wilfried.age
    val sal = wilfried.salaire
    print("l'age de la personne est : " + age_personne + "\n")
    print("le salaire de la personne est : " + sal + "\n")

    val somme = print("la somme est :" + calculSomme(-11, 25) + "\n")
    somme
    print("--------------\n")

    val fafa = print(renvoie_Personne("SEYRAM", "Roland", "18-10-2000", "ivoirienne", 1800000)+"\n")
    fafa


    print("--------------------\n")
    val res=print("le factoriel est: "+ facto(5)+"\n")
    res
    println("*****************")
    macollection()
    println("*****************")
    liste_pre()
    liste_pre1()

  }








  def calculSomme(a: Int, b: Int): Int = {
    var resultat = 0
    if (a<0 || b<0){println("que des nombres positifs")}

    else{ resultat=a+b}
    return resultat
  }

  def renvoie_Personne(nom: String, Prenom: String, date: String, nationalite: String, salaire: Double): Personne = {
    var formater = new SimpleDateFormat("dd-MM-YYYY")
    var aujourdhui: Date = new Date()

    var dateNais: Date = formater.parse(date)
    var c: Calendar = Calendar.getInstance()

    //c.setTime(aujourdhui)
    val annee1 = c.getWeekYear
    c.setTime(dateNais)
    val annee2 = c.getWeekYear

    val age: Int = annee1 - annee2

    return Personne(nom, Prenom, age, nationalite, salaire)
  }
  def facto(n:Int):Int={
    var resul: Int =1
    var n=0
    while(n>1){
      resul=resul*n
      n=n-1
    }
    return resul
  }
/*
  def facto2(m:Int):Int={
    if (m==0){
      return 1
    }
    else{

      return facto2(m-1)
    }
  }
  */


  def macollection():Unit={
    val maliste=List("fafa","willy","yves")

    val maliste2:List[Int]=List(10,15,12)

    maliste.foreach(L=>println(L.toUpperCase)) //L est une fonction anonyme. => tjrs devant
    val maliste3=maliste2.map( _* 3)
    maliste3.foreach(e=>println(e))
    //maliste2.foreach(e=>)
  }
  def liste_pre():Unit={
    val maliste1:List[String]=List("willy","fafa","yves","sido","jean","elo","marie")
    val liste1=maliste1.map(_.length)
    liste1.foreach(e=>println(e))
  }
  //la même fonction mais avec une sequence de nom.
  //map permet de creer une liste à partir de la liste précédente en appliquant une fonction.
  def liste_pre1():Unit={
    val seq1=Seq("willy","fafa","yves","sido","jean","elo","marie")
    //val seq2=seq1.map(_.length)
    val seq_filtre=seq1.filter(_.length>4)
    seq_filtre.foreach(e=>println(e))
  }


}
