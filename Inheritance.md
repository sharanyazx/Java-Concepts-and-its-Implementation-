# Single Inheritance
```java []
class Dad {
    int money = 500000;
}
class Son  extends Dad{     // when we use extend we have properties of dad class
    int age = 25;
}

    public class Hello {

    public static void main(String[]args){
       Son obj=new Son();
       
        System.out.println(obj.money);  // we have dad's money in son class
       


    }
}

```


# Multi Level Inheritance
```java []
class Grandfather {
    int money = 500000;
}
class Father  extends Grandfather{   // Father has GrandFather  properties
    int age = 25;
}
class Son extends Father{    // Son has Father  properties
    int mark = 50;
}

    public class Hello {

    public static void main(String[]args){

       Son obj = new Son();
        System.out.println(obj.money);
        System.out.println(obj.age);
        System.out.print(obj.mark);


    }
}

```

# Hierarchical Inheritance
  ```java []

```
