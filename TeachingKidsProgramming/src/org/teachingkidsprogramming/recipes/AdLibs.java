package org.teachingkidsprogramming.recipes;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("enter an adverb");
    String currentEdVerb = MessageBox.askForTextInput("enter a verb ending in -ed");
    String bodyPart = MessageBox.askForTextInput("enter a body part");
    String currentStory = "Today";
    currentStory = currentStory + " I woke " + currentAdverb + ". ";
    currentStory = currentStory + " Then I " + currentEdVerb + " ";
    //Add the words "my " + BodyPart + ". " to the current story --#7
    currentStory = currentStory + " my " + bodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
}