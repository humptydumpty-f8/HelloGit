public class HeloGit {
    private String hello;

    public HeloGit() {
        this.hello = "Hello Git!";
    }

    public void print (){
        System.out.println("*********************");
        System.out.println(hello);
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        (new HeloGit()).print();

    }
}
