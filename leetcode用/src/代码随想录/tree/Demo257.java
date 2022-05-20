package 代码随想录.tree;
//
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zal
 * @date 2022/4/25 17:25
 */
public class Demo257 {
    public static void main(String[] args) {

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<Integer> que = new LinkedList<>();
        traversal(root, que, res);
        return res;
    }

    private static void traversal(TreeNode root, List<Integer> paths, List<String> res) {
        paths.add(root.val);
        if (root.left==null&&root.right==null){
            //叶子结点加入到paths中
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (; i < paths.size()-1; i++) {
                sb.append(paths.get(i)).append("->");
            }
            sb.append(paths.get(i));
            res.add(sb.toString());
            return;
        }
        if (root.left!=null){
            traversal(root.left,paths,res);
            paths.remove(paths.size()-1);//回溯
        }
        if (root.right!=null){
            traversal(root.right,paths,res);
            paths.remove(paths.size()-1);
        }
    }
}
