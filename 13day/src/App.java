import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {
    public static class TreeNode {
        int val;        // 노드 값 저장 변수
        TreeNode left;      // 왼쪽 자식
        TreeNode right;     // 오른쪽 자식
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
            }
        }
        
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {       // 현재 루트 값(root.val)보다 작은 경우
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public List<Integer> treeToArray(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        App ap = new App();
        
        // 트리 생성
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // 찾을 값 설정
        int val = 5;

        TreeNode result = ap.searchBST(root, val);
        
        // 결과 출력
        List<Integer> array = ap.treeToArray(result);
        System.out.println(array);
    }
}
