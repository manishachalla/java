import java.io.*;
import java.util.*;
abstract class Animal {
    public abstract void animalSound();
        public void sleep(){
            System.out.println("zzzzz");
        }
    }
class Cow extends Animal{
        public void animalSound(){
            System.out.println("The cow sounds mao");
        }
    }
  public class AbstractionDemo{
        public static void main(String args[]){
            Cow C=new Cow();
            C.animalSound();
            C.sleep();
        }
    }
