public class Main {
    public static void main(String[] args) {
        String str= "   Java is a very popular language    ";
        String firstWord="";
        String lastWord="";
        int index=0;


        char ch=str.charAt(index);
        while(ch==' '){
            index+=1;
            ch=str.charAt(index);
        }

        // get first word
        while (ch!=' '){
            firstWord+=ch;  // firstWord=firstWord+ch;
            index+=1;
            ch=str.charAt(index);
        }

        index= str.length()-1;
        ch = str.charAt(index);
        while (ch==' '){
            index-=1;
            ch = str.charAt(index);
        }

        // get last word
        while (ch!=' '){
            lastWord= ch+lastWord;
            index-=1;
            ch=str.charAt(index);
        }


        String result= firstWord+" "+lastWord;
        System.out.println(result);
    }
}