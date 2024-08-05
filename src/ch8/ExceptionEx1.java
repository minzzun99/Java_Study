package ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e) {
            try {

            } catch (Exception e1) {     //변수 e가 중복 선언 되었기 때문에 에러

            }
            // catch 블럭 내에서는 같은 이름의 변수 사용 불가능
        }

        try {

        } catch (Exception e) {

        }
    }
}
