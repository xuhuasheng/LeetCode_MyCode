
/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.08%)
 * Total Accepted:    44.5K
 * Total Submissions: 122.8K
 * Testcase Example:  '"()"'
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 
 * 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "()[]{}"
 * 输出: true
 * 
 * 
 * 示例 3:
 * 
 * 输入: "(]"
 * 输出: false
 * 
 * 
 * 示例 4:
 * 
 * 输入: "([)]"
 * 输出: false
 * 
 * 
 * 示例 5:
 * 
 * 输入: "{[]}"
 * 输出: true
 * 
 */

// { open brace 左花括号
// } close brace 右花括号
// [ open bracket 左方括号
// ] close bracket 右方括号
// ( open paren 左圆括号
// ) close paren 右圆括号
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        char[] strArray = s.toCharArray();
        if (strArray[0] == '}' || strArray[0] == ']' || strArray[0] == ')') {
            return false;
        }

        Stack<Character> st = new Stack<Character>();
        int len = strArray.length;
        for (int i = 0; i < len; i++) {

            if (strArray[i] == '{') {
                st.push('{');
            } else if (strArray[i] == '[') {
                st.push('[');
            } else if (strArray[i] == '(') {
                st.push('(');
            } else if (strArray[i] == ')' && st.peek() == '(') {
                st.pop();
            } else if(strArray[i] == ']' && st.peek() == '[') {
                st.pop();
            } else if(strArray[i] == '}' && st.peek() == '{') {
                st.pop();
            } else {
                return false;
            }

        }
        
        if(st.empty())
            return true;
        else 
            return false; 
    }
}
