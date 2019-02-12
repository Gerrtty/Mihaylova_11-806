import java.util.*;
import static java.lang.StrictMath.sqrt;

public class CosineSimilarity extends JaccardTextAnalyzer{
    public double analyze(TextProvider te1, TextProvider te2){
        String str1 = delete(te1.getText());
        String str2 = delete(te2.getText());
        List<String> str3 = tokenize(str1 + " " + str2);
        List<String> list1 = toList(str1);
        List<String> list2 = toList(str2);
        double[] arrayForList1 = tf(fr(str3, list1));
        double[] arrayForList2 = tf(fr(str3, list2));
        return cosineSimilarity(arrayForList1, arrayForList2);
    }

    public int[] fr(List<String> allWords, List<String> eq){
        int c;
        int[] mas = new int[allWords.size()];
        for (int i = 0; i < mas.length; i++){
            c = 0;
            for (int j = 0; j < eq.size(); j++) {
                if (allWords.get(i).equals(eq.get(j)) ){
                    c++;
                }
            }
            mas[i] = c;
        }
        return mas;
    }

    public List<String> toList(String s){
        String[] words = s.split(" ");
        List<String> l = new ArrayList<>();
        for (String word : words){
            l.add(word);
        }
        return l;
    }

    public double[] tf(int[] mass){
        double[] tfIfd = new double[mass.length];
        double root = 0;
        for (int i = 0; i < mass.length; i++){
            tfIfd[i] = mass[i] * mass[i];
            root = root + tfIfd[i];
        }
        root = Math.sqrt(root);
        for(int i = 0; i < mass.length; i++){
            tfIfd[i] = mass[i] / root;
        }
        return tfIfd;
    }

    public double cosineSimilarity(double[] m1, double[] m2){
        double coef = 0;
        for(int i = 0; i < m1.length; i++){
            coef = coef + (m1[i] * m2[i]);
        }
        return coef;
    }

    public String delete(String st){
        st = st.replace(",", "");
        return st;
    }
}
