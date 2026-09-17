create table users
(
    id       bigint auto_increment
        primary key,
    name     varchar(255) not null,
    email    varchar(255) not null,
    password varchar(255) not null
);

create table addresses
(
    id      bigint auto_increment
        primary key,
    street  varchar(255) not null,
    city    varchar(255) not null,
    state   varchar(255) not null,
    zip     varchar(255) not null,
    user_id bigint       not null,
    constraint addresses_users_id_fk
        foreign key (user_id) references users (id)
);

create table profiles
(
    id             bigint auto_increment,
    bio            text,
    phone_number   varchar(15),
    date_of_birth  date,
    loyalty_points int unsigned default 0,
    foreign key (id) references users (id)
);

create table tags
(
    id   int auto_increment primary key,
    name varchar(255) not null
);

create table user_tags
(
    user_id bigint not null,
    tag_id  int    not null,
    primary key (user_id, tag_id),
    foreign key (user_id) references users (id) on delete cascade,
    foreign key (tag_id) references tags (id) on delete cascade
);
