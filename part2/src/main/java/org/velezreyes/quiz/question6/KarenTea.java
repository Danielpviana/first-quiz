package org.velezreyes.quiz.question6;

public class KarenTea implements Drink {
  @Override
  public int getPrice(){
    return 100;
  }

  @Override
  public String getName() {
    return "KarenTea";
  }

  @Override
  public boolean isFizzy() {
    return false;
  }
}