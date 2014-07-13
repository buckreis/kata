package kata.lookandsay;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Andy
 */
public class LookAndSayTest {

    @Test
    public void lookAndSayTest() throws LookAndSay.IllegalSequenceException {
        Assert.assertEquals(11, LookAndSay.lookAndSayAsAnInt(1));
        Assert.assertEquals(21, LookAndSay.lookAndSayAsAnInt(11));
        Assert.assertEquals(1211, LookAndSay.lookAndSayAsAnInt(21));
        Assert.assertEquals(111221, LookAndSay.lookAndSayAsAnInt(1211));
        Assert.assertEquals(312211, LookAndSay.lookAndSayAsAnInt(111221));

    }

    @Test(expected = LookAndSay.IllegalSequenceException.class)
    public void lookAndSayIllegalSequenceTest() throws LookAndSay.IllegalSequenceException {
        LookAndSay.lookAndSayAsAnInt(1111111111);

    }

    @Test
    public void lookAndSayReverseTest() throws LookAndSay.IllegalSequenceException {
        Assert.assertEquals(1, LookAndSay.lookAndSayAsAnIntReverse(11));
        Assert.assertEquals(11, LookAndSay.lookAndSayAsAnIntReverse(21));
        Assert.assertEquals(21, LookAndSay.lookAndSayAsAnIntReverse(1211));
        Assert.assertEquals(1211, LookAndSay.lookAndSayAsAnIntReverse(111221));
        Assert.assertEquals(111221, LookAndSay.lookAndSayAsAnIntReverse(312211));

    }

    @Test(expected = LookAndSay.IllegalSequenceException.class)
    public void lookAndSayReverseOddTest() throws LookAndSay.IllegalSequenceException {
        Assert.assertEquals(444, LookAndSay.lookAndSayAsAnIntReverse(444));
    }

    @Test(expected = LookAndSay.IllegalSequenceException.class)
    public void lookAndSayReverseIllegalSequenceTest() throws LookAndSay.IllegalSequenceException {
        LookAndSay.lookAndSayAsAnIntReverse(1001);

    }

}
