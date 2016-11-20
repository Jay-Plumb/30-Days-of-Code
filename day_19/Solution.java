public class Solution {
    // Write your code here.
    Stack<Character> stack;
    Queue<Character> queue;
    
    // Constructor
    Solution() {
        stack = new Stack<Character>();
        queue = new LinkedList<Character>();
    }
    // Pushes a character onto a stack
    void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    // Enqueues a character 
    void enqueueCharacter(char ch) {
       queue.add(ch);
    }
    
    // pops first character form stack
    char popCharacter() {
        return stack.pop();
    }
    
    // Dequeue first character from queue
    char dequeueCharacter() {
        return queue.remove();
    }
    
