class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
          Node ans=null;
          while(root!=null)
          {
              if(root.data >x.data)
              {
                  ans = root;
                  root= root.left;
              }
              
              else //(root.data <=x.data)
                  root=root.right;

          }
          return ans;
         }
}
