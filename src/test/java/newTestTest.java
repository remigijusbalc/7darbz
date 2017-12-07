import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    @Test
    public void turetuGautiKvadrata()
    {
        newTest test7 = new newTest();
        int rez = test7.skaiciuojaSquare(5);
        assertEquals(25, rez);
    }

    @Test
    public void turetuRastiLetterA()
    {
        newTest test8 = new newTest();
        int zodis = test8.skaiciuojaRaideA("Kate");
        assertEquals(1,zodis);
    }

    @Test
    public void objektuLyginimas(){
        newTest test9 = new newTest();
        assertEquals(null,test9.lyginaObject1(null), test9.lyginaObject2(null));
    }

    @Test
    public void tikrinaArNeraNulis()
    {
     newTest test10 = new newTest();
     String returnedString = test10.metodasTikrinaArNeraNull("Ne");
     assertNotNull(returnedString);
    }

}