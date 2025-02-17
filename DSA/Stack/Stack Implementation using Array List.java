import java.util.*;
public class StackAL {
    static ArrayList <Integer> list =new ArrayList <>();
    public static void push(int data){
        list.add(data);

    }
    public static boolean isEmpty() {
        return list.size()==0;

    }
    public static int pop() {
        if(isEmpty()){
            return-1;
        }
        int top = list.remove(list.size()-1);
        return top;

    }
    public static int peak(){
        if(isEmpty()){
            return-1;
        }
       return list.get(list.size()-1);


}


    public static void main(String args[]){
        StackAL stack=new StackAL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop(); // top ->  3 2 1

        System.out.print(" Displaying elements ");
        while(!stack.isEmpty()){
            System.out.print(stack.peak()+" ");
            stack.pop();
        }

    }

}
