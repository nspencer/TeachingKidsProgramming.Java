package org.teachingkidsprogramming.recipes.homeworkgenerator;

import java.io.File;

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
    Int forloop;
    recipeSpiral = String.format(recipeSpiral, forloop)
    FileUtils.writeFile(file, recipeSpiral);
  }
}
