public class StackMain {
    
    public static Integer[] reverse(Integer[] a){
        //Khai bao 1 stack
        ArrayStack s =  new ArrayStack(a.length);
        Integer[] b = new Integer[a.length]; //tao 1 mang b
        for(Integer i = 0; i < a.length; i++){
            s.push(a[i]); 
        }
        for(int i = 0; i < a.length; i++){
            b[i] = (Integer)(s.pop());
        }
        return b;
    }
    public static void main(String[] args) {
        Integer[] a = new Integer[5]; 
        a[0]=new Integer(1);
        a[1]=new Integer(2);
        a[2]=new Integer(3);
        a[3]=new Integer(4);
        a[4]=new Integer(5);

        // Integer[] a = {1,2,3,4,5};
        
        // for (int i = 0; i< a.length; i++)
            // a[i] = Integer.parseInt(args[i]);
            System.out.println("Ngan xep la:");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        
        Integer[] b = reverse(a);//dao nguoc a
        for(int i = 0; i < a.length; i++){
            System.out.print(b[i] + " ");
        }
    }    
}