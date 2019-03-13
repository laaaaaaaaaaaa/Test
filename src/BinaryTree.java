import java.util.LinkedList;

public class BinaryTree {

    static class  BinaryTreeNode{
        BinaryTreeNode left ;
        BinaryTreeNode right ;
        int data;
        public  BinaryTreeNode(){
            left = null;
            right = null;
        }

        public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
    public  static void traverse(BinaryTreeNode root){
        if (root == null ){
            return;
        }
        LinkedList<BinaryTreeNode> list = new LinkedList<BinaryTreeNode>();
        list.add(root);
        BinaryTreeNode curNode = null;
        while (!list.isEmpty()){
           curNode = list.poll();
            System.out.print(curNode.data+" ");
            if (curNode.left!=null){

                list.add(curNode.left);
            }
            if (curNode.right!=null) {
                list.add(curNode.right);
            }
        }
        System.out.println();
    }
    public  static BinaryTreeNode reverse(BinaryTreeNode root){
        if (root == null ){
            return root;
        }
        if (root.left!=null){
            root.left = reverse(root.left);
        }
        if (root.right!=null){
            root.right = reverse(root.right);
        }
        BinaryTreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;

    }

    public static void main(String[] args) {
        BinaryTreeNode node7 = new BinaryTreeNode(null,null,9);
        BinaryTreeNode node6 =  new BinaryTreeNode(null,null,6);
        BinaryTreeNode node5 = new BinaryTreeNode(null,null,3);
        BinaryTreeNode node4 = new BinaryTreeNode(null,null,1);
        BinaryTreeNode node3 = new BinaryTreeNode(node6,node7,7);
        BinaryTreeNode node2 = new BinaryTreeNode(node4,node5,2);
        BinaryTreeNode node1 = new BinaryTreeNode(node2,node3,4);
        traverse(node1);
        node1 = reverse(node1);
        traverse(node1);

    }
}

