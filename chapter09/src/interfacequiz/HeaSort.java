package interfacequiz;

public class HeaSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("HeaSort ascending");
    }

    @Override
    public void decending(int[] arr) {
        System.out.println("HeaSort decending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeaSort 입니다.");
    }
}