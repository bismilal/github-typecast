package acesmodi;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
  }


public class AceesModifier extends Animal 
{ 
      
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Data d = new Data();
          
        // access the private variable using the getter and setter
		 // create an object of Dog class
		AceesModifier dog = new AceesModifier();
         // access protected method
        dog.display();
        d.setName("Doerman");
        System.out.println(d.getName());
	}

}
