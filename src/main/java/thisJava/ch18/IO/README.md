# IO

데이터를 외부에서 읽고 다시 외부로 출력하는 작업

- 자바에서 데이터는 스트림을 통해 입출력된다

## 입출력 스트림

스트림 클래스는 두 개로 구분

- 바이트 기반 : XXXInputStream, XXXOutputStream
- 문자 기반 : Reader, Writer

### InputStream

- 바이트 기반 입력 스트림 추상 클래스

  1)  read 메소드 :  1바이트를 읽고 4바이트 int 타입으로 리턴

  - int 4바이트 중에 가장 끝 1바이트에만 데이터가 들어가 있다.\
  - 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴

  ```java
  InputStream is = new FileInputStream("C:/test.jsp");
  int readByte;
  while((readByte == is.read() != -1 )){ ... }
  ```

  2)  read(byte []) 메소드 : 매개값이 주어진 바이트 배열 길이만큼 바이트를 읽고 배열에 저장한다.

  - 바이트 길이가 3이면 3바이트 단위로만 읽는다

  ```java
  InputStream = new FileInputStream("C:/test.jpg");
  int readByteNo;
  byte[] readBytes = new Byte[100];
  while ((readByteNo = is.read(readBytes)) != -1 ){ ... }
  ```

  3) read(byte[] b, int off, int len) 메소드 : 입력 스트림으로부터 off에서 len개까지 저장한다

  4) close()  메소드 : 사용한 InputStream 더 이상 사용하지 않을 경우 close 메소드를 호출한다

### OuputStream

- 바이트 기반 출력 스트림 추상 클래스

  1) write (int b) 메소드 : 매개 변수로 주어진 int 값에서 끝에 있는 1바이트만  출력 스트림으로 보낸다.

  ```java
  OutputStream os = new FileOutputStream("C:/test.txt");
  byte[] data = "ABC".getBytes();
  for(int i = 0; i < data.length; i ++){
    os.write(data[i]);
  }
  ```

  2) write(byte[] b) 메소드 : 주어진 바이트 배열 b의 바이트를 내보낸다

  ```java
  OutputStream os = new FileOutputStream("C:/test.txt")
  byte[] data = "ABC".getBytes();
  os.write(data);
  ```

  3) wrtie(byte[] b, int off, int len) 메소드 : off에서 len개 바이트를 내보낸다

  4) flush 메소드 : 버퍼에 잔류하고 있는 모든 데이터를 출력 시킨다

### Reader

- 문자 기반 스트림의 최상위 추상클래스, 문자 기반 스트림은 이 클래스를 상속받아 처리한다

  1) read() : 한개의 문자를 읽고 리턴

  - 한 개의 문자(2바이트)를 읽고 4바이트 int를 리턴

  - 끝 2byte만 사용

    ```java
    Reader reader = new FileReader("C:/test.txt");
    int readDate;
    while((readDate = reader.read()) != -1 ){
        char charDate = (char) readData;
    }
    ```

    

  2) read(char[] cbuf) : 읽은 문자를 문자배열 인자 배열길이만큼 저장, 읽은 갯수를 리턴

  - read() 메소드는 100개의 문자가 들어오면 100번 루프를 돌아야함으로 좋지 않다.

- read(char[] cbuf, int off, int len) : off부터 len까지 저장



### Writer

- 문자 기반 출력 스트림의 최상 추상클래스

  1) write(int c) : int 값에서 끝에 있는 2바이트만 출력 스트림으로 보낸다.

  ```java
  Writer writer = new FileWriter("C:/test.txt");
  char[] data = "홍길동".toCharArray();
  for(int i=0; i<data.length; i++){
    writer.write(data[i]); // 홍, 길, 동 
  }
  ```

  2) write(char[] cbuf) : 매개값으로 주어진 char[] 배열의 모든 문자를 출력 스트림으로 보낸다

  ```java
  char[] data = "홍길동"toCharArray();
  write.write(data);
  ```

  3) write(char[] c, int off, int len) 메소드

  c[off]부터 len개의 문자를 출력스트림으로 보낸다

  4) write(String str), write(String str, int off, int len)

  문자열을 쉽게 전달하기 위해 String을 stream을 통해 출력한다

### 콘솔 입출력

- 시스템을 사용하기 위해 키보드로 입력받고 화면으로 출력하는 소프트웨어
- 키보드로 입력 받을 시 System.in  / 화면에 출력 시 System.out / 시스템 에러발생시 System.err

#### System.in 필드

- System.in은 InputStream 타입 

  ```java
  InputStream is = System.in
  ```

- 바이트에는 십진수 아스키코드가 들어있다

  ```java
  int asciiCode = is.Read()
  ```

  read메소드로 읽은 아스키코드를 Char타입으로 변환하면 확인 가능하다

- read() 메소드는 1바이트라 한글을 읽을 수 없다. 우선 read(byte[] b)를 통해 입력받아서 처리하면 된다.

- 대신 읽은 바이트 수 - 2를 해줘야한다(Enter키에 해당하는 것 제외)

#### System.out 필드

- PrinStream 타입 필드

  ```java
  OutputStream os = System.out;
  ```

- 한글을 출력하기 위해 한글을 바이트 배열로 얻은 후 write 메소드를 통해 출력하면 된다

### Console 클래스

- 자바 6부터 콘솔로 문자을 쉽게 받기 위해 클래스를 제공한다
- 반드시 프롬프트에서 실행해야한다
- readLine, readPassword 등을 제공한다



### Scanner

- 콘솔로는 문자열을 읽을 수 있지만 정수, 실수를 받을 수 없으므로 Scanner를 통해 입력받는다

  ```java
  Scanner scanner = new Scanner(System.in);
  ```



## 파일 입출력

- 파일의 크기, 파일 속성, 파일 이름 등의 정보를 얻어내는 기능과 파일 생성 및 파일 삭제 기능제공

- 윈도우는 / 또는 \를 사용할 수 있고 유닉스,리눅스에서는 /를 사용한다(File.separator 상수를 출력해보면 확인가능)

- 만약 \를 디렉토리 구분자로 사용한다면 이스케이스(\\\\)로 기술

- 실제 파일이나 디렉토리 있는지 여부는 exists로 확인

  - exist = false

    | 리턴타입 | 메소드        | 설명                           |
    | -------- | ------------- | ------------------------------ |
    | boolean  | createNewFile | 새로운 파일을 생성             |
    | boolean  | mkdir         | 새로운 디렉토리 생성           |
    | boolean  | mkdirs        | 경로에 없는 모든 디렉토리 생성 |
    | boolean  | delete        | 파일 또는 디렉토리삭제         |

  - exist = true

    - 메소드 종류가 많아서 생략 [링크](http://blog.naver.com/PostView.nhn?blogId=saseo90&logNo=221267786511&redirect=Dlog&widgetTypeCall=true&directAccess=false)