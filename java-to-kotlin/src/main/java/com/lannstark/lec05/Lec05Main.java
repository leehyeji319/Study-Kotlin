package com.lannstark.lec05;

import java.util.Random;

public class Lec05Main {

  public static void main(String[] args) {
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다");
      return;
    }

    System.out.println("주어지는 숫자는 홀수입니다");
  }

  //java의 if문
  private void validateScoreIsNotNegative(int score) {
    if (score < 0) {
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  private String getPassOrFail(int score) {
    if (score >= 50) {
      return "P";
    } else {
      return "F";
    }
  }

  //if문을 하나의 값으로 취급하지 않으니 당연히 에러가 난다. -> 이건 statement다.
  /*
  private String getPassOrFail1(int score) {
    String grade = if (score >= 50) {
      "P";
    } else {
      "F";
    }
  }
  */

  //3항 연산자는 하나의 값으로 취급하므로 에러가 없다. -> Expression이면서 Statement이다.
   private String getPassOrFail2(int score) {
     String grade = score >= 50 ? "P" : "F";
     return grade;
   }

  private String getGrade(int score) {
     if (score >= 90) {
       return "A";
     } else if (score >= 80) {
       return "B";
     } else if (score >= 70) {
       return "C";
     } else {
       return "D";
     }
  }

  //switch와 when
  private String getGradeWithSwitch(int score) {
     switch (score / 10) {
       case 9:
         return "A";
       case 8:
         return "B";
       case 7:
         return "C";
       default:
         return "D";
     }
  }

}
