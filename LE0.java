/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

 class Juet {
    String name ; 
    int age ; 
    public Juet(){
        
    }
    public  void set(String s , int num ){
        name =s ; 
        age = num ; 
    }
    public  void get(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Main
{
	public static void main(String[] args) {
	  
	Juet j1 = new Juet();
	j1.set("dev",14);
	j1.get();
	
	}
}