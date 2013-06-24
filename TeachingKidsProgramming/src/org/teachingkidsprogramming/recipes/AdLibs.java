package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("enter an adverb");
    words.edVerb = MessageBox.askForTextInput("enter a verb ending in -ed");
    words.bodyPart = MessageBox.askForTextInput("enter a body part");
    String currentStory = Parser.parseRtfFile("view.rtf", words);
    Viewer.displayRtfFile(currentStory);
  }
}