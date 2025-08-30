package com.jana;



class Calc{

   public void show(){
        System.out.println("calc show");
    }

     public void add(int a, int b){
        System.out.println(a+b);
    }

}

class AdCalc extends Calc {
        final int id;

        AdCalc(int id){
            this.id = id;
        }

  public void bark(){
        System.out.println("Dog is barking");
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("code running");

    }
}
