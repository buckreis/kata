package kata.lookandsay;

/**
 *
 * @author Andy
 */
public class LookAndSay {

    public static class IllegalSequenceException extends Exception {

    }

    public static int lookAndSayAsAnInt(int root) throws IllegalSequenceException {
        if (0 == root) {
            return 0;
        }
        int i = root % 10;
        int count = 1;
        root /= 10;

        while (i == root % 10) {
            count++;
            //you can't have more 9 digits in a row
            if (count == 10) {
                throw new IllegalSequenceException();
            }
            root /= 10;
        }

        return lookAndSayAsAnInt(root) * 100 + count * 10 + i;
    }

    public static int lookAndSayAsAnIntReverse(int root) throws IllegalSequenceException {

        if (0 == root) {
            return 0;
        }
        int digit = root % 10;
        root /= 10;
        int count = root % 10;
                
        //You can't have 0 of a digit
        //or if the sequence is now 0, there are no numbers to pull from
        if (0 == count || 0 == root) {
            throw new IllegalSequenceException();
        }
        int i = 0;
        root /= 10;
        int value = 0;
        while (count > i) {
            value = value * 10 + digit;
            i++;
        }

        return lookAndSayAsAnIntReverse(root) * (int) Math.pow(10, count) + value;
    }

}
