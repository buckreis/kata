package kata.lookandsay;

/**
 *
 * @author Andy
 */
public class LookAndSay {

    public static class SequenceHasOddNumberOfDigitsException extends Exception {

    }

    public static int lookAndSayAsAnInt(int root) {
        if (0 == root) {
            return 0;
        }
        int i = root % 10;
        int count = 1;
        root /= 10;

        while (i == root % 10) {
            count++;
            root /= 10;
        }

        return lookAndSayAsAnInt(root) * 100 + count * 10 + i;
    }

    public static int lookAndSayAsAnIntReverse(int root) {
        try {
            return lookAndSayAsAnIntReverseWithException(root);
        } catch (SequenceHasOddNumberOfDigitsException ex) {
            return root;
        }
    }

    private static int lookAndSayAsAnIntReverseWithException(int root) throws SequenceHasOddNumberOfDigitsException {

        if (0 == root) {
            return 0;
        }
        int digit = root % 10;
        root /= 10;
        int count = root % 10;
        if (count == 0) {
            throw new SequenceHasOddNumberOfDigitsException();
        }
        int i = 0;
        root /= 10;
        int value = 0;
        while (count > i) {
            value = value * 10 + digit;
            i++;
        }

        return lookAndSayAsAnIntReverseWithException(root) * (int) Math.pow(10, count) + value;
    }

}
