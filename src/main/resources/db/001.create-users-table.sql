CREATE TABLE  users (
 id BIGINT( 11 ) NOT NULL AUTO_INCREMENT ,
 email VARCHAR( 320) NOT NULL ,
 password VARCHAR( 32 ) NOT NULL ,
 username VARCHAR( 20 ) NOT NULL ,
 PRIMARY KEY ( id ),
 UNIQUE ( email )
) ENGINE = INNODB;