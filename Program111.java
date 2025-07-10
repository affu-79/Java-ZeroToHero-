
import java.util.LinkedList;
import java.util.Queue;

public class Program111 {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null; // Base case: if the value is -1, return null
            }

            Node newNode = new Node(nodes[idx]); // Create a new node with the current value
            newNode.left = buildTree(nodes); // Recursively build the left subtree
            newNode.right = buildTree(nodes); // Recursively build the right subtree
            return newNode; // Return the newly created node
        }
    }

    // Preorder traversal: Root -> Left subTree -> Right subTree
    // This function prints the nodes in preorder fashion
    // For example, for the tree:
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);  // Traverse left subtree
        preorder(root.right); // Traverse right subtree

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);  // Traverse left subtree
        System.out.print(root.data + " "); // Visit root
        inorder(root.right); // Traverse right subtree

    }

// Postorder traversal: Left subTree -> Right subTree -> Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);  // Traverse left subtree
        postorder(root.right); // Traverse right subtree
        System.out.print(root.data + " "); // Visit root

    }

// Level order traversal: Visit nodes level by level
    // This function prints the nodes in level order
    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Level marker

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();

            if (currNode == null) {
                System.out.println(); // End of current level
                if (!queue.isEmpty()) {
                    queue.add(null); // Add marker for next level
                }
            } else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0; // Base case: if the node is null, return 0
        }
        int leftNodes = countOfNodes(root.left);  // Count nodes in left subtree
        int rightNodes = countOfNodes(root.right); // Count nodes in right subtree
        return leftNodes + rightNodes + 1; // Return total count (left + right + 1 for root)

    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0; // Base case: if the node is null, return 0
        }
        int leftSum = sumOfNodes(root.left);  // Sum of left subtree
        int rightSum = sumOfNodes(root.right); // Sum of right subtree

        return leftSum + rightSum + root.data; // Return total sum (left + right + root's value)

    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0; // Base case: if the node is null, height is 0

        }
        int leftHeight = heightOfTree(root.left);  // Height of left subtree
        int rightHeight = heightOfTree(root.right); // Height of right subtree
        return Math.max(leftHeight, rightHeight) + 1; // Return max height of subtrees + 1 for root

    }

    //Diameter of a binary tree is the length of the longest path between any two nodes in the tree.
    // This path may or may not pass through the root. and  [ time complexity : O(n^2) ]
    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0; // Base case: if the node is null, diameter is 0

        }
        int leftHeight = heightOfTree(root.left);  // Height of left subtree
        int rightHeight = heightOfTree(root.right); // Height of right subtree
        int leftDiameter = diameterOfTree(root.left);  // Diameter of left subtree
        int rightDiameter = diameterOfTree(root.right); // Diameter of right subtree
        // Return the maximum of the left diameter, right diameter, and the sum of left and right heights + 1 for root
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));

    }

    // Optimized version of diameter calculation using height and diameter in a single traversal [ Time Complexity: O(n) ]
    static class TreeInfo {

        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameterOfTreeOptimized(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0); // Base case: height and diameter = 0
        }
        TreeInfo leftInfo = diameterOfTreeOptimized(root.left);  // Get info from left subtree
        TreeInfo rightInfo = diameterOfTreeOptimized(root.right); // Get info from right subtree
        int height = Math.max(leftInfo.height, rightInfo.height) + 1; // Height of the current node
        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter)); // Diameter of the current node
        return new TreeInfo(height, diameter); // Create a new TreeInfo object with height and diameter

    }

    

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data); // Output the root node's data
        // preorder(root); // Perform preorder traversal
        // inorder(root); // Perform inorder traversal
        // postorder(root); // Perform postorder traversal
        levelorder(root);
        System.out.println("Count of nodes: " + countOfNodes(root)); // Count total nodes in the tree
        System.out.println("Sum of nodes: " + sumOfNodes(root)); // Calculate and print the sum of all nodes
        System.out.println("Height of tree: " + heightOfTree(root)); // Calculate and print the height of the tree
        // System.out.println("Diameter of tree: " + diameterOfTree(root)); // Calculate and print the diameter of the tree
        TreeInfo result = diameterOfTreeOptimized(root);
        System.out.println("Optimized Diameter of the  tree: " + result.diameter);
    }
}
