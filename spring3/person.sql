-- person table
create table person (
    name varchar2(20),
    age number(3)
);

-- add constraint
alter table person add constraint person_name_pk primary key(name);

-- insert into
insert into person values ('소녀', 5);
insert into person values ('aaa', 11);
insert into person values ('vvv', 11);
insert into person values ('ccc', 11);

commit ;

select * from person;
