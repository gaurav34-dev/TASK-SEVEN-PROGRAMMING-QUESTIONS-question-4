import java.util.*;
//import java.util.Arrays;
public class Main {
public static void main(String[] args) 
{
  Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();  
char arr[]=str.toCharArray();
  //char temp;
  int counter=0;
  //for(int i=0;i<arr.length;i++)
    //{
      //for(int j=i+1;j<arr.length;j++)
        //{
          //if(arr[i]>arr[j])
          //{
            //temp=arr[i];
            //arr[i]=arr[j];
            //arr[j]=temp;
          //}
        //}
    //}
  //System.out.println(arr);

  for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
          { counter++;
            break;
          }
        }
    }
  if(counter>0)
  {
    System.out.println("False");
  }
  else{
    System.out.println("the string has unique characters");
  }
  //String s=String.valueOf(arr); 
  //for(int i=0;i<s.length();i++)
    //{  char ch=s.charAt(i);
     
    //}

  
 }
}