package filearray;

public class Main {
    public static void main(String[] args) {
         String filePath = "/Users/Trangphan/IdeaProjects/Chap11/src/filearray/Numbers.dat";
         int [] number = {45,56,67,78};
        FileArray.writeArray(filePath,number);
        FileArray.readArray(filePath,number);


    }
}
