public class My_Stack <E>{
    private Object[] elements;
    private int size=0;
    public My_Stack(){}
    public My_Stack(int capacity){
       elements = new Object[capacity];
    }
    public boolean isEmpty(){
        return elements.length==0;
    }
    public boolean isFull(){
        return elements.length==size;
    }
    public E peek(){
        return (E)elements[size -1];
    }
    public  void push(E type){
        elements[size]=type;
        size++;
    }
    public E pop(){
        size--;
        return (E)elements[size];
    }
    public int getSize(){
        return this.size;
    }
    public int search(E type){
        int index=0;
        for(int i=0; i< elements.length; i++){
            if(elements[i]== type);
            index=i;
        }
        return  index;
    }
}
