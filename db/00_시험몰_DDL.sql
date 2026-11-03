DROP DATABASE IF EXISTS  MALL;
CREATE DATABASE MALL;
USE  MALL;


DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`m_id`	int	NOT NULL unique,
	`m_name`	varchar(20)	not NULL,
	`m_point`	int	not NULL default 0
);

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
	`p_id`	int	NOT NULL unique,
	`p_name`	varchar(50)	not NULL,
	`p_price`	int	not NULL,
	`p_stock`	int	not NULL
);

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
	`o_id`	int	NOT NULL,
	`o_qty`	int	not NULL,
	`o_date`	date NOT NULL,
	`m_id`	int	NOT NULL,
	`p_id`	int	NOT NULL
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`m_id`
);

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`p_id`
);

ALTER TABLE `order` ADD CONSTRAINT `PK_ORDER` PRIMARY KEY (
	`o_id`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_member_TO_order_1` FOREIGN KEY (
	`m_id`
)
REFERENCES `member` (
	`m_id`
);

ALTER TABLE `order` ADD CONSTRAINT `FK_product_TO_order_1` FOREIGN KEY (
	`p_id`
)
REFERENCES `product` (
	`p_id`
);





