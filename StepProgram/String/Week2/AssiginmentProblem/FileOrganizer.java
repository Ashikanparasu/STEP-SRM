import java.util.*;
public class FileOrganizer {
    static String categorize(String ext) {
        if(ext.equals("txt")||ext.equals("doc")) return "Document";
        if(ext.equals("jpg")||ext.equals("png")) return "Image";
        if(ext.equals("mp3")||ext.equals("wav")) return "Audio";
        if(ext.equals("mp4")||ext.equals("avi")) return "Video";
        return "Unknown";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        System.out.printf("%-20s %-15s %-20s\n","Filename","Category","NewName");
        for(int i=0;i<n;i++) {
            String file=sc.nextLine();
            int dot=file.lastIndexOf('.');
            String name=file.substring(0,dot);
            String ext=file.substring(dot+1);
            String cat=categorize(ext);
            String newName=cat+"_"+(i+1)+"."+ext;
            System.out.printf("%-20s %-15s %-20s\n",file,cat,newName);
        }
    }
}