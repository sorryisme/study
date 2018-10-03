drop table board;

create table board(
	board_no int primary key,
	subject varchar2(30) not null,
	writer varchar2(20) not null,
	content varchar2(50) not null,
	board_date date not null
); 


--������ ����� ���� ���� �ο�(system���������� ����)
grant  create sequence  to scott;

drop sequence board_seq;
  
--������ �����
create sequence board_seq nocache; 


select * from board;

commit

insert into board (board_no, subject, writer, content, board_date) 
values (board_seq.nextval, 'db����', '������', '�볭��', sysdate)

insert into board (board_no, subject, writer, content, board_date) 
values (board_seq.nextval, 'db����', '������', '�ȳ�', sysdate)




