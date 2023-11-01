package org.velezreyes.quiz.question6;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {
  private Map<String, Drink> inventory;
  private static VendingMachine instance;
  private int moneyAvailable;

  private VendingMachineImpl() {
    inventory = new HashMap<>();
    inventory.put("ScottCola", new ScottCola());
    inventory.put("KarenTea", new KarenTea());
    moneyAvailable = 0;
  }

  public static VendingMachine getInstance() {
    instance = new VendingMachineImpl();
    return instance;
  }

  @Override
  public void insertQuarter() {
    moneyAvailable += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    Drink drinkClass = inventory.get(name);
    if (drinkClass != null) {

      if (drinkClass.getPrice() == moneyAvailable) {
        return drinkClass;
      } else {
        throw new NotEnoughMoneyException();
      }

    } else {
      throw new UnknownDrinkException();
    }
  }

}
