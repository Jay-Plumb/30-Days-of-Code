    public static Node insert(Node head,int data) {
        // If we have nothing then create a new node
        if (head == null) {
            return new Node(data);
        }
        // Create a new node
        Node newNode = new Node(data);
        
        // Insert to end of the list
        Node iterator = head;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = newNode;
        
        return head;
    }

