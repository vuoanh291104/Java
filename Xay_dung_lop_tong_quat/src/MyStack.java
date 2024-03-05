public class MyStack {
    private Object[] element;
    private int size=0;
    public MyStack(){}
    public MyStack(int capacity){
        element = new Object[capacity];

    }
    public  boolean isEmpty(){
        return element.length == 0 ?true: false;
    }
    public boolean isFull(){
        return element.length == size ? true: false;
    }
    public Object peek(){
        return element[size -1];
    }
    public void push (Object type){
        element[size] = type;
        size++;
    }
    public Object pop(){
        size--;
        return element[size];
    }
    public  int getSize(){
        return size;
    }
    public int search(Object type){
        int index = 0;
        for(int i=0; i < element.length ;i++){
            if(element[i] == type){
                index=i;
            }
        }
        return index;
    }
    public void in(){
        for(var o: element){
            System.out.println(o);
        }
    }
}
