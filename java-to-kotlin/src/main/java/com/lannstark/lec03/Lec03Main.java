package com.lannstark.lec03;

public class Lec03Main {

  public static void main(String[] args) {

    Person person = new Person("최태현", 100);
    String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다", person.getName(), person.getAge());

    StringBuilder builder = new StringBuilder();
    builder.append("사람의 이름은");
    builder.append(person.getName());
    builder.append("이고 나이는");
    builder.append(person.getAge());
    builder.append("세 입니다");

    String str = "ABCDE";
    char ch = str.charAt(1);
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }
}
