import java.util.*;
public class CSVAnalyzer {
    public static String[][] parseCSV(String data) {
        List<String[]> rows=new ArrayList<>();
        int start=0;List<String> row=new ArrayList<>();
        for(int i=0;i<data.length();i++) {
            char c=data.charAt(i);
            if(c==','||c=='\n') {
                row.add(data.substring(start,i).trim());
                start=i+1;
                if(c=='\n') {rows.add(row.toArray(new String[0]));row.clear();}
            }
        }
        row.add(data.substring(start).trim());
        rows.add(row.toArray(new String[0]));
        return rows.toArray(new String[0][0]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        while(sc.hasNextLine()) {
            String line=sc.nextLine();
            if(line.isEmpty()) break;
            sb.append(line).append("\n");
        }
        String[][] data=parseCSV(sb.toString());
        for(String[] r:data) {
            for(String f:r) System.out.print(f+" | ");
            System.out.println();
        }
    }
}