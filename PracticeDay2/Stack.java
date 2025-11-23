import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] myStack = new int[3];
        int top=-1;
        System.out.println("Choose the option: ");
        boolean flag = false;
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. print");
        System.out.println("5. Exit");
        while(!flag){
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Enter the element to be pushed: ");
                    int dataToBePushed = sc.nextInt();
                    if(top < myStack.length-1){// -1<2 | 0<2 | 1<2 | 2<2
                        top++;//top = 0,1,2
                        push(dataToBePushed, myStack, top);//(1,stack,0)(2,stack,1)(3,stack,2)
                    }
                    else{
                        System.out.println("Overflow");
                    }
                    System.out.println("value of top: " + top);
                    break;

                    case 2:
                        System.out.println("Enter the element to be popped: ");
                        if(top==-1){
                            System.out.println("Underflow");
                        }
                        else{//top=2,1,0,-1
                            int value;
                            value = pop(myStack, top);//satck,2 | stack,1 | stack,0 | stack,-1
                            top--;//top = 1 | 0 | -1 | -2
                            System.out.println("value popped: " + value);
                        }
                        break;

                        case  3:
                            int value;
                            value  = peek(myStack, top);
                            System.out.println("value peeked: " + value);
                            break;

                            case  4:
                                printStack(myStack);
                                break;

                                case 5:
                                    flag = true;
                                    break;

                default:
                        System.out.println("Invalid input");
            }
        }

    }

    public static void push(int data, int[] stack, int top/*(1,stack,0)|(2,stack,1)|(3,stack,2)*/){
            stack[top] = data;//stack[0] = data | stack[1] = data | stack[2] = data
    }

    public static int pop(int[] stack, int top){//stack,2 | stack,1 | stack,0 | stack,-1
        if(top<=-1) {//2<=-1?=no | 1<=-1?=no | 0<=-1?=no | -1<=-1?=yes
            System.out.println("stack underflow");
            return -1;
        }
        int result = stack[top];
        stack[top] = 0;
        return result;//return stack[2] | return stack[1] | return stack[0]

    }

    public static int peek(int[] stack, int top){
        if(top<=-1) {
            return -1;
        }
        return stack[top];
    }

    public static void printStack(int[] stack){
        for(int i: stack){
            System.out.print(i + " ");
        }
    }
}
