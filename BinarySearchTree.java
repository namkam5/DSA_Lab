// Methods

/*

1. insertInOrder
2. size
3. find
4. set left child
5. set right child


*/

public class TreeNode{
    public int data;
    public TreeNode left,right,parent;
    private int size = 0;

    public TreeNode(int d){
        data = d;
        size = 1;
    }

    public void insertInOrder(int d){
        if(d <= this.data){
            if(left == null){
                setLeftChild(new TreeNode(d));
            }else{
                this.left.InsertInorder(d);
            }
        }else{
            if(right == null){
                setRightChild(new TreeNode(d));
            }else{
                right.insertInorder(d);
            }
        }
        size++;
    }

    public int size(){
        return this.size;
    }

    public TreeNode find(int d){
        if(d == this.data) return this;
        else if(d<=data){
            return left != null ? left.find(d) : null;
        }else if(d >data){
            return right != null ? right.find(d) : null;
        }
        return null;
    }

    public void setLeftChild(TreeNode left){
        this.left = left;
        if(this.left != null){
            this.left.parent = this;
        }
    }

    public void setRightChild(TreeNode right){
        this.right = right;
        if(this.right != null){
            this.right.parent = this;
        }
    }
}

