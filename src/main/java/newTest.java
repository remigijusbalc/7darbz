import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class newTest {

    int value1 = 5;
    int value2 = 8;
    private int age;

    public int minusNumber(int a, int b) {
        return a - b;
    }

    public String addString(String c, String d) {
        return c + d;
    }

    public String getUpperCase(String name) {
        return name.toUpperCase();
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int suskaiciuotiSimbolius(String zodis)
    {
        int length = zodis.length();
        return length;
    }

    public int skaiciuojaSquare(int x)
    {
     return x*x;
    }

    public int skaiciuojaRaideA(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A')
                count++;
        }
        return count;
    }

    public Object lyginaObject1(Object a)
    {
        return a;
    }

    public Object lyginaObject2(Object b)
    {
        return b;
    }

    public String metodasTikrinaArNeraNull(String stringText)
    {
        return stringText;
    }

}
