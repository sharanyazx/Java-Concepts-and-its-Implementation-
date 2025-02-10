class Main {
    
    static void func(int i, int n){
        
            // Base Condition.
            if(i>n) return;
            System.out.println(i);
            func(i+1,n);

    }
    public static void main(String[] args) {
        int n = 10;
        func(1,n);
    }
}
