create table contact
(
	id serial not null
		constraint contact_pkey
			primary key,
	last_name varchar(256),
	first_name varchar(256),
	middle_name varchar(256),
	last_name_accusative varchar(256),
	first_name_accusative varchar(256),
	middle_name_accusative varchar(256),
	previous_names varchar(512),
	date_of_birth date,
	actual_address varchar(1024),
	comment text,
	series varchar(64),
	number varchar(64),
	issued_by varchar(1024),
	issued_date date,
	subdivision_code varchar(64),
	place_of_birth varchar(1024),
	reg_address_index integer,
	reg_address_region varchar(1024),
	reg_address_district varchar(1024),
	reg_address_city varchar(1024),
	reg_address_settlement varchar(1024),
	reg_address_street varchar(1024),
	reg_address_street_type integer,
	reg_address_house varchar(64),
	reg_address_corp varchar(64),
	reg_address_flat varchar(64),
	gender varchar(32),
	created_date time with time zone not null
)
;

create table contact_email
(
	id serial not null
		constraint contact_email_pkey
			primary key,
	contact_id integer not null
		constraint fk_contact
			references contact,
	email varchar(128),
	main boolean
)
;

create table contact_phone
(
	id serial not null
		constraint contact_phone_pkey
			primary key,
	contact_id integer not null
		constraint fk_contact
			references contact,
	phone varchar(512),
	mail boolean,
	phone_type varchar(36)
)
;

create table role
(
	id serial not null
		constraint role_pkey
			primary key,
	name varchar(255) not null
)
;

create unique index role_id_uindex
	on role (id)
;

create table "user"
(
	id serial not null
		constraint user_pkey
			primary key,
	fio varchar(256) not null,
	email varchar(256) not null,
	password varchar(256) not null
)
;

create unique index user_id_uindex
	on "user" (id)
;

create table user_roles
(
	user_id integer not null
		constraint user_id___fk
			references "user",
	role_id integer not null
		constraint role_id___fk
			references role
)
;

create index user_id___fk
	on user_roles (user_id)
;

create index role_id___fk
	on user_roles (role_id)
;


/* dml
пароль юзера 123456
INSERT INTO user VALUES (1, 'user', 'user@mail.ru', '$2a$11$iA2wZZKUu4MArLZUOsW0IO0nifFBaJDygas');
INSERT INTO role VALUES (1, 'ROLE_USER');
INSERT INTO user_roles VALUES (1, 1);
*/