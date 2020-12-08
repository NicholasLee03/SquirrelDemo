package squirrel;

import squirrel.Squirrel;

public class Main{

  public static void main(String[] args){
    Squirrel squirrel1;
    Squirrel squirrel2;
    Squirrel squirrel3;

    squirrel1 = new Squirrel("Alvin", "brown", "America", 2);
    squirrel2 = new Squirrel("Simon", "grey", "Asia", 3);
    squirrel3 = new Squirrel("Theodore", "black", "Europe", 4);

    squirrel1.run();
    squirrel2.run();
    squirrel3.run();

    squirrel1.eat("nuts");
    squirrel2.eat("chips");
    squirrel3.eat("nothing");

    squirrel1.sleep(10);
    squirrel2.sleep(6);
    squirrel3.sleep(8);


  }

}