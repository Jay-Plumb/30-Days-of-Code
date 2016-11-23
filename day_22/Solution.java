    public static int getHeight(Node root){
    
        // Base case
        if (root == null) {
            return -1; // -1 indicates there is no node so there cannot be a height
        } else {
           // here we have a .left or .right field so add the current height and recurse
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

