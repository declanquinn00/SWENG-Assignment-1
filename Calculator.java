import java.util.*;
public class Calculator {
    
    Stack<Character> opStack;
    Stack<Integer> valStack;
    ArrayList<String> array;

    // Constructor create two stacks
    public Calculator(){
        Stack<Character> opStack = new Stack<>();
        Stack<Integer> valStack = new Stack<>();
        ArrayList<String> array = new ArrayList<String>();
        this.array = array;
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

    // Convert string to arrayList
    public void toArray(String input){
        String tmp = "";
        for(int i = 0; i <= input.length()-1; i++){
            if(isOperator(input.charAt(i))){
                tmp += input.charAt(i);
                array.add(tmp);
                tmp = "";
            }
            else{
                while(!isOperator(input.charAt(i))){
                    tmp += input.charAt(i);
                    i++;
                }
                array.add(tmp);
                tmp = "";
            }
        }
    }

    // Checks if passed String is a boolean
    public Boolean isOperator(String op){
        if(op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-") || op.equalsIgnoreCase("X") || op.equalsIgnoreCase("/")){
            return true;
        }
        else return false;
    }

    // Checks if passed char is a boolean
    public Boolean isOperator(char op){
        if(op == '+' || op == '-' || op == 'X' || op == '/'){
            return true;
        }
        else return false;
    }

    public void pushToStacks(Character op){
        try{
        // Check if operator
        if(op == '+' || op == '-' || op == 'X' || op == '/'){
            opStack.push(op);
        }
        // Else push to valStack
        else{
            //valStack.push(op);
        }
        } catch (java.lang.Exception e){System.out.println("Error: Unable to push to satck");}
    }

    // Evaluates postfix expression
    public Integer evaluatePostfix(String postfix){
        toArray(postfix);
        int result;
        int operand1;
        int operand2;

        for(int i=0; i<=array.size(); i++){
            String value = array.get(i);
            if(!isOperator(value)){
                int dvalue = Integer.parseInt(value);
                valStack.push(dvalue);
            }
            if(isOperator(value)){
                switch(value){
                    case "+":
                        operand2 = valStack.pop();
                        operand1 = valStack.pop();
                        result = operand1 + operand2;
                        valStack.push(result);
                        break;
                    case "-":
                        operand2 = valStack.pop();
                        operand1 = valStack.pop();
                        result = operand1 - operand2;
                        valStack.push(result);
                        break;

                    case "X":
                        operand2 = valStack.pop();
                        operand1 = valStack.pop();
                        result = operand1 * operand2;
                        valStack.push(result);
                        break;

                    case "/":
                        operand2 = valStack.pop();
                        operand1 = valStack.pop();
                        result = operand1 / operand2;
                        valStack.push(result);
                        break;
                    default:
                        System.out.println("Invalid operator recieved");
                }
            }
        }

        return valStack.pop();
    }
}
