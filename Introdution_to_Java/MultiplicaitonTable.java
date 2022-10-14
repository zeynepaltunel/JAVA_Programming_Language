public class MultiplicaitonTable {

    public static void main(String[] args){

        int num = 1;
        int i = 1;
        
        while(num!=11){

            while(i!=11){
                System.out.println(num + "X" + i + "=" + num*i);
                i++;
            }
            System.out.println("*******");
            i=1;
            num++;
        }
    }
}
