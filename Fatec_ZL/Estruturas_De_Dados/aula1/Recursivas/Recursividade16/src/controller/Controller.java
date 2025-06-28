package controller;

public class Controller {

   public Controller(){
       super();
   }

   public int divisao(int dividendo, int divisor){
       if(dividendo < divisor){
           return 0;
       } else {
           dividendo = dividendo - divisor;
           return 1 + divisao(dividendo, divisor);
       }
   }
}
