import java.util.Arrays;

class Node 
{
	int val;
	Node left;
	Node right;
}

class Heap
{
	private static final int INT_MIN = -9999999;
	private static final int INT_MAX = 9999999;
	int size = -1;
	int[] heap = null;
	
	Heap(int capacity)
	{
		this.heap = new int[capacity];
		Arrays.fill(this.heap, INT_MAX);
	}
	
	int parent(int i)
	{
		return (i-1)/2;
	}
	
	int left(int i)
	{
		return (2*i)+1;
	}
	
	int right(int i)
	{
		return (2*i)+2;
	}
	
	void heapifyMax(int i)
	{
		// Assuming each subTree is heapified.
		int left = left(i);
		int right = right(i);
		int greatest = (heap[left] > heap[i])? left: ( (heap[right]>heap[i])? right: i );
		if(i != greatest)
		{
			swapValues(i, greatest);
			heapifyMax(greatest);
		}
	}
	
	void heapifyMin(int i)
	{
		// Assuming each subTree is heapified.
		int left = left(i);
		int right = right(i);
		if((left>this.size) || (right > this.size) || (i > this.size)) return;
		int smallest = (heap[left] < heap[i])? left: ( (heap[right]<heap[i])? right: i );
		if(i != smallest)
		{
			swapValues(i, smallest);
			heapifyMin(smallest);
		}
	}
	
	void insert(int val)
	{
		if(this.size < (heap.length - 1))
		{
			this.size++;
			heap[this.size] = val;
			int i = this.size;
			while(i!=0)
			{
				if(heap[i] < heap[parent(i)])
				{
					swapValues(i, parent(i));
					i = parent(i);
				}
				else{
					break;
				}
			}
			System.out.println("Value is successfully inserted in Heap");
		}
		else
		{
			System.out.println("Heap is full");
		}
	}
	
	void decreaseKey(int i, int newValue){
		heap[i] = newValue;
		while(i!=0)
		{
			if(heap[i] < heap[parent(i)])
			{
				swapValues(i, parent(i));
				i = parent(i);
			}
			else break;
		}
	}
	
	private void swapValues(int i, int parent) 
	{
		int temp = heap[i];
		heap[i] = heap[parent];
		heap[parent] = temp;
	}

	void delete(int i)
	{
		decreaseKey(i, INT_MIN);
		extractMin();
	}
	
	void extractMin(){
			if(size == 1){
				heap[0] = heap[1];
				size--;
			}
			if(size > 1)
			{
				heap[0] = heap[this.size];
				heap[this.size] = INT_MAX;
				size--;
				heapifyMin(0);
			}
	}
	
	
	int min()
	{
		return (this.size == -1)? INT_MAX : heap[0];
	}
	
	int max()
	{
		return (this.size == -1)? INT_MAX : heap[0];
	}
	
}