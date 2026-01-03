import java.util.Arrays;
import java.util.Comparator;

public class maxchainPairs {
    public static void main(String[] args) {
        int paris[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(paris,Comparator.comparingDouble(o->o[1]));
        int chainlen=1;
        int chainEnd=paris[0][1];//last selected pair end

        for(int i=1;i<paris.length;i++){
            if(paris[i][0]>chainEnd){
                chainlen++;
                chainEnd=paris[i][1];
            }
        }
        System.out.println("max lenght of chain ="+chainlen);
    }
}
