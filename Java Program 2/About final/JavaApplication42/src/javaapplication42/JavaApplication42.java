package javaapplication42;
abstract class Shape {
abstract void draw();
public Shape(){
    System.out.println("gskjgfu");
}
public void sp(){
    System.out.println("uytuytu");
}
}
class Rectangle extends Shape {
@Override
void draw(){System.out.println( "drawing rectangle" );}
}
class Circle1 extends Shape{
@Override
void draw(){System.out.println( "drawing circle" );}
}//In real scenario, method is called by programmer or user
class JavaApplication42{
public static void main(String args[]){
Shape s= new Circle1(); //In real scenario, object is provided through method e.g. getShape()method
s.draw();
s.sp();


}
}
