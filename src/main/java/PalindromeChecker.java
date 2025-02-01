import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  String newWord = letters(word).toLowerCase();
  if(newWord.equals(reverse(newWord))){
    return true;
  }
  return false;
}
public String reverse(String str)
{
  String newWord = "";
  for(int i = str.length()-1; i >= 0; i--){
    newWord = newWord + str.charAt(i);
  }
  return newWord;
}
public String letters(String str){
  String s = "";
  for(int i = 0; i < str.length(); i++){
    if(Character.isLetter(str.charAt(i))){
      s = s + str.charAt(i);
    }
  }
  return s;
}
}
