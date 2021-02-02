package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }

        // // 자바 9부터는 변수를 넣어줘도 된다.
        // AutoCloseObj obj = new AutoCloseObj();
        // try (obj) {
        // throw new Exception();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
    }

}
