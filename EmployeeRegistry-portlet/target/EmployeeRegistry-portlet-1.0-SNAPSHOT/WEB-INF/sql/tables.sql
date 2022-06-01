create table registry_Bank (
	bank_id LONG not null primary key,
	bank_name VARCHAR(75) null,
	bik VARCHAR(75) null,
	bank_address VARCHAR(75) null
);

create table registry_Employee (
	employee_id LONG not null primary key,
	last_name VARCHAR(75) null,
	first_name VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	sex VARCHAR(75) null,
	date_of_birth VARCHAR(75) null,
	position_id LONG,
	date_of_employment VARCHAR(75) null,
	salary INTEGER,
	work_phone_number VARCHAR(75) null,
	mobile_phone_number VARCHAR(75) null,
	bank_id LONG,
	archive_status BOOLEAN
);

create table registry_Position (
	position_id LONG not null primary key,
	position_name VARCHAR(75) null,
	archive_status BOOLEAN
);