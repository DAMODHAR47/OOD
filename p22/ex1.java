class Shape{};
class Rect extends Shape {}
class Square extends Rect {};

class Util{
  void fun(Shape shape){} //1
  void fun(Rect rect){} //2
  void fun(Square square){} //3
};
void main(){
  Square square = new Square();
  Rect rect = square; 
  Shape shape = rect; 
  Util util;
  util.fun(shape);
  util.fun(rect);
  util.fun(square);
}
//3.2.1. //3.3.3. //1.1.1

Java resolves overloaded methods at compile time based on the static type of the reference, not the runtime object type. This is called static polymorphism/Method Overloading
3.2.1
