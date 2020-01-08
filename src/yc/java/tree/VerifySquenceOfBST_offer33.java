package yc.java.tree;

/**
 * @program: Algorithm-Practices
 * @description: 二叉搜索树的后续遍历序列
 * @author: yc
 * @create: 2019-11-29 17:51
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 假设输入的数组的任意两个数字都互不相同。
 *
 * 例如，下图是后序遍历序列 1,3,2 所对应的二叉搜索树。
 *
 * 后序遍历(左右根)
 * 二叉搜索树: 左节点值 < root节点值 < 右节点值
 **/


public class VerifySquenceOfBST_offer33 {
    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }

    private static boolean verify(int[] sequence, int first, int last) {
        //序列只有一个元素
        if (last - first <= 1)
            return true;
        //根节点是序列最后一个元素
        int rootVal = sequence[last];
        //cutIndex用来分割左子树和右子树
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal)
            cutIndex++;
        //验证右子树所有节点是否都大于root节点值
        for (int i = cutIndex; i < last; i++) {
            if (sequence[i] < rootVal)
                return false;
        }
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        System.out.println(VerifySquenceOfBST(sequence));
    }
}
