public class ArrayStack {
    private char[] arr;
    private int size;
    public ArrayStack(int capacity)
    {
        arr=new char[capacity];
    }
    public void push(char val)
    {
        if(size==arr.length)
        {
            char[] newArr=new char[arr.length*2];
            System.arraycopy(arr,0,newArr,0,arr.length);
            arr=newArr;
        }
        arr[size]=val;
        size++;
    }
    public char pop()
    {
        char retval=arr[--size];
        return retval;
    }
    public char peek()
    {
        return arr[size-1];
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void print()
    {
        int index;
        for(index=size-1;index>=0;index--)
        {
            System.out.println(stack[index]);
        }
    }
}
