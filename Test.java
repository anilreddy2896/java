class Test{
    public  void m1(){
        System.out.println("hello from m1");
    }
}

class Exam extends Test{

    private int x=10;
    public void m2(){
        System.out.println("hello world "+x);
    }

}


class Testing{
    public static void main(String[] args){
        Exam e =new Exam();
        e.m1();
        e.m2();
    }
}

class A extends A{
    
}

