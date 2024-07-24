import java.util.*;

public class App {
        boolean solution(String s) {
            int sNum = 0, yNum = 0;
            
            for (char c : s.toCharArray()){
                if(c == 'p'||c=='P'){
                    sNum++;
                } else if(c == 'y'||c=='Y'){
                    yNum++;
                }
            }
    
            return sNum==yNum;
        }

    public static void main(String[] args) throws Exception {
        String str = "pPoooyY";
        App ap = new App();

        System.out.println(ap.solution(str));
    }
}
