package design;

abstract class UseEmployee {
    public abstract void EmployeeInfo(); // this is abstract method without body
    // to use this abstarct method i need to extends it in toyota
// non abstract method
    public void EmployeeId(){
        System.out.println("empolyee id ");
    }
}

