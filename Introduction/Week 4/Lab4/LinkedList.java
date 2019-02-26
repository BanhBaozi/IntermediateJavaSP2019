public class LinkedList {

    public Node headNode = new Node();

    public void addNode(int x, int y) {

        Node newNode = new Node();


        newNode.xPosition = x;
        newNode.yPosition = y;

        newNode.nextNode = headNode;
        headNode = newNode;

    }

    public Node removeHeadNode() {

        Node temp = headNode;

        headNode = headNode.nextNode;
        return temp;
    }
}
