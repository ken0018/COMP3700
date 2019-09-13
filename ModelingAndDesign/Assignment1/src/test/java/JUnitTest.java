import org.junit.*;
import java.lang.*;
public class JUnitTest{

    @Test
    public void findMaxValid() {
        Integer[] array1 = {0, 1, 4, 3, 2};
        Integer a = 4;
        Integer output = Finder.findMax(array1);
        Assert.assertEquals(a, output);
    }

    @Test
    public void findMaxEmpty(){
        Integer [] array2 = {};
        Integer output = Finder.findMax(array2);
        Assert.assertEquals(null,output);
    }

    @Test
    public void findMaxNull(){
        Integer [] array3 = null;
        Integer output = Finder.findMax(array3);
        Assert.assertEquals(null,output);
    }

    @Test
    public void findMinValid() {
        Integer a = 0;
        Integer[] array4 = {4, 1, 0, 3, 2};
        Integer output = Finder.findMin(array4);
        Assert.assertEquals(a, output);
    }

    @Test
    public void findMinEmpty(){
        Integer [] array5 = {};
        Integer output = Finder.findMin(array5);
        Assert.assertEquals(null,output);
    }

    @Test
    public void findMinNull(){
        Integer [] array6 = null;
        Integer output = Finder.findMin(array6);
        Assert.assertEquals(null,output);
    }

}
