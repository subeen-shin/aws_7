
# 조건: 1번 회원이 101번 상품을 2개 주문함
# product 테이블: 101번 상품 재고 2개 감소
# member 테이블: 1번 회원 포인트 100점 증가
# orders 테이블: 주문 내역 추가 (1번 회원, 101번 상품, 수량 2, 오늘 날짜)
# 1번 회원이 주문한 상품명을 조회(JOIN 이용)

# 쇼핑몰에 가입된 회원을 조회
use mall;
START TRANSACTION;

# 상품 101번 재고 2개 감소
UPDATE product
SET p_stock = p_stock - 2
WHERE p_id = 101;

# 1번 회원 포인트 100점 증가
UPDATE member
SET m_point = m_point + 100
WHERE m_id = 1;

# 주문 내역 추가
INSERT INTO `order` (o_id, m_id, p_id, o_qty, o_date)
VALUES (1, 1, 101, 2, CURDATE());

COMMIT;

# 1번 회원 정보 조회
SELECT *
FROM member
WHERE m_id = 1;

# 101번 상품 정보 조회
SELECT *
FROM product
WHERE p_id = 101;

# 1번 회원의 주문 내역 조회
SELECT
    product.p_name
FROM
    `order`
JOIN
    product ON product.p_id = `order`.p_id
WHERE
    `order`.m_id = 1;