import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int N;
    //R 뒤집기 D 버리기 -> 바꿔서 생각하면 D는 뒤에버리기, R 이후 D는 앞에꺼버리기
    static ArrayList<String> answerList = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        N = Integer.parseInt(scan.nextLine());

        for(int i=0; i<N; i++){
            String order = scan.nextLine();
            int size = Integer.parseInt(scan.nextLine());
            String arrays = scan.nextLine();

            //[ ] 부분 제외
            answerList.add(checkOrder(order, arrays.substring(1, arrays.length()-1).split(","), size));
        }

        for(String s : answerList){
            System.out.println(s);
        }

    }

    public static String checkOrder(String order, String[] arrays, int size){
        int position  = 1;
        int start = 0;
        int end = size-1;

        for(int i=0; i<order.length(); i++){
            if(order.charAt(i) == 'D'){
                //정방향
                if(position > 0) start += 1;
                //역방향
                else end -= 1;
                size--;
            }
            else{
                position = position * (-1);
            }

            if(size < 0){
                return "error";
            }
        }
        return printArray(position, arrays, start, end, size);
    }

    public static String printArray(int position, String[] arrays, int start, int end, int size){
        StringBuilder s = new StringBuilder();
        s.append("[");

        if(position > 0){
            for(int i=start; i<end; i++){
                s.append(arrays[i]+",");
            }
        }
        else {
            for(int i=end; i>start; i--){
                s.append(arrays[i]+",");
            }
            end = start;
        }
        if(size > 0){
            s.append(arrays[end]);
        }
        s.append("]");
        return s.toString();
    }
}