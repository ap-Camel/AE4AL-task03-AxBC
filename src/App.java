import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int c, e;
        String temp;
        int hash = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) * (1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9);

        ArrayList<String> list = new ArrayList<String>();

        for(int i = 1; i < 10; i++) {

            for(int j = 1; j < 100; j++) {

                c = i * j;
                if(c < 999) {

                    for(int k = 1; k < 10; k++) {

                        e = c / k;
                        if(c % k == 0 && e < 100) {

                            temp = i + "" + j + "" + c + "" + e + "" + k;

                            int tempSum = 0;
                            int tempMultiply = 1;
                            for(int l = 0; l < temp.length(); l++) {

                                tempSum += Character.getNumericValue(temp.charAt(l));
                                tempMultiply *= Character.getNumericValue(temp.charAt(l));
                            }

                            if((tempSum * tempMultiply) == hash) {

                                temp = i + " " + j + " " + c + " " + k + " " + e;
                                list.add(temp);
                            }
                            
                        }
                    } 
                }
            }
        }

        for(String s : list) {

            System.out.println(s);
        }

    }
}
