public class Echos{
public static void main(String[] args){
//System.out.println(args[0]);
int sum = 0;
for(int i = 0; i < args.length; i++){
System.out.println(args[i]);
sum +=Integer.parseInt(args[i]);
}
System.out.println(sum);
}

}
//
