-- generate guestbook
CREATE TABLE guestbook (
    num number primary key ,
    name varchar2(20) not null ,
    password varchar2(20) not null ,
    message varchar2(1000) ,
    inputdata date default sysdate
);

-- generate sequence
create sequence guestbook_seq;

SELECT NAME, PASSWORD, MESSAGE, TO_CHAR(INPUTDATA,'YYYY-MM-DD') as inputdata
FROM GUESTBOOK
order by 4;