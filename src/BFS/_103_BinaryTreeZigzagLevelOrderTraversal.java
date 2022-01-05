// package bfs;
//
// import java.util.*;
//
// public class _103_BinaryTreeZigzagLevelOrderTraversal {
//
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> res = new ArrayList<>();
//         if (root == null)
//             return res;
//         Queue<TreeNode> q = new ArrayDeque<>();
//         q.add(root);
//
//         int zig = 0;
//
//         while (!q.isEmpty()) {
//
//             int size = q.size();
//
//             List<Integer> level = new ArrayList<>();
//
//             for (int i = 0; i < size; i++) {
//                 TreeNode cur = q.poll();
//                 level.add(cur.val);
//
//                 if (cur.left != null) {
//                     q.add(cur.left);
//                 }
//                 if (cur.right != null) {
//                     q.add(cur.right);
//                 }
//             } // end for
//
//             if (zig % 2 == 0) {
//                 Collections.reverse(level);
//             }
//             zig++;
//             res.add(level);
//
//         } // end while
//         return res;
//     }
// }
