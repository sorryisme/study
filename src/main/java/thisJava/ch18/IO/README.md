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

### File InputStream

- 파일을 바이트 단위로 읽어 들일 때 사용하는 바이트 기반 입력 스트림이다.

  ```
  1. FileInputStream fis = new FileInputStream("C:/Temp/image.gif");
  
  2. File file = new File("C:/Temp/image.gif");
  FileInputStream fis = new FileInputStream(file);
  ```

- 사용 후 close 메소드를 호출해야함



### File OutputStream

- 바이트 단위로 데이터를 파일에 저장할 때 사용하는 바이트 기반 출력 스트림

  ```
  1. FileOutputStream fos = new FileOutputStream("C:/Temp/image.gif");
  
  2. File file = new File("C:/Temp/image.gif");
  FileOutputStream fos = new FileOutputStream(file);
  ```

- 파일이 이미 존재할 경우 파일을 덮어 쓰며 기존 파일 내용은 사라진다. 기존 파일 내용 끝에 추가할 경우 매개값 true를 추가해준다

- close 전에 flush를 호출해서 잔류한 데이터를 완전히 출력하도록 한다

  

### FileReader, FileWriter

- 문자 기반 스트림, 문자 단위로 읽기 때문에 텍스트가 아닌 **그림, 오디오, 비디오 등의 파일은 읽을 수 없다.** 

## 보조스트림

- 다른 스트림과 연결되어 여러가지 편리한 기능을 제공한다
- 보조 스트림은 다른 보조 스트림에 연결되어 스트림 체인을 구성 할 수 있다.



### 문자 변환 보조 스트림

- 소스 스트림이 바이트 기반 스트림(Input,Output, FileInput, FileOutput)이면서 입출력이 문자라면 Reader와 Writer로 변환해서 사용하는 것이 좋음
  - 문자 단위 입출력, 문자셋의 종류를 지정

### InputStreamReader,OutputStreamReader

- 바이트 입력 스트림에 연결되어 문자 입력 스트림으로 변환

  ```
  1. InputStream is = System.in;
  Reader reader = new InputerStreamReader(is);
  
  2. FileInputStream fis = new FileInputStream("C:/Temp/file.txt");
  Reader reader = new InputStreamReader(fis);
  ```

- OutputStreamReader 또한 동일하게 사용하면 됨



### 성능 향상 보조스트림

- 프로그램 실행 성능은 입출력이 가장 늦은 장치를 따라간다

- 프로그램이 입출력 소스와 직접 작업하지 않고 메모리 버퍼와 작업함으로써 실행 성능을 향상 시키게 된다.
- 버퍼는 데이터 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 한꺼번에 디스크로 보냄으로써 출력횟수를 줄여준다.

### BufferedInputStream, BufferedReader

- 보조 스트림은 8192 내부 버퍼 사이즈를 가지게된다
- BufferedReader는 ReaderLine이 있는데 Enter키 입력전까지 받아 올 수 있다.

### DataInputStream, DataOutputStream

- 바이트 스트림은 바이트 단위 입출력이기 때문에 기본 데이터 타입을 입출력이 가능한 Data스트림을 사용한다

### 객체 입출력 보조 스트림

- 자바는 메모리에 생성된 객체를 파일 또는 네트워크로 출력할 수 있음

  - 객체는 문자가 아님, 바이트 기반 스트림 출력
  - 객체의 데이터를 연속적인 바이트로 변경해야함 이를 객체 직렬화
  - 반대로 입력 스트림부터 읽어들인 연속적인 바이트를 객체로 복원하는 것을 역직렬화

  ```
  ObjectInputStream ois = new ObjectInputStream(바이트 입력 스트림);
  ObjectOutputSTream oos = new ObjectOutputStream(바이트 입출력 스트림);
  ```

  - ObjectOutputStrem을 객체로 직렬화 하기 위해서 writeObject() 메소드 사용
  - 반대로 역직렬화하기 위해서 다음과 같이 처리

  ```
  객체타입 변수 = (객체타입) obj.readObject();
  ```



### 직렬화가 가능한 클래스

- 자바는 Serializable 인터페이스 구현한 클래스만 직렬화할 수 있도록 제한

```
public class implements Serializable {}
```

- static, transient가 붙은 경우 직렬화되지 않는다



#### serialVersionUID

- 직렬화 된 객체를 역직렬화 할 때 같은 클래스 사용
- 클래스 내용이 변경되면 역직렬화 실패
- 불가피하게 클래스 수정이 필요하면 클래스 작성시 serialVersionUID를 선언해야한다
- /bin/serialver.exe로 serialVersionUID를 생성해준다

#### 부모 자식 직렬화

- 부모클래스가 Serializable일 경우 자식 클래스를 직렬화하면 둘 다 직렬화 된다.

- 자식은 Serializable이고 부모는 구현하지 않았을 경우 부모는 직렬화하지 않는다

- 해결방법은 두 가지

  - 부모 클래스가 Serializable를 구현
  - 자식클래스에서 writeOjbect와 readObject 메소드를 선언해 부모 객체를 직접 출력
  - 접근 제한자가 private가 아니면 자동 호출되지 않기 때문에 반드시 private 접근자 작성

  

# 네트워크


### IP 주소얻기

- IP를 InetAdres객체로 표현

- 로컬 컴퓨터의 InetAddress를 얻고 싶다면 다음과 같이 호출

  ```
  InetAddress ia = InetAddress.getLocalHost();
  ```

- 외부 컴퓨터의 도메인 이름을 알고 있다면 객체를 얻을 수 있음

  ```
  InetAddress ia = InetAddress.getByName(String host);
  InetAddress[] iaArr = InetAddress.getAllByName(String host);
  ```

  - InetAddress 객체에서 IP주소를 얻기 위해서 getHostAddress() 메소드를 호출하면 된다.



### TCP 네트워킹

- Transmission Control Protocol : 연결지향적 프로토콜
- 클라이언트 연결 요청, 연결 수락, 통신 선로 고정, 데이터 교환 순으로 진행됨

### ServerSocket, Socket

- 연결 요청과 연결 수락을 담당
- 클라이언트 연결 요청을 기다리면서 연결 수락을 담당하는 것이 ServerScoket 클래스
- 연결된 클라이언트와 통신을 담당하는것이 Socket 클래스

### ServerSocket 생성과 연결수락

 - ServerSocket 객체를 얻는 방법

   ```
   1. ServerSocket serverSocket = new ServerSocket(5001);
   
   2. ServerSocket serverSocket = new ServerSocket();
   serverSocket.bind(new InetSocketAddress(5001));
   ```

   - 만약 머특정 IP로 작성하고 싶다면 포트 앞에 아이피를 인자로 하나 더 넘겨주면 된다.
     - ex:) new InetSocketAddress("192.xxx.xx.xxx, 5001);

- 클라이언트 연결수락을 위해서 accept 실행

- 연결된 클라이언트의 IP와 포트 정보를 알고 싶다면 Socket.getRemoteSocketAddress() 메소드 호출

  ```
  InetSocketAddress socketAddress = (InetScoketAddress) socket.getRemoteSocketAddress();
  ```

- 더 이상 연결 수락이 필요없으면 ServerScoket의 close 메소드를 호출할 것





