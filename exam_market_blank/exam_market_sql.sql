-- 중고거래 사이트 예제
select * from MARKET_MEMBER;

-- 회원정보 테이블
create table market_member (
                               memberid      varchar2(20)        primary key ,                                -- 사용자 아아디
                               memberpw      varchar2(100)       not null ,                                   -- 암호화된 로그인 비밀번호
                               membername    varchar2(20)        not null ,                                   -- 사용자 이름
                               phone         varchar2(20)        not null ,                                   -- 전화번호
                               enabled       number(1)           default 1   check ( enabled in (1, 0) ) ,    -- 계정상태 1가능 0불능
                               rolename      varchar2(20)        default 'ROLE_USER'                          -- 사용자권한 모두 ROLE_USER
);

-- 판매글 테이블
create table market_board (
                              boardnum        number              primary key ,                                -- 글 번호
                              memberid        varchar2(20)        not null ,                                   -- 작성자 아아디
                              title           varchar2(200)       not null ,                                   -- 제목
                              contents        varchar2(2000)      not null ,                                   -- 상품소개글 내용
                              inputdate      date                default SYSDATE ,                            -- 작성일
                              category        varchar2(50)                        ,                            -- 상품분휴
                              soldout         char(1)           default 'N'  check ( soldout in ('N', 'Y') ) , -- 판매완료여부 N판매중 Y판매완료
                              buyerid         varchar2(20)                                                     -- 구매자아이디
);

--판매글 일련번호 시퀀스
CREATE SEQUENCE market_board_seq;

-- 리플 테이블
create table market_reply (
                              replynum        number              primary key ,                               -- 댓글 일련번호
                              boardnum        number              references MARKET_BOARD (BOARDNUM) ,        -- 판매글 본문번호
                              memberid        varchar2(20)        not null ,                                  -- 작성자 아이디
                              replytext       varchar2(500)   ,                                               -- 댓글 내용
                              inputdate       date                default SYSDATE                             -- 작성일
);

--리플 일련번호 시퀀스
CREATE SEQUENCE market_reply_seq;
