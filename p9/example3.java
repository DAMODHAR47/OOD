class CA{}
class CB exends CA{}
class CC exends CA{}

class CX{
  void f(CA) {}//1
  void f(CB) {}//2
  void f(CC) {}//3
}
class CY. extends CX {
  void f(CA) {}//4
  void f(CB) {}//5
  void f(CC) {}//6
}
class CZ. extends CX {
  void f(CA) {}//7
  void f(CB) {}//8
  void f(CC) {}//9
}

CA a = new CC();
CX x = new CZ();
x.f(a); 
