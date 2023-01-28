

public class IncrementDecrementOperator {
    
    void show(){
        int a=7;
        int s=a+1;
        int k=a-1;
        /*
         but it is not a good code for java developer
         so we can write as a++ , a--
         */
        System.out.println(s);
        System.out.println(k);
    }

    // Shortest way 
     void show1(){

    int w=7;
    w++;
    int y=++w;
    System.out.println(w);
    System.out.println(y);

     }


     // but in java we have some type for increment 

     // post increment var++
     // pre increment  ++var
     // post decrement var--
     // pre decrement  --var
     void show2(){

     int e=2;
     e--;
     System.out.println(e);


     }
     void show3(){

        int b=7;
        ++b;
        System.out.println(b);
     }

     void show4(){

        int r=8;
        --r;
        System.out.println(r);
     }

     public static void main(String[] args) {

        IncrementDecrementOperator vinay=new IncrementDecrementOperator();

        vinay.show();
        vinay.show1();
        vinay.show2();
        vinay.show3();
        vinay.show4();
        

     }
    
}
