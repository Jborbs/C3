import java.util.*;
public class Spaghetti {
    public static void main(String[] args) {
        String tHiS_i5_A_sTRnG_tHAt_wE_wILL_be_printing_out ="hello world!";
        char tHiS_i5_A_e = 'h';
        char tHiS_i5_A_H_zz = 'e';
        char tHiS_iS_A_H_z = 'l';
        char tHIS_iz_A_H_z = 'l';
        char THiS_iss_A_H_z = 'o';
        char tHiS_is_A_H_z = 'w';
        char THIS_is_A_H_z = 'o';
        char tHiS_es_A_H_z = 'r';
        char tHiS_s_A_H_z = 'l';
        char tHiS__A__z = 'd';
        char HiS_i5_A_Hz = '!';
        char thiS_is_a_comma= ' ';
        char [] strin = new char[]{tHiS_i5_A_e,tHiS_i5_A_H_zz,tHiS_iS_A_H_z,tHIS_iz_A_H_z,THiS_iss_A_H_z,tHiS_is_A_H_z,THIS_is_A_H_z,tHiS_es_A_H_z,tHiS_s_A_H_z,tHiS__A__z,HiS_i5_A_Hz,thiS_is_a_comma};
        ArrayList<Character> list = new ArrayList<Character>();
        for(char c : strin){
            list.add(c);
        }
        String s = "";
        long start = System.currentTimeMillis();
        long end = start + 5*1000;
        do{
            Collections.shuffle(list);
            s = toString(list);
            System.out.println(s);

        }while(!s.equals(tHiS_i5_A_sTRnG_tHAt_wE_wILL_be_printing_out) && System.currentTimeMillis() < end);
        System.out.println(tHiS_i5_A_sTRnG_tHAt_wE_wILL_be_printing_out);
    }
    public static String toString(ArrayList<Character> ca){
        StringBuilder sb = new StringBuilder();
        for(char c : ca){
            sb.append(c);
        }

        return sb.toString();
    }
    

}