set names utf8;
set foreign_key_checks=0;

drop database if exists sample_site;
create database if not exists sample_site;
use sample_site;

create table user_info(
id int comment 'ID'not null primary key auto_increment,
user_id varchar(255) comment 'ユーザーID',
password varchar(255) comment 'パスワード',
user_name varchar(255) comment 'ユーザー名',
mail varchar(255) comment 'メールアドレス',
insert_date datetime comment '登録日時',
updated_date datetime comment '更新日時'
);

create table product_info(
id int comment 'ID' not null primary key auto_increment,
item_name varchar(255) comment '商品名',
item_description varchar(255) comment '商品詳細',
price int comment '価格',
stock int comment '在庫',
item_image_path varchar(255) comment "商品画像パス",
item_image_file varchar(255) comment "商品画像",
insert_date datetime comment '登録日時',
update_date datetime comment '更新日時'
);

create table purchase_history_info(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(255),
pay varchar(30),
insert_date datetime,
update_date datetime
);

create table inquiry(
name varchar(255) comment "件名",
mail varchar(255) comment "メールアドレス",
qtype varchar(255) comment "問い合わせ種類",
body varchar(255) comment "問い合わせ内容",
insert_date datetime comment "問い合わせ日時"
);

insert into user_info(user_id,password,user_name) values("test","test","test");
insert into product_info(item_name,item_description,price,stock,item_image_path,item_image_file) values("ボールペン","ボールペン",300,100,"./item_image","ballpen_bk.jpg");