import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class newTestTest {

    @Test
    public void test() {
        newTest test = new newTest();
        int result = test.minusNumber(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testString() {
        newTest test2 = new newTest();
        String result2 = test2.addString("Vardas", "Rolka");
        assertEquals("VardasRolka", result2);
    }

    @Test
    public void notTheSame() {
        newTest test3 = new newTest();
        int result = test3.minusNumber(5, 9);
        assertNotEquals(7, result);
    }

    @Test
    public void getUpperCase() {
        newTest test4 = new newTest();
        String result = test4.getUpperCase("grybas");
        assertEquals("GRYBAS", result);
        ;
    }

    @Test
    public void getsPersonsAge() {
        int age = 20;
        newTest test5 = new newTest();
        test5.setAge(age);
        Assert.assertTrue(test5.getAge() == age);

    }

    @Test
    public void turetuSuskaiciuotiSimbolius() {
        newTest test6 = new newTest();
        int raides = test6.suskaiciuotiSimbolius("baravykas");
        Assert.assertEquals(9, raides);
    }
}