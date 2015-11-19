package careercup;
import java.util.Stack;
public class UnbalancedParathesis {

    static final char opening='{';
    static final char closing='}';

    public int countUnbalanced(String input){
        int unbalanced=0;
        char[] inputArr=input.toCharArray();
        Stack stack=new Stack();
        for(char i :inputArr){
            if(i==opening){
                stack.push(i);
            }
            else if(i==closing){
                if(stack.peek().toString().charAt(0)==opening){
                    stack.pop();
                }
                else {
                    unbalanced++;
                }
            }
        }
        return stack.size()+unbalanced;
    }

    public static void main(String[] args){
        UnbalancedParathesis obj = new UnbalancedParathesis();
        System.out.println(obj.countUnbalanced("{}{}{{{}}{{{{{}}"));
    }
}
