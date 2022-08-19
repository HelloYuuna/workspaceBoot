-- 추천 기능 테이블
create table web_recommend (
  boardnum number primary key ,
  cnt number default 0
);

insert into web_recommend (boardnum) values (1);

select * from WEB_RECOMMEND;

-- 댓글 테이블
create table web_comment(
  num number primary key ,
  name varchar2(20) not null ,
  text varchar2(300) not null
);

-- 댓글 프라이머리키 생성
create sequence web_comment_seq;

select * from WEB_COMMENT;

-- ID중복확인용 유저테이블
CREATE TABLE web_member (
  memberid      varchar2(30) primary key ,
  membername    varchar2(20) not null
);
