class Solution {
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