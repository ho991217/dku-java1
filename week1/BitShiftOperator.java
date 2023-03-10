package week1;

public class BitShiftOperator {
    public static void main(String []args) {
        short a = (short)0x55ff;
        short b = (short)0x00ff;
        // 비트연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%x\n", a & b);
        System.out.printf("%x\n", a | b);
        System.out.printf("%x\n", a ^ b);
        System.out.printf("%x\n", ~a);

        byte c = 20; // 0x14 (0000 0000 0000 0000 0000 0000 0001 0100)
        byte d = -8; // 0xf8 (1111 1111 1111 1111 1111 1111 1111 1000)

        System.out.printf("%x\n", c << 2);
        System.out.printf("%x\n", c >> 2);
        System.out.printf("%x\n", d >> 2);
        System.out.printf("%x\n", d >>> 2);
    }
}
