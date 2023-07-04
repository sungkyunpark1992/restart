package com.sparta.springre.request;

//import lombok.Getter;
//
//@Getter--------------------> Getter 부분은 있으나 없으나 helloRequestBodyForm 메소드가 작동하는데 문제가 없다.
public class Star {
    String name;
    int age;

    public Star(String name, int age){
        this.name = name;
        this.age = age;
    }
//    public Star(){}----------------> 하지만 이 기본생성자가 있으면 helloRequestBodyForm 메소드가 null값만 출력한다.. 왜그럴까..
}
