create table categories
(
    id   tinyint auto_increment
        primary key,
    name varchar(255) NOT NULL
);

create table products
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) NOT NULL,
    price       decimal(10, 2) NOT NULL,
    category_id tinyint,
    constraint fk_category
        foreign key (category_id) references categories (id)
            on delete restrict
);

