public class javaoverloading {
 public static void main(String[] args){
    int result = addnos(4,5);
    double result2 = addnos(8.5,9.2,4);

    System.out.println("addition of 2 nos:"+result);
    System.out.println("addition of decimal no is:"+result2);

    double result1 = addnos(90,45,100,23);
    System.out.println("multiply is:"+result1);


 }
//same method name different arguments passed
    public static int addnos(int a, int b){
     return a+b;
    }
    public static double addnos(double a, double b, double c){
        return (a+b+c);
    }


    public static double addnos(double a, double b, double c, double d){
     return (a*b*c*d);
    }
}
