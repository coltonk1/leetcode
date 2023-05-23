package Completed;
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.

// Medium

class Question150 {
    public static void main(String[] args) {
        Solution150 s = new Solution150();
        String[] tokens = { "1", "2", "+", "3", "*" };
        int result = s.evalRPN(tokens);
        System.out.println(result);
    }
}

class Solution150 {
    public int evalRPN(String[] tokens) {
        while (tokens.length != 1) {
            boolean calculated = false;
            for (int i = 2; i < tokens.length; i++) {
                int tempNum = 0;
                switch (tokens[i]) {
                    case "+":
                        tempNum = Integer.parseInt(tokens[i - 2]) + Integer.parseInt(tokens[i - 1]);
                        tokens[i - 2] = tokens[i - 1] = tokens[i] = " ";
                        calculated = true;
                        break;
                    case "-":
                        tempNum = Integer.parseInt(tokens[i - 2]) - Integer.parseInt(tokens[i - 1]);
                        tokens[i - 2] = tokens[i - 1] = tokens[i] = " ";
                        calculated = true;
                        break;
                    case "*":
                        tempNum = Integer.parseInt(tokens[i - 2]) * Integer.parseInt(tokens[i - 1]);
                        tokens[i - 2] = tokens[i - 1] = tokens[i] = " ";
                        calculated = true;
                        break;
                    case "/":
                        tempNum = Integer.parseInt(tokens[i - 2]) / Integer.parseInt(tokens[i - 1]);
                        tokens[i - 2] = tokens[i - 1] = tokens[i] = " ";
                        calculated = true;
                        break;
                }
                if (calculated) {
                    String[] tempTokens = new String[tokens.length - 2];
                    int displace = 0;
                    for (int a = 0; a < tokens.length; a++) {
                        if (tokens[a] == " ") {
                            if (displace == 0) {
                                tempTokens[a] = Integer.toString(tempNum);
                                displace++;
                            } else {
                                displace++;
                                if (displace == 3)
                                    displace = 2;
                            }
                            continue;
                        }
                        tempTokens[a - displace] = tokens[a];
                    }
                    tokens = tempTokens;
                    break;
                }
            }
        }
        return Integer.parseInt(tokens[0]);
    }
}