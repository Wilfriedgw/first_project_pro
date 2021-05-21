import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {

  def main(args: Array[String]):Unit={
    sessionSpark()
  }

  //creation d'une session spark. pas d'accent ni d'espace.
  def sessionSpark():Unit={
    System.setProperty("winutils","C:\\Hadoop")     //hadoop.home.dir à la place de winutils en cas de bug répétitif

    val ss=SparkSession.builder()
      .master(master = "local[*]")
      .appName(name = "Ma premiere application")
      //.enableHiveSupport()
      .getOrCreate()

    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark. Je suis un etudiant de l'INPHB"))
    rdd1.foreach(e=> println(e))

    val df_1 = ss.read
      .format("csv")
      .option("inferSchema","true")
      .option("header","true")
      .option("delimiter",";")
      .csv("C:\\hadoop\\orders_csv.csv")

    df_1.show(10)
    df_1.printSchema()

    df_1.createOrReplaceTempView("orders")

    ss.sql("SELECT * FROM orders WHERE city='NEWTON'").show()



  }

}
