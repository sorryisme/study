package java100_Problem;

public class Problem016 {
    public static void main(String[] args) {
        
        String sname="";
        sname +="Antony ";
        sname +="Sedas ";
        sname +=6+"th";
        
        System.out.println("01234567890123456789");
        System.out.println(sname);
        sname = sname.substring(2);
        System.out.println(sname);
        sname= sname.substring(2,5);
        System.out.println(sname);
        
        // 
        
        String sChange ="hyonny%love";
        System.out.print("5:main before");
        System.out.println(sChange);
        changeIn(sChange);
        System.out.print("6:main after");
        System.out.println(sChange);
        
        System.out.println(hasDelemeter('<'));
        }
    
    public static void changeIn(String str) {
        str = str.replace('o', 'z');
        str += "Hello";
        System.out.print(str);
    }
    
    public static boolean hasDelemeter(char c) {
        boolean hasD= false;
        if(",<>/%^&*+-=()".indexOf(c)!=-1) { // 입력된문자가 작성된 문자에 포함되어있다면 1(true)리턴 , -1 아니라면 true
            
            hasD=true;
        }
           return hasD;
    }
}
