CREATE DATABASE test;
USE teast;
CREATE TABLE ttest_1 (number VARCHAR (20), logo VARCHAR (30), create_data DATE);
ALTER TABLE ttest_1 ADD number_id INT AUTO_INCREMENT PRIMARY KEY FIRST;
ALTER TABLE ttest_1 DROP number_id;
SELECT * FROM ttest_1;
EXPLAIN ttest_1;
SHOW TABLES;
EXPLAIN user;
DROP TABLE ttest_1;
SELECT * FROM user;
SELECT Id FROM USER;
SELECT email FROM USER WHERE USERNAME='Mike';
SELECT * FROM user WHERE Id<=1;
SELECT * FROM USER WHERE create_time !='2016-01-01 00:00:00' AND Id !=3;
SELECT * FROM USER WHERE create_time !='2016-01-01 00:00:00' OR Id !=2;
SELECT * FROM USER WHERE Id IN (2,3);
SELECT * FROM USER WHERE USERNAME LIKE '%Iv%';
SELECT *FROM USER ORDER BY CREATE_TIME;
SELECT *FROM USER LIMIT 1 offset 2;
ALTER TABLE USER ADD podskazka VARCHAR(30) AFTER password;
INSERT INTO user SET Id='4', username='Alex', email='alex331@mail.ru', password='ALf2',podskazka = 'a';
SELECT NOW();
DROP TABLE nonono;
UPDATE user SET podskazka ='q' WHERE username='Chesare';
DELETE FROM user WHERE Id=30 AND username='Netego';
TRUNCATE TABLE netego;
alter table user change Id id int(11);
INSERT INTO user SET id=5, username='O\'Reil',password='rel4';
select * from user where username='O\'Reil';


