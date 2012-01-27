package pis.chap08.m01
import scala.io.Source

object LongLine {
	def processFile(fileName:String, width:Int) {
	  val source = Source.fromFile(fileName) 
	  for( line <- source.getLines()) 
	    processLine(fileName, width, line)
	}
	
	private def processLine(fileName:String, width:Int, line:String) {
	  if( line.length > width ) {
	    println(fileName + ": " + line.trim)
	  }
	}
}

object FindLongLines {
  def main(args: Array[String]) {
	 
  }
}