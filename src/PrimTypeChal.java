public class PrimTypeChal {
    public static void main(String[] args) {
        byte myByte = 116;
        short myShort = 21000;
        int myInt = 31586578;
        long myLong = 80000 - 5 * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
