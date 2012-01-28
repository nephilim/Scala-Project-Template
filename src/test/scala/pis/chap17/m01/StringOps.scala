package pis.chap17.m01
import org.scalatest.Spec
import org.scalatest.BeforeAndAfter

class StringOpsSpec extends Spec with BeforeAndAfter {

  import scala.collection.immutable._
  var so:StringOps = _
  
  before {
    so = new StringOps("ABCDE");
  }
  
  describe("String Ops 기본 동작") {

    it( "문자열을 scala collection 같이 다룰 수 있게 해준다.") (pending)
    
    it("dropWhile과 같은 higher order function 사용 가능") {
    	val result = so.dropWhile( _ < 'C')	
    	assert(result.equals("CDE"));
    }
    
    it("filter로 걸러내기도 가능") {
    	val result = so.filter( _ % 2 == 1 )
    	assert(result.equals("BD"));
    }
    
  }
  
  
}