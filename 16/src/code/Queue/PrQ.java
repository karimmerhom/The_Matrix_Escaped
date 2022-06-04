package code.Queue;

import java.util.PriorityQueue;

import code.PreNode;

public class PrQ extends Queue{
	public PriorityQueue<PreNode> queue;
	public PrQ() {
		queue= new PriorityQueue<PreNode>();
		
	}
	@Override
	public void enqueue(PreNode pn) {
		// TODO Auto-generated method stub
		queue.add(pn);
	}
	@Override
	public PreNode dequeue() {
		return queue.remove();
	}

}