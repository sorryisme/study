package ThePrincipleOfJava.ch8;

public class Test10 {
    public static void main(String[] args) throws MemoryException {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            System.out.println("에러 메세지: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하세요");
        } finally {
            deleteTempFiles();
        }
    }


static void startInstall() throws SpaceException, MemoryException{
    if(!enoughSpace()) 
        throw new SpaceException("설치할 공간이 부족합니다");
    if(!enoughMemory()) {
        throw new MemoryException("메모리가 부족합니다");
    }
}   

static void copyFiles() {}
static void deleteTempFiles() {}
static boolean enoughSpace() { return false;}
static boolean enoughMemory() { return true;}
}


class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}


class MemoryException extends Exception {
    MemoryException (String msg){
        super(msg);
    }
}
