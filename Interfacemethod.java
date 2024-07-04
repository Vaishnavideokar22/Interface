interface Test{
    void GetArea();
}
class Triangle implements Test{
    double base;
    double height;
    double area;

    Triangle(double Base,double Height){
        this.base = Base;
        this.height = Height;
}
public void GetArea(){
    area = 0.5*base*height;
    System.out.println("The area Of Triagle is:" + area);
}
}
class Square implements Test{
    double side;
    double area;

    Square(double Side){
        this.side = Side;
}
public void GetArea(){
    area = side*side;
    System.out.println("The Area Of square is:" + area);
}
}

public class Interfacemethod {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(22, 22);
        t1.GetArea();

        Square s1 = new Square(22);
        s1.GetArea();



        
    }
    
}
