import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			System.out.println(isBalanced(scan.next()));
        }
        scan.close();
    }

    static boolean isBalanced(String bracket) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < bracket.length(); i++) {
            char ch = bracket.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}



