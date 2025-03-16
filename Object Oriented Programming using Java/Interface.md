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
## Multiple Interface
``` java []
package demo;
interface Tiger{
	void display();
}
interface Cheetah{
	void display();
}
class Cat implements Tiger,Cheetah{

	@Override
	public void display() {
		System.out.print("Tiger and Cheetah are belong to Cat Family ");
		 
	}
	
}
public class PracticeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cat c=new Cat();
        c.display();
	}

}

```
## Output
```
Tiger and Cheetah are belong to Cat Family
```
