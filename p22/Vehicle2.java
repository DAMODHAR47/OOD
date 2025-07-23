do(Car car){
    car.lock();
    car.go();
}
do(Ship ship){
     ship.balance();
     ship.swim();
}
do(Airplane airplane){
     airplane.go();
     airplane.fly();
}
do(Tank tank){
     tank.move();
     tank.stop();
     tank.fire();
}

execute(List<Vehicle> vehicles){
    for(Vehicle vehicle : vehicles) {
        do(vehicle);
        vehicle.stop();
    }
}

Won't compile. leads to a compile-time error
Static Polymorphism/Method Overloading — resolved at compile time based on reference type
Dynamic Polymorphism/Method Overriding — resolved at runtime based on object type

Java uses static method resolution for overloading, and at compile time, the compiler only sees the declared type and do(Vehicle) is not present.
