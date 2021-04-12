
    import java.util.*;
    class Nodde{
        Nodde left,right;
        int data;
        Nodde(int data){
            this.data=data;
            left=right=null;
        }
    }
    class BinartreeDay22{
        public static int max(int f,int s){
            if(f>s) return f;
            else    return s;
        }
    	public static int getHeight(Nodde root){
            if(root == null)    return 0;
            if(root.left == null && root.right == null)    return 0;
            return  1+max(getHeight(root.left), getHeight(root.right));
        }

        public static Nodde insert(Nodde root,int data){
            if(root==null){
                return new Nodde(data);
            }
            else{
                Nodde cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
    	 public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Nodde root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }
    }