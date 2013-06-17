package org.teachingkidsprogramming.recipes.triangleshell;

import java.io.File;

import com.spun.util.NumberUtils;
import com.spun.util.io.FileUtils;

public class triangleShellGenerator
{
  public static void main(String[] args) throws Exception
  {
    String input = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\TriangleShell.java";
    String output = "C:\\Users\\fcstaff\\Documents\\GitHub\\TeachingKidsProgramming.Java\\TeachingKidsProgramming\\src\\org\\teachingkidsprogramming\\recipes\\TriangleShell1.java";
    String recipeTriangleShell = FileUtils.readFile(input);
    java.io.File file = new File(output);
    //populate with random values
    int forloop = NumberUtils.getRandomInt(30, 100);
    recipeTriangleShell = String.format(recipeTriangleShell, forloop);
    FileUtils.writeFile(file, recipeTriangleShell);
  }
}
