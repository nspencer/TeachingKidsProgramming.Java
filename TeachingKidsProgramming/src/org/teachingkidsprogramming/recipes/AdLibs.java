package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    //create a model to hold the words
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("enter an adverb");
    words.edVerb = MessageBox.askForTextInput("enter a verb ending in -ed");
    words.bodyPart = MessageBox.askForTextInput("enter a body part");
    String currentStory = Parser.parse("Today I woke {adverb}. Then I {edVerb} my {bodyPart}.", words);
    // currentStory = currentStory + " I woke " + adverb + ". ";
    //currentStory = currentStory + " Then I " + edVerb + " ";
    // currentStory = currentStory + " my " + bodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
}