package pis.chap17.m01
import org.scalatest.Spec
import org.scalatest.BeforeAndAfter

class StringOpsSpec extends Spec with BeforeAndAfter {

  /*
   * BeforeAndAfter Trait을 이용하면 사전/후 작업을 할 수 있다.
   * JUnit의 setup(), teardown()과 유사하다. 
   */
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
    
    it("filter" ) {
    	val result = so.filter( _ % 2 == 1 )
    	assert(result.equals("ACE"));
    }
    
  }
  
  
}