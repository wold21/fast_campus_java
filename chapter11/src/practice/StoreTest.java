package practice;

public class StoreTest {
    public static void main(String[] args) {
        Store store1 = Store.getInstanceStore();
        Store store2 = Store.getInstanceStore();

        store1.setStoreNum(33);
        store2.setStoreNum(34);

        System.out.println(store1);
        System.out.println(store1.getStoreNum());
        System.out.println(store2);
        System.out.println(store2.getStoreNum());

        // 싱글톤 패턴
        // 객체의 내용이 하나로만 유지되어야 할 경우.
        // 업데이트가 동시에 이루어지면 안되기 때문에
        // 멀티 쓰레드 환경에서는 동기화 조건을 함수에 달아준다.
    }

}
