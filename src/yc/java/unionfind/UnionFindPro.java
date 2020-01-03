package yc.java.unionfind;


import java.util.Scanner;

/**
 * @program: algorithm-practices
 * @description: 优化union暴力标记，引入抽象的树结构
 *
 * 思想是初始每个点都是一颗独立的树，每次连接是两棵树的合并，不断合并最终成为一棵大树
 * @author: yc
 * @create: 2020-01-01 23:39
 **/


public class UnionFindPro {
    private int count;
    private int[] id;

    public UnionFindPro(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    //返回连通分量数目
    public int getCount() {
        return this.count;
    }

    //查找x所属联通分量
    public int find(int x) {
        while (x != id[x])
            x = id[x];
        return x;
    }

    //合并
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        id[qId] = pId;
        count--;
    }

    //判断
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public static void main(String[] args) {
        System.out.println("please input the count of total numbers");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        UnionFindPro ufp = new UnionFindPro(N);
        System.out.println("please input pairs,input exit to end");
        while (input.hasNext()) {
            String pair = input.next();
            if (pair.equals("exit")) break;
            int p = Integer.parseInt(pair.split("-")[0]);
            int q = Integer.parseInt(pair.split("-")[1]);
            if (ufp.isConnected(p, q)) continue;
            ufp.union(p, q);
        }

        System.out.println("总的连通分量数是:" + ufp.getCount());

    }
}
