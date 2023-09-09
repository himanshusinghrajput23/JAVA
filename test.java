public class test{
    int a,b;
    test(){
        a=10;
        b=20;
    }
    test(int x,int y){
        a=x;
        b=y;
    }
    test(test t1)
    {
        a=t1.a;
        b=t1.b;
    }
    void display(){
        System.out.println(a+b);
    }
    public static void main (String [] args){
        test t=new test ();
        test t2=new test(30,40);
        test t3=new test(t2);
        t.display();
        t2.display();
        t3.display();
    }
}