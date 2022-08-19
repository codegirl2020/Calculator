public class Model {
    private Viewer viewer;
    private String temp;
    private String leftValue;
    private String rightValue;
    private char action;
    private double negative_num;

    public Model(Viewer viewer){
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        rightValue = "";
        action = '@';
        negative_num = 0.0;
    }
    public void doAction(String command){
        if(command.equals("Clear_Memory")){
            temp = "";
            leftValue = "";
            rightValue = "";
            action = '@';
        }
        else if(command.equals("Percent")){
           double percent = Double.parseDouble(temp);
           double percent_value = percent / 100;
           temp = " " + percent_value;

        } else if (command.equals("Negative")){
          double negative_value = Double.parseDouble(temp);
          negative_num = negative_value * (-1.0);
          String negative_conversion = "" + negative_num;
          char q = negative_conversion.charAt(negative_conversion.length()-2);
          char w = negative_conversion.charAt(negative_conversion.length() -1);
          if((q == '.') && (w == '0')){
              String negativesubString = negative_conversion.substring(0,negative_conversion.length()-2);
              temp = negativesubString;
            } else {
              temp = " " + negative_num;
          }
        }
        else if(command.equals("Seven")){
            temp = temp + "7";
        } else if(command.equals("Eight")){
            temp = temp + "8";
        } else if(command.equals("Nine")){
            temp = temp + "9";
        }
        else if(command.equals("Four")){
            temp = temp + "4";
        }
        else if(command.equals("Five")){
            temp = temp + "5";
        }else if(command.equals("Six")){
            temp = temp + "6";
        }else if(command.equals("One")){
            temp = temp + "1";
        }else if(command.equals("Two")){
            temp = temp + "2";
        }else if(command.equals("Three")){
            temp = temp + "3";
        }else if(command.equals("Zero")){
            temp = temp + "0";
        } else if(command.equals("Coma")){
            temp = temp + ",";
        }
        else if(command.equals("Plus")){
            leftValue = temp;
            temp = "";
            action = '+';
            return;
        } else if(command.equals("Minus")){
            leftValue = temp;
            temp = "";
            action = '-';
            return;
        }else if(command.equals("Multiply")){
            leftValue = temp;
            temp = "";
            action = '*';
            return;
        } else if(command.equals("Divide")){
            leftValue = temp;
            temp = "";
            action = '/';
            return;
        }
        else if(command.equals("Equal")){
            rightValue = temp;
            double leftNumber = Double.parseDouble(leftValue);
            double rightNumber = Double.parseDouble(rightValue);
            double result = 0.0;
            switch(action){
                case '+':
                    result = leftNumber + rightNumber;
                    break;
                case '-':
                    result = leftNumber - rightNumber;
                    break;
                case '*':
                    result = leftNumber * rightNumber;
                    break;
                case '/':
                    result = leftNumber / rightNumber;
                    break;

            }
             String conversion = " " + result;
            char a = conversion.charAt(conversion.length()-2);
            char b = conversion.charAt(conversion.length()-1);
            if((a == '.') && (b == '0')){
            String subString = conversion.substring(0, conversion.length()-2);
            temp = subString;
            } else {
                temp = " " + result;
            }

            leftValue = rightValue;
        }
       viewer.update(temp);
    }
}
