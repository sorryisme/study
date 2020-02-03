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

  

​   