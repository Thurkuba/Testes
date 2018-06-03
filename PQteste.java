import java.util.Comparator;
import java.util.PriorityQueue;

public class PQteste
{

    private static class Node<Value> {
        private char c;                        // character
        private Node<Value> left, mid, right;  // left, middle, and right subtries
        private Value val;

	private Node(char c, Value val) {
	    this.val = val;
	    this.c = c;
	}
    }
    
    public static void main(String[] args)
	    
    {
	Comparator<String> comparator = new NodeValueComparator();
	PriorityQueue<String> queue = 
	    new PriorityQueue<String>(10, comparator);
    
	/* while (queue.size() != 0)
	   {
	   System.out.println(queue.remove());
	   }
	*/
    }


    private static class NodeValueComparator implements Comparator<Node<Value>>
    {
	@Override
	public int compare(Node<Value> x, Node<Value> y)
	{
	    // Assume neither string is null. Real code should
	    // probably be more robust
	    // You could also just return x.length() - y.length(),
	    // which would be more efficient.
	    if (x.val < y.val)
		{
		    return -1;
		}
	    if (x.val > y.val)
		{
		    return 1;
		}
	    return 0;
	}
    }

}
