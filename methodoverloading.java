
public class methodoverloading {
    public static void main(String[] args) {
       methods m1 = new methods();
       System.out.println(m1.add(1, 2));
       System.out.println(m1.add(1, 2, 3));
       System.out.println(m1.add(1.0, 2.0));
    }
}
class methods{
     int add(int a ,int b){
        return a+b;
    }
     int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
