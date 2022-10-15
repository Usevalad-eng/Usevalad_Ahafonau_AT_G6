package quattro;

public class TrainMethodsReturn {
    public void returnNewInt() {
        int r = 12;
        if (r < 8) {
            System.out.println("метод returnNewInt вернул" + " " + (r * 7));
        } else {
            System.out.println("метод returnNewInt вернул" + " " + (r / 4));
        }
    }

    public void returnNewLong(long y) {
        long r = 12;
        if (r > 300) {
            System.out.println("метод returnNewLong вернул" + " " + (r - 300));
        } else {
            System.out.println("метод returnNewLong вернул" + " " + (r + 20));
        }
    }

    public void returnNewChar() {
        char r = 'w';
        if (r == 'w') {
            System.out.println("метод returnNewLong вернул go");
        } else {
            System.out.println("метод returnNewLong вернул go-o");
        }
    }

    public void returnNewFloat() {
        float r = (float) 1000.09;
        System.out.println("метод returnNewFloat вернул" + " " + (r / 2));
    }

    public void returnNewShort() {
        short r = (short) 100;
        System.out.println("метод returnNewShort вернул" + " " + (r - 1));
    }

    public void returnNewByte() {
        byte r = (byte) 1;
        System.out.println("метод returnNewByte вернул" + " " + (r * 2));
    }

    public void returnNewBoolean() {
        boolean r = true;
        System.out.println("метод returnNewBoolean вернул" + " " + !r);
    }
}
