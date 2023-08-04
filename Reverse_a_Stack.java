class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        Queue<Integer> q = new LinkedList<>();
       while(!s.isEmpty())
       {
           q.add(s.pop());
       }
       while(!q.isEmpty())
       {
           s.push(q.remove());
       }
    }
}
