   * [LeetCode以及剑指offer算法题练习](#leetcode以及剑指offer算法题练习)
      * [1、数组和矩阵](#1数组和矩阵)
      * [2、二分查找](#2二分查找)
      * [3、位运算](#3位运算)
      * [4、数学](#4数学)
      * [5、树](#5树)
      * [6、字符串](#6字符串)
      * [7、链表](#7链表)
      * [8、栈和队列](#8栈和队列)
      * [9、排序](#9排序)
      * [10、搜索](#10搜索)
      * [11、哈希表](#11哈希表)
      * [12、贪心思想](#12贪心思想)
      * [13、动态规划](#13动态规划)
      * [14、图](#14图)
      * [15、双指针](#15双指针)
      * [16、分治思想](#16分治思想)

# 剑指offer表格方便查找

| 题号  |          题目          |       思想       |                                                                 代码                                                                  |
| :---: | :--------------------: | :--------------: | :-----------------------------------------------------------------------------------------------------------------------------------: |
|  01   |   【二维数组的查找】   |    数组，查找    |                  [findDimArrays](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/FindDimArrays.java)                  |
|  02   |      【数组中重复的数字】      |  数组  |          [duplicate](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/DuplicateNum.java)          |
|  03   |  【构建乘积数组】  | 链表，递归，迭代 | [printListFromTailToHead ](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/ListNode/printListFromTailToHead.java) |
|  04   |     【替换空格】     |      二叉树      |  [reConstructBinaryTree](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/Tree/reConstructBinaryTree_offer7.java)  |
|  05   |  【正则表达式匹配】  |        栈        |       [TwoStackQueue](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/StackAndQueue/TestStack_offer9.java)        |
|  06   |      【表示数值的字符串】      |  二分查找  |          [minNumberInRotatedArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/binaryresearch/MinNumberInRotatedArray.java)          |
|  07   |      【字符流中第一个不重复的字符】      |  字符串，双指针  |          [replaceSpace](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  08   |      【从尾到头打印链表】      |  链表，递归，迭代，栈  |          [printListFromTailToHead](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/PrintListFromTailToHead.java)          |
|  09   |      【链表中环的入口节点】      |  链表，双指针  |          [EntryNodeOfLoop](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/EntryNodeOfLoop.java)          |
|  10   | 【删除链表中重复的节点】 |  递归，大数问题  |     [print1ToMaxOfNDigits](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/Arrays/print1ToMaxOfNDigits_offer17.java)      |
|  11   |      【重建二叉树】      |  字符串，双指针  |          [replaceSpace](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  12   |      【二叉树的下一个节点】      |  字符串，双指针  |          [replaceSpace](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  13   |      【对称的二叉树】      |  树，递归  |          [isSymmetricalTree](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/IsSymmetricalTree.java)          |
|  14   |      【按之字形顺序打印二叉树】      |  字符串，双指针  |          [replaceSpace](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  15   |      【把二叉树打印成多行】      |  字符串，双指针  |          [replaceSpace](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  16   |      【序列化二叉树】      |  二叉树，递归  |          [invertTree](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/String/replaceSpace_offer5.java)          |
|  17   |      【二叉搜索树的第k个节点】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  18   |      【数据流中的中位数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  19   |      【用两个栈实现队列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  20   |      【滑动窗口的最大值】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  21   |      【旋转数组的最小数字】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  22   |      【斐波那契数列】      |  动态规划  |          [fibonacci](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/Fibonacci.java)          |
|  23   |      【跳台阶】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  24   |      【变态跳台阶】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  25   |      【矩形覆盖】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  26   |      【二进制中1的个数】      |  位运算  |          [numberOf1](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/NumberOf1.java)          |
|  27   |      【数值的整数次方】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  28   |      【调整顺序使奇数在偶数前面】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  29   |      【链表中倒数第k个节点】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  30   |      【反转链表】      |  链表，递归，迭代  |          [reverseList](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/ReverseList.java)          |
|  31   |      【合并两个排序的链表】      |  链表，递归，迭代  |          [mergeListNode](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/MergeListNode.java)          |
|  32   |      【树的子结构】      |  树，递归  |          [hasSubtree](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/HasSubtree.java)          |
|  33   |      【二叉树的镜像】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  34   |      【顺时针打印矩阵】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  35   |      【包含min函数的栈】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  36   |      【栈的压入、弹出序列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  37   |      【从上往下打印二叉树】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  38   |      【二叉搜索树的后续遍历序列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  39   |      【二叉树中和为某一值的路径】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  40   |      【复杂链表的复制】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  41   |      【二叉搜索树与双向链表】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  42   |      【字符串的排列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  43   |      【数组中出现次数超过一半的数字】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  44   |      【最小的k个数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  45   |      【连续子数组的最大和】      |  贪心，动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/FindGreatestSumOfSubArray.java)          |
|  46   |      【整数中1出现的次数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  47   |      【把数组排成最小的树】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  48   |      【丑数】      |  动态规划  |          [getUglyNumber](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/GetUglyNumber.java)          |
|  49   |      【第一个只出现一次的字符位置】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  50   |      【数组中的逆序对】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  51   |      【两个链表的第一个公共节点】      |  链表，双指针  |          [findFirstCommonNode](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/FindFirstCommonNode.java)          |
|  52   |      【数字在排序数组中出现的次数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  53   |      【二叉树的深度】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  54   |      【平衡二叉树】      |  树，递归  |          [isBalanced](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/offer/IsBalancedTree.java)          |
|  55   |      【数组中之出现一次的数字】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  56   |      【和为S的连续正数序列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  57   |      【和为S的两个数字】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  58   |      【左旋转字符串】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  59   |      【翻转单词顺序列】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  60   |      【扑克牌顺子】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  61   |      【圆圈中最后剩下的数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  62   |      【求1+2++...+n】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  63   |      【不用加减乘除做加法】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  64   |      【把字符串转换成整数】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  65   |      【矩阵中的路径】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |
|  66   |      【机器人的运动范围】      |  动态规划  |          [findGreatestSumOfSubArray](https://github.com/ycFw/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/FindGreatestSumOfSubArray.java)          |













# LeetCode以及剑指offer算法题练习

分章节精选了LeetCode约200题，剑指offer70题，刷完两遍再去面试。。。

## 1、数组和矩阵
- 1、[数组中出现次数超过一半的数字](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Arrays/MoreThanHalfNum_offer39.java)
- 2、[把数组中的 0 移到末尾](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Arrays/moveZeroes_283.java)
- 3、[打印从1到最最大的n位数](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Arrays/print1ToMaxOfNDigits_offer17.java)
- 4、[调整顺序似奇数位于偶数前面，同时需要保证相对位置不变](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Arrays/reOrderArray_offer21.java)


## 2、二分查找




## 3、位运算


## 4、数学


## 5、树
- 1、[重建二叉树：根据前序和中序遍历输出后续遍历](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Tree/reConstructBinaryTree_offer7.java)


## 6、字符串


## 7、链表
- 1、[求链表中环的入口节点-快慢指针-两次循环](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/ListNode/EntryNodeOfLoop_offer23.java)
- 2、[求链表中倒数第k个节点-双指针-两次移动](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/ListNode/FindKthToTail.java)
- 3、[合并两个有序链表-递归+迭代](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/ListNode/Merge.java)
- 4、[从尾到头打印链表的值-递归+迭代+栈](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/ListNode/printListFromTailToHead.java)
- 5、[反转链表](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/ListNode/reverseList_206.java)


## 8、栈和队列


## 9、排序


## 10、搜索
- 1、[组成整数的最小平方数数量bfs](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Search/numSquares_279.java)
- 2、[二叉树遍历的bfs+dfs递归与非递归的四种方法](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Search/Traversal.java)
- 3、[查找最大的连通面积dfs](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/Search/maxAreaOfIsland_695.java)
- []()

## 11、哈希表


## 12、贪心思想
- 1、[礼物的最大价值](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/getMost_offer47.java)
- 2、[丑数](https://github.com/yc86455610/Algorithm-Practices/blob/master/src/yc/java/DynamicPlanning/GetUglyNumber_Solution_offer49.java)
- 3、

## 13、动态规划


## 14、图


## 15、双指针


## 16、分治思想
