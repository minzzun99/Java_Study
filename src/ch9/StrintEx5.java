package ch9;

public class StrintEx5 {
    public static void main(String[] args) throws Exception{
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP949");

        System.out.println("UTF-8:");
    }
}
