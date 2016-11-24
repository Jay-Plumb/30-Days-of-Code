static void levelOrder(Node root){
    // BST algorithm 
    // Check the root is not null 
    if (root != null) {
        Queue<Node> queue = new LinkedList<Node>();
        // Enqueue the current node
        queue.add(root);
        // while there are nodes to process in the queue:
        while(!queue.isEmpty()) {
            // Dequeue the next node
            Node tree = queue.remove(); // could have bug, check for dequeue
              
            // Print out the data 
             System.out.print(tree.data + " ");
              
            // enqueue child elements from next level from left to right
            if (tree.left != null) {
                queue.add(tree.left);
            }
              
            if (tree.right != null) {       
                queue.add(tree.right);
            }
        }
    }
}
