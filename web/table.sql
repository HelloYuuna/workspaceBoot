-- 추천 기능 테이블
create table web_recommend (
  boardnum number primary key ,
  cnt number default 0
);

insert into web_recommend (boardnum) values (1);

