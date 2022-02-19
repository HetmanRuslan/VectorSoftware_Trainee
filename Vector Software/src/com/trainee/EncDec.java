package com.trainee;

public class EncDec {
    static public String Encoded(String str, int key){
        char[] plain = str.toCharArray();
        char[][] cipher=new char[key][plain.length];


        for(int i=0;i<key;i++)
            for(int j=0;j<plain.length;j++)
                cipher[i][j]='#';

        int level=0;
        int flag=0;


        for(int i=0;i<plain.length;i++){
            cipher[level][i]=plain[i];


            if(flag==0){
                level++;


                if(level==key-1)
                    flag=1;
            }


            else{
                level--;


                if(level==0)
                    flag=0;
            }
        }

        String cipher_text="";



        for(int i=0;i<key;i++){
            for(int j=0;j<plain.length;j++){
                if(cipher[i][j]!='#')
                    cipher_text+=cipher[i][j];
            }
        }
        return cipher_text;
    }

    static public String Decoded(String str, int key) {

        char[] plain = str.toCharArray();
        char[][] cipher = new char[key][plain.length];


        for (int i = 0; i < key; i++)
            for (int j = 0; j < plain.length; j++)
                cipher[i][j] = '#';

        int level = 0;
        int flag = 0;
        int index = 0;


        for (int i = 0; i < plain.length; i++) {
            cipher[level][i] = '*';


            if (flag == 0) {
                level++;


                if (level == key - 1)
                    flag = 1;
            }


            else {
                level--;


                if (level == 0)
                    flag = 0;
            }
        }


        for (int i = 0; i < key; i++) {
            for (int j = 0; j < plain.length; j++) {
                if (cipher[i][j] == '*') {
                    cipher[i][j] = plain[index];
                    index++;
                }
            }
        }

        String cipher_text = "";
        level = 0;
        flag = 0;

        for (int i = 0; i < plain.length; i++) {
            if (cipher[level][i] != '#')
                cipher_text += cipher[level][i];
            if (flag == 0) {
                level++;
                if (level == key - 1)
                    flag = 1;
            } else {
                level--;
                if (level == 0)
                    flag = 0;
            }
        }
        return cipher_text;
    }
}
