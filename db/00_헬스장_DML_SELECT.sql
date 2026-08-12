use health;
#헬스장에 등록된 회원 목록을 조회 
select * from user;

#헬스장에 등록된 회원 수를 조회
select count(*) from user;

# 헬스장에 등록된 프로그램을 조회
select * from program;

# 모닝 요가를 수강 신청 인원수를 조회
SELECT 
    COUNT(*) as 모닝요가수강인원
FROM
    course
WHERE
    program_id in(select 
			id
		From 
			program
		where 
			title = '모닝 요가');

#프로그램별 수강인원을 조회
# outer join
# group by : course 테이블에 program_id 
# count()를 이용

SELECT 
	program.*,name,
    concat(count(program_id), '명') as 수강인원
FROM
    program
        LEFT JOIN
    course ON program_id = program.id
		join 
        trainer on trainer_id = trainer.id
    group by program.id;
    
# 사물함을 조회
select * from locker;
# 사물함이 사용중이면 o, 아니면 x로 조회
# if(조건, 참, 거짓)
# where 컬럼 = null : x
# where 컬럼 is null : x
select 
id 라커번호, if(user_id is null, 'X', 'O') 사용중 
from 
	locker
order by 라커번호;

# 라커를 이용중인 회원명을 조회
# outer join 

select
	locker.id as 라커번호,
	ifnull(user.name, '비어 있음') as 사용자명
from 
	locker
		LEFT JOIN 
    user on user_id = user.id 
order by 라커번호;

# 프로그램별 현재 출석 인원수를 조회
SELECT 
    program.*, count(date) as 출석인원수
FROM
    (SELECT 
        *
    FROM
        attendance
	WHERE
         date = CURDATE()) att
         RIGHT JOIN
    program ON program_id = program.id
group by program.id;
    


