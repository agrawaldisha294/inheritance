// create a super class
class A{
    int i,j;
    void showij(){
        System.out.println("i and j:" + i + "  " +j);
    }
}
// create a subclass
class B extends A{
    int k ;
    void showk(){
        System.out.println("k:  " +k);
    }
    void sum (){
        System.out.println(" i+j+k: " +(i+j+k));
    }
}
class basiccode{
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();
        // a superclass may be used by itself
        superob.i=10;
        superob.j=20;
        System.out.println("contents of superob : ");
        superob.showij();
        System.out.println();
        // subclass can excess the elements of its superclass
        subob.i =7;
        subob.j =8;
        subob.k=9;
        System.out.println("contents of subob: ");
        subob.showij();
        subob.showk();
        System.out.println();
        System.out.println("sum of i,j, and k in subob: ");

        //disha agrawal
    }
}

