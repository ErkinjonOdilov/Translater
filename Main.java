package UZ.WAXA.translater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DictionaryImplService dictionaryImplService=new DictionaryImplService();
        while (true){
            System.out.println("1->Add word\n2->Add synonyms\n3->Translate\n4->List\n5->Edit translate\n6->Edit world\n7->Delete world\n8->Delete translate");
            int n=scanner.nextInt();
            switch (n){
                case 1->{dictionaryImplService.addWord();}
                case 2->{dictionaryImplService.addSynonyms();}
                case 3->{dictionaryImplService.translate();}
                case 4->{dictionaryImplService.list();}
                case 5->{dictionaryImplService.editTranslate();}
                case 6->{dictionaryImplService.editWord();}
                case 7->{dictionaryImplService.deleteWord();}
                case 8->{dictionaryImplService.deleteTranslate();}
            }
        }
    }
}
