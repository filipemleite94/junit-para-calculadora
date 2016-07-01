import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ValorTest {

	@Test
	public void test() {
		Valor v= new Valor();
		v.read(3.14);
		v.operacoes('+');
		v.read(2);
		Assert.assertEquals(5.14, v.operacoes('='),0.00001);	
	}
	
	@Test
	public void test2() {
		Valor v= new Valor();
		v.read(3.14);
		v.operacoes('*');
		v.read(2);
		Assert.assertEquals(6.28, v.operacoes('='),0.00001);	
	}
	
	@Test
	public void test3() {
		Valor v= new Valor();
		v.read(3.14);
		v.operacoes('-');
		v.read(2);
		Assert.assertEquals(1.14, v.operacoes('='),0.00001);	
	}
	
	@Test
	public void test4() {
		Valor v= new Valor();
		v.read(3.14);
		v.operacoes('/');
		v.read(2);
		Assert.assertEquals(1.57, v.operacoes('='),0.00001);	
	}
	
	@Test
	public void test5() {
		Valor v= new Valor();
		v.read(3.14);
		v.operacoes('/');
		v.read(0);
		Assert.assertEquals(-2, v.operacoes('='),0);	
	}
}
