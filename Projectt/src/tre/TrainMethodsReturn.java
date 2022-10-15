package tre;

public class TrainMethodsReturn {
    public void returnNewInt() {
        int r = 11;
        System.out.println("метод returnNewInt вернул" + " " + r * 3);
    }
    public void returnNewLong(int y) {
        int r = y;
        System.out.println("метод returnNewLong вернул" + " " + (r - 4));
    }
    public void returnNewChar() {
        char r = 'e';
        System.out.println("метод returnNewChar вернул" + " " + r + r);
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
