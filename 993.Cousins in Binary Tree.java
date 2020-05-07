class Solution {
    int x;
    int y;
    int heightx = 0;
    int heighty = 0;
    TreeNode parentx = null;
    TreeNode parenty = null;
    boolean flagx = false;
    boolean flagy = false;
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        height(root, 0);
        if((heightx == heighty) && (parentx != parenty)) return true;
        return false;
    }
    
    public void height(TreeNode node, int height) {
        if(node == null) return;
        if((node.left!= null && node.left.val == x) || 
           (node.right!= null && node.right.val == x)) {
            parentx = node;
            heightx = 1+height;
            flagx = true;
        }
        if((node.left!=null && node.left.val == y) ||
           (node.right!=null && node.right.val == y)) {
            parenty = node;
            heighty = 1+height;
            flagy = true;
        }
        if(flagx == true && flagy == true)
            return;
        height(node.left, height+1);
        height(node.right, height+1);
    }
}
