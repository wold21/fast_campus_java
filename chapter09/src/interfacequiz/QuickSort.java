package interfacequiz;

public class QuickSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void decending(int[] arr) {
        System.out.println("QuickSort decending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }

}
