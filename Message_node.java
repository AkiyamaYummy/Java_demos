import java.util.Iterator;
import java.util.Vector;
public class Message_node implements Iterable<Object>{
	private Vector<Object> messageLine;
	public Message_node(int size){
		messageLine = new Vector<Object>(size);
	}
	public void add(Object obj){
		messageLine.add(obj);
	}
	public int size(){
		return messageLine.size();
	}
	public Iterator<Object> iterator(){
		return messageLine.iterator();
	}
	public Object elementAt(int i){
		return messageLine.elementAt(i);
	}
	public String toString(){
		StringBuffer res = new StringBuffer();
		for(Object obj:messageLine){
			res.append(obj.toString()+" ");
		}
		return res.toString();
	}
}
