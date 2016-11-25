public static Node removeDuplicates(Node head) {
      
    // Check if head is not null 
    if (head == null) {
        return null;
    }
    
    Node iterator = head;
    while(iterator.next != null) {
        if (iterator.data == iterator.next.data) {
            iterator.next = iterator.next.next; 
        } else {
            iterator = iterator.next;
        }
    }
    return head;
}

