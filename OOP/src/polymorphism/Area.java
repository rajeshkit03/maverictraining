package polymorphism;

public class Area {
    //findArea

    double findArea(float radius){
        System.out.println("area of circle");
        return 3.14 * radius * radius;
    }
    int findArea(int length,int bredth){
        System.out.println("area of rectange");
        return length * bredth;
    }
    float findArea(float base,int height){
        System.out.println("area of triangle");
        return  1/2*base*height;
    }
}
