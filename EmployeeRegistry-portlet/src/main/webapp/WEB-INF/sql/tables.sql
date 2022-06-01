create table registry_Bank (
	bankId LONG not null primary key,
	bankName VARCHAR(75) null,
	bik VARCHAR(75) null,
	bankAddress VARCHAR(75) null
);

create table registry_Employee (
	employeeId LONG not null primary key,
	lastName VARCHAR(75) null,
	firstName VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	sex VARCHAR(75) null,
	dateOfBirth VARCHAR(75) null,
	positionId LONG,
	dateOfEmployment VARCHAR(75) null,
	salary INTEGER,
	workPhoneNumber VARCHAR(75) null,
	mobilePhoneNumber VARCHAR(75) null,
	bankId LONG,
	archiveStatus BOOLEAN
);

create table registry_Position (
	positionId LONG not null primary key,
	positionName VARCHAR(75) null,
	archiveStatus BOOLEAN
);