package Tpheritage;

import Encapexo5.Livre;

public class Person {
    public void SetAge(int n){
        System.out.println("age : "+ n);
    }
}

class Student extends Person{
    public void GoToClasses(){
        System.out.println("i am going to class : ");
    }
    public void SetAge(int n) {
        super.SetAge(2);
        System.out.println("my age is: " + n);
    }
}

class Teacher extends Person {
    private String subject;

    public void Explain() {
        System.out.println("explanation begins ");

    }
}


