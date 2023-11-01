package org.velezreyes.quiz.question6;

public class ScottCola implements Drink {
  @Override
  public int getPrice(){
    return 75;
  }

  @Override
  public String getName() {
    return "ScottCola";
  }

  @Override
  public boolean isFizzy() {
    return true;
  }
}