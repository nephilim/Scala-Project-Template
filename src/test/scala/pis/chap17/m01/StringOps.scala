package pis.chap17.m01
import org.scalatest.Spec
import org.scalatest.BeforeAndAfter

class StringOpsSpec extends Spec with BeforeAndAfter {

  before {
	
  }
  
  describe("String Ops 기본 동작") {

    it( "문자열을 scala collection 같이 다룰 수 있게 해준다.") (pending)

    it("dropWhile과 같은 higher order function 사용 가능") {

    	import scala.collection.immutable._;
    	val so = new StringOps("ABCDE");
    	
    	// 'A'가 나올 때까지 char를 버린다(drop)
    	val result = so.dropWhile( _ == 'A');	
    	assert(result.equals("BCDE"));
    }
    
    it("filter로 걸러내") {
       
    }
    
  }
  
  
}