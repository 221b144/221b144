
class Application
{
	public static void main(String[] args) {
		Mother m = new Mother();
        

    
        Child ch = new Child();
        ch.show(); // it will show the function of mother class 
        
        /* when child's fun is static 
        Child.java:2: error: show() in Child cannot override show() in Mother
         static void show(){
                ^
         overriding method is static
        */
        
        // when both are static -> this is the function of mother class 
	}
}