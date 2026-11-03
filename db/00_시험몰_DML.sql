# 시스템 운영을 위해 기초 데이터를 입력하고, 정상적으로 들어갔는지 확인해야 합니다.
# 4-1 : 다음 데이터를 추가하는 쿼리를 작성하세요.
# 회원
# 아이디 : 1, 이름 :홍길동, 포인트 :1000
insert into member (m_id, m_name, m_point)
values (1, '홍길동', 1000);

# 아이디 : 2, 이름 :김철수, 포인트 :500
insert into member (m_id, m_name, m_point)
values (2, '김철수', 500);

# 상품
# 상품 번호 :101, 상품명 : 노트북, 가격 :1500000, 재고 :10
insert into product (p_id, p_name, p_price, p_stock)
values (101, '노트북', 1500000, 10);

#상품 번호 :102, 상품명 : 마우스, 가격 :30000, 재고 :50
insert into product (p_id, p_name, p_price, p_stock)
values (102, '마우스', 30000, 50 );

select * from member;
select * from product;




# 모든 회원의 이름과 포인트, 그리고 모든 상품의 이름과 재고량을 각각 조회하여 데이터가 정확히 입력되었는지 확인하는 쿼리를 작성하세요.

