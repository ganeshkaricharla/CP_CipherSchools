import java.util.*; 

class SortQueue
{ 
static void FrontToLast(Queue<Integer> q, int qsize) 
{
	if (qsize <= 0) 
		return; 
	q.add(q.peek()); 
	q.remove(); 
	FrontToLast(q, qsize - 1); 
} 
static void pushInQueue(Queue<Integer> q, int temp, int qsize) 
{
	if (q.isEmpty() || qsize == 0) 
	{ 
		q.add(temp); 
		return; 
	} 
	else if (temp <= q.peek()) 
	{
		q.add(temp); 
		FrontToLast(q, qsize); 
	} 
	else
	{
		q.add(q.peek()); 
		q.remove(); 
		pushInQueue(q, temp, qsize - 1); 
	} 
} 
static void sortQueue(Queue<Integer> q) 
{
	if (q.isEmpty()) 
		return; 
	int temp = q.peek(); 
	q.remove(); 
	sortQueue(q); 
	pushInQueue(q, temp, q.size()); 
} 

public static void main(String[] args) 
{ 

	Queue<Integer> qu = new LinkedList<>(); 
	qu.add(10); 
	qu.add(7); 
	qu.add(16); 
	qu.add(9); 
	qu.add(20); 
	qu.add(5); 
	sortQueue(qu); 
	while (!qu.isEmpty()) 
	{ 
		System.out.print(qu.peek() + " "); 
		qu.remove(); 
	} 
} 
} 