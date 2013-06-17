package org.teachingkidsprogramming.recipes.homeworkgenerator;

import java.io.File;

import com.spun.util.io.FileUtils;

public class Spiralgenerator
{
  public static void main(String[] args) throws Exception
  {
    //read the contents of spiral
    String input = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\Spiral.java";
    String output = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\Spiral1.java";
    String recipeSpiral = FileUtils.readFile(input);
    //create the file to store the output
    java.io.File file = new File(output);
    //write the contents to spiral generated 
    FileUtils.writeFile(file, recipeSpiral);
  }
}
