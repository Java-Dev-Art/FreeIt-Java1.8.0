package HomeWorkGenerics;

public class HomeWorkGenerics <T>{
    private T [] homeGenerics;

    public HomeWorkGenerics(T[] homeGenerics) {
        this.homeGenerics = homeGenerics;
    }
    public T getIndex(int index){
        return this.homeGenerics[index];
    }

    public static void main(String[] args) {
        Integer [] ints = {4,6,7,8,9,1,2,4};
        HomeWorkGenerics<Integer> integerHomeWorkGenerics = new HomeWorkGenerics<Integer>(ints);
        System.out.println(integerHomeWorkGenerics.getIndex(0));
    }
}
