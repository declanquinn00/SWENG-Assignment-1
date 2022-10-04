import java.util.*;
public class Calculator {
    
    Stack<Character> opStack;
    Stack<Character> valStack;

    // Constructor create two stacks
    public Calculator(){
        Stack<Character> opStack = new Stack<>();
        Stack<Character> valStack = new Stack<>();
        this.opStack = opStack;
        this.valStack = valStack;
    }
    public String equate(String input){
        // read string
        for(int i = 0; i <= input.length()-1; i++){
            char val = input.charAt(i);
            pushToStacks(val);
        }
        // 
        return input; // RETURN A STRING REPRESENTATION OF ANSWER

    }

    public void pushToStacks(Character op){
        try{
        // Check if operatoe
        if(op == '+' || op == '-' || op == 'X' || op == '/'){
            opStack.push(op);
        }
        // Else push to valStack
        else{
            valStack.push(op);
        }
        } catch (java.lang.Exception e){System.out.println("Error: Unable to push to satck");}
    }
}
