package us.DavidDiaz;

public class Main {
//    private final static FileInput inFile = new FileInput("1-liners.txt");
//    private final static FileOutput outFile = new FileOutput("1-liners.txt");

    public static void main(String[] args) {

        FileInput indata = new FileInput("1-liners.txt");
        FileOutput outFile = new FileOutput("outCrypt.txt");
        String line;
        String newLine;
        char key = 'A';
        while ((line = indata.fileReadLine()) != null) {
            // add lines here
            char[] letters = line.toCharArray();
            for(int i = 0; i < letters.length; i++){
                    //Cypher
              //  letters[i] = (char)((int)letters[i]+5);
                //Encryption
                letters[i] =(char)((int)letters[i] ^ (int)key);
            }
            outFile.fileWrite(new String(letters));
        }

        indata.fileClose();
        outFile.fileClose();
        indata = new FileInput("outCrypt.txt");
        while((line = indata.fileReadLine()) != null){
            char letters[] = line.toCharArray();
            for(int i = 0; i < letters.length; i++){
                //
              //  letters[i] = (char)((int)letters[i]-5);
                //Encryption
               letters[i] = (char)((int)letters[i] ^ (int)key);
            }
            System.out.println(new String(letters));
        }
        indata.fileClose();

    }
}
