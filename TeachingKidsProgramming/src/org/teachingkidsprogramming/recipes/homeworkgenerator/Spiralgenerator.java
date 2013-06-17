package org.teachingkidsprogramming.recipes.homeworkgenerator;

import java.io.File;

import com.spun.util.NumberUtils;
import com.spun.util.io.FileUtils;

public class Spiralgenerator
{
  public static void main(String[] args) throws Exception
  {
    String input = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\Spiral.java";
    String output = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\Spiral1.java";
    String recipeSpiral = FileUtils.readFile(input);
    java.io.File file = new File(output);
    //populate with random values
    int forloop = NumberUtils.getRandomInt(30, 100);
    int zoomFactor = NumberUtils.getRandomInt(3, 6);
    int degree = NumberUtils.getRandomInt(3, 9);
    //create a list a colors with red, blue and green
    String colorlist[] = {"red", "blue", "green"};
    //select a random color for the list
    String colorChange = colorlist[NumberUtils.getRandomInt(0, colorlist.length - 1)];
    recipeSpiral = String.format(recipeSpiral, colorChange, forloop, zoomFactor, degree);
    FileUtils.writeFile(file, recipeSpiral);
  }
}
