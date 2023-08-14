package polymorphism.runtime;

public class CircleArea extends Area{
    double findArea(float radius){
       //different implementation
        return 1/2*radius*radius*radius+100;
    }
}
