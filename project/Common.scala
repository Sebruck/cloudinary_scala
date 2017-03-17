object Common {
  def version = "1.1.2"  
  def playVersion = System.getProperty("play.version", "2.4.2")
  def scalaVersion =  "2.12.1"
  def scalaVersions =  Seq("2.10.4", "2.11.8", scalaVersion)
}
