public class Test {
    static int max(int x,int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args)
    {
        int a=10,b=15;
        Test t=new Test();
        System.out.println(t.max(a,b));
    }
}
