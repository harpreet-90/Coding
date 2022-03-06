package Heap;
public class HeapRun
{

    public static void main(String args[]){
        System.out.println("Hello world");

        Heap h = new Heap(6);
        h.insert(6);
        h.insert(5);
        h.insert(1);
        h.insert(3);
        h.insert(2);
        h.insert(4);
        System.out.println(h.min());

        h.delete(0);
        System.out.println(h.min());
    }
}