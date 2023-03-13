public class First {
    public static void main(String[] args) {
        System.out.println("123");
        First first = new First();
        System.out.println(first.plus(4,5));
    }
    public int plus(int a, int b){
        return a+b;
    }
}
