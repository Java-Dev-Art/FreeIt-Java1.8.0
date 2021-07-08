package GenericsBugFix;

public class Generics <T>{
    private T [] homeGenerics;

    public Generics (T[] homeGenerics) {
        this.homeGenerics = homeGenerics;
    }
    public T getIndex(int index){
        return this.homeGenerics[index];
    }

    public static void main(String[] args) {
        Integer [] ints = {4,6,7,8,9,1,2,4};
        Generics<Integer> integerHomeWorkGenerics = new Generics<Integer>(ints);
        System.out.println(integerHomeWorkGenerics.getIndex(0));
    }
}
