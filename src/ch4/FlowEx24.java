package ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트 다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);

            for (long j = 0; j < 4_000_000_000L; j++) {
                ;       // 시간 지연을 위한 반복문
            }
        }
        System.out.println("GAME OVER");
    }
}
