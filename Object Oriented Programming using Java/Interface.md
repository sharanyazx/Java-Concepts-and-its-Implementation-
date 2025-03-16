# Interface 
``` java []
package demo;
interface Animal{
	void sound() ;
}
class Dog implements Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks bow! bow!");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.sound();

	}

}

```

## Output
```
Dog Barks bow! bow!

```
