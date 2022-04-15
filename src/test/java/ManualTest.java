import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManualTest{

	@Test
	public void ManualTest1() throws Throwable {
		AVLTree obj1=new AVLTree();
		obj1.insert(12);
		obj1.insert(0);
		obj1.delete(12);
	}
}