-- spring5 테이블 구조

-- 테이블 생성 user info
DROP TABLE spring5_member;
CREATE TABLE spring5_member (
    memberid     varchar2(20)    constraint userid_PK primary key                                   -- 사용자 식별 ID, pk
    ,memberpw    varchar2(100)   constraint usrpw_NN not null                                      -- 사용자 비밀번호, nn (암호화하여 저장)
    ,membername  varchar2(20)    constraint usrname_NN not null                                     -- 사용자 이름
    ,email       varchar2(50)                                                                       -- 이메일
    ,phone       varchar2(30)                                                                      -- 전화번호
    ,address     varchar2(30)                                                                      -- 주소
    ,enabled     number(1)
                 default 1
                 constraint account_status_CK check ( enabled in ( 1, 0 ) )                        -- 계정 상태 CK
    ,rolename    varchar2(20)
                 default 'ROLE_USER'
                 constraint role_CK check ( rolename in ( 'ROLE_USER', 'ROLE_ADMIN' ) )             -- 역할 CK, default ROLE_USR
);

-- 데이터 삽입 user info
insert into spring5_member
values ('aaa', '111', '차슈', 'aaa@aaa.com', '010-1234-5678', '서울시 녀러분', 1, 'ROLE_USER');

insert into spring5_member (memberid, memberpw, membername)
values ('bbb', '222', '콩이');


-- board



-- reply




select * from spring5_member;