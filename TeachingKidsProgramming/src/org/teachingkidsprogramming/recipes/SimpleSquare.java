package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    //  Do the following 4 times --#5.1
    //      Change the color of the line the tortoise draws to "blue" --#4
    Tortoise.move(50);
    //      Turn the tortoise to the right (90 degrees) --#3
    Tortoise.turn(90);
    //  Repeat --#5.2
  }
}
