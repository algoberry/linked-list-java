import java.util.Scanner;

class LLNode {
	int nodeValue;
	LLNode childNode;
	
	public LLNode(int nodeValue) {
		this.nodeValue = nodeValue;
		childNode = null;
	}
}

class LLCompute {
	private static LLNode newNode;
	private static LLNode headNode = null;
	private static LLNode tempNode;
	
	public static void add(int nodeValue) {
		newNode = new LLNode(nodeValue);
		if(headNode != null) {
			tempNode = headNode;
			while(tempNode.childNode != null) {
				tempNode = tempNode.childNode;
			}
			tempNode.childNode = newNode;
		}
		else
		{
			headNode = newNode;
		}
	}
	
	public static void display() {
		tempNode = headNode;
		if(tempNode != null) {
			while(tempNode.childNode != null) {
				System.out.print(tempNode.nodeValue+" ");
				tempNode = tempNode.childNode;
			}
			System.out.println(tempNode.nodeValue);
		}
	}
}

public class LinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements to insert:");
        int numberOfElements = scan.nextInt();
        int count = 1;
        for(;count<=numberOfElements;count++) {
        	System.out.print("Enter the "+count+" element value:"); 
        	LLCompute.add(scan.nextInt());
        }
        LLCompute.display();
	}
}