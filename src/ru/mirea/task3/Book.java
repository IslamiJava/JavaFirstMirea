
package ru.mirea.task3;
import java.lang.*;
public class Book {
    private String name;
    private int age;
    private int GodVupuska;
    public Book(String n, int a, int g){
        name = n;
        age = a;
        GodVupuska=g;

    }
    public Book(String n){
        name = n;
        age = 0;

    }
    public Book(){
        name = "";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+ " Кол-во страниц " +this.age + "Дата выпуска "+ this.GodVupuska;

    }
}




