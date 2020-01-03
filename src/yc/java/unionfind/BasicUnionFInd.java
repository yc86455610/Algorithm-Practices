package yc.java.unionfind;

import java.util.Scanner;

/**
 * @program: algorithm-practices
 * @description: 简单的并查集  quick-find 算法
 * @author: yc
 * @create: 2020-01-01 23:12
 **/


public class BasicUnionFInd {
    private int count; //连通分量数目
    private int[] id; //每个数所属的连通分量

    public BasicUnionFInd(int N) {
        count = N;  //初始联通分量为元素个数，即互不连通
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    //返回联通分量数目
    public int getCount() {
        return this.count;
    }

    //查找x所属的连通分量
    public int find(int x) {
        return id[x];
    }

    //将两个点进行合并
    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        for (int i = 0; i < id.length; i++) {
            if (find(i) == pId) {
                id[i] = qId;
            }
        }
        count--;  //两点联通，连通分量减1
    }

    //判断两个点是否联通
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the count of total numbers: ");
        int N = sc.nextInt();
        BasicUnionFInd buf = new BasicUnionFInd(N);
        System.out.println("please input pairs, input exit to end");
        while (sc.hasNext()) {
            String pair = sc.next();
            if (pair.equals("exit"))
                break;
            int p = Integer.parseInt(pair.split("-")[0]);
            int q = Integer.parseInt(pair.split("-")[1]);
            if (buf.isConnected(p, q))
                continue;
            buf.union(p, q);
        }

        System.out.println("total connected components is: " + buf.getCount());
    }

}
