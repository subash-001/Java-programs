class Node{
    Node right;
    Node left;
    int data;
    Node(int data){
        this.data= data;
        this.right= null;
        this.left= null;
    }
}
class BinaryTree{
    Node root ;
    BinaryTree(){
        root=null;
    }
 void insert(int data){
   root = insertrec(root, data);
    
}
Node insertrec(Node root, int data){
    if(root == null){
        root = new Node(data);
        return root;
    }
    if( data < root.data){
        root.left = insertrec(root.left, data);
    }
    else if(data> root.data){
        root.right = insertrec(root.right, data);
    }
    return root;
}
void inorder(){
    inorderrec(root);
}
void inorderrec(Node root){
    if(root!= null){
        inorderrec(root.left);
        System.out.println(root.data + " ");
        inorderrec(root.right);
    }
}

}
public class CreateTree{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Perform traversals
        System.out.print("Inorder traversal: ");
        tree.inorder();  // Outputs: 20 30 40 50 60 70 80
        //System.out.println();
    }
}