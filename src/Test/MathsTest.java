package Test;

import Main.Maths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathsTest {
    Maths maths;
    @Before
    public void setupinstance(){
        maths = new Maths();
    }

    @Test
    public void  checkTheSumofTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(3, maths.addTwoNumbers(1, 2));
    }

    @Test
    public void  checkifnumberisprime(){
        Assert.assertTrue(maths.checkprime(3));
    }






}
