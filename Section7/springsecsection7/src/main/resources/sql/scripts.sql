create table users(username varchar(50) not null primary key,password varchar(500) not null,enabled boolean not null);
create table authorities (username varchar(50) not null,authority varchar(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

INSERT IGNORE INTO `users` VALUES ('user', '{noop}EasyBank@12345', '1');
INSERT IGNORE INTO `authorities` VALUES('user','read');

INSERT INTO `users` VALUES ('admin', '{bcrypt}$2a$12$nFEs8Mm0v8/i1EjaFyfgu.bFid/X7zARXdou8qBCr4oOFYTM6bxUK', '1');
INSERT IGNORE INTO `authorities` VALUES ('admin', 'admin');

DELETE FROM `users` WHERE username = 'user';
DELETE FROM `authorities` WHERE username = 'user';

CREATE TABLE  `customer`(
 `id` int NOT NULL auto_increment,
 `email` varchar(45) NOT NULL,
 `password` varchar(200) NOT NULL,
 `role` varchar(45) NOT NULL,
 PRIMARY KEY(`id`)
);

INSERT  INTO `customer` (`email`,`password`,`role`) VALUES ('happy@example.com', '{noop}EasyBank@12345', 'read');
INSERT  INTO `customer` (`email`,`password`,`role`) VALUES ('admin@example.com', '{bcrypt}$2a$12$nFEs8Mm0v8/i1EjaFyfgu.bFid/X7zARXdou8qBCr4oOFYTM6bxUK', 'admin');
