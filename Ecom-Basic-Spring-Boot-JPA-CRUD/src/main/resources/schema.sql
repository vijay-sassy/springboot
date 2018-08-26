create table if not exists ecomstore (
  id bigint(20) not null auto_increment,
  product_name varchar(50) not null,
  in_stock char(1) not null,
  quantity int,
  cost_price double not null,
  selling_price double not null,
  rating double not null,
  primary key(id)
 );