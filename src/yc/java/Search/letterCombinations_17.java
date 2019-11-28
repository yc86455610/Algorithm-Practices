package yc.java.Search;

/**
 * @program: Algorithm-Practices
 * @description: 数字键盘组合
 * @author: yc
 * @create: 2019-11-28 19:56
 **/

/**
 * Backtracking（回溯）属于 DFS。
 * 1、普通 DFS 主要用在 可达性问题 ，这种问题只需要执行到特点的位置然后返回即可。
 * 2、而 Backtracking 主要用于求解 排列组合 问题，
 * 例如有 { 'a','b','c' } 三个字符，求解所有由这三个字符排列得到的字符串，
 * 这种问题在执行到特定的位置返回之后还会继续执行求解过程。
 *
 * 因为 Backtracking 不是立即返回，而要继续求解，因此在程序实现时，需要注意对元素的标记问题：
 * 1、在访问一个新元素进入新的递归调用时，需要将新元素标记为已经访问，这样才能在继续递归调用时不用重复访问该元素；
 * 2、但是在递归返回时，需要将元素标记为未访问，因为只需要保证在一个递归链中不同时访问一个元素，可以访问已经访问过但是不在当前递归链中的元素。
 * */
public class letterCombinations_17 {
}
