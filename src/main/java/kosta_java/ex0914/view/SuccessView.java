package kosta_java.ex0914.view;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import kosta_java.ex0914.dto.Board;



public class SuccessView {

    public SuccessView() {
    }
    
    
    public static void printBoard(Map<String,Map<String,Board>> map) {
        
        Map<String, Board> archiveMap = null;
        Map<String, Board> photoMap = null;
        
        Set<String> keyset = map.keySet();
        Iterator<String> keys = keyset.iterator();
        
        while(keys.hasNext()) {
            String str = keys.next();
            if(str.equals("archive")) {
                archiveMap = map.get(str);
            } else if(str.equals("photo")) {
                photoMap = map.get(str);
            }
        }
        
        keyset = archiveMap.keySet();
        keys = keyset.iterator();
        System.out.println("--------------------------archive의 모든 게시물 -----------------------------");

        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println("key = "+ key + " | " + archiveMap.get(key));
        }
        
        
        System.out.println("--------------------------photo의 모든 게시물 -----------------------------");
        
        keyset = photoMap.keySet();
        keys = keyset.iterator();
        
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println("key = "+ key + " | " + photoMap.get(key));
        }

        
    }
    
    public static void printBoardByKind(Map<String,Board> map) {
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        
        while(iter.hasNext()) {
            System.out.println(map.get(iter.next()));
        }
    }
    
    public static void printBoardByNo(Board board) {
        System.out.println(board);
    }
    
    public static void printMessage(String msg) {
        System.out.println(msg);
    }
    
}

