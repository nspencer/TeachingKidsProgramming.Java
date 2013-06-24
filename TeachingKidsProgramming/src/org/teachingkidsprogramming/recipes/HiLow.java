package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.NumberUtils;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 1; i <= 3; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number?");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!");
      }
      else if (guess >= answer)
      {
        MessageBox.showMessage("Guess is too high");
      }
      else if (guess <= answer)
      {
        MessageBox.showMessage("Guess is too low");
      }
    }
    MessageBox.showMessage("You lost!!");
  }
}
