create table RL_Lecture (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	recordedlectureId LONG not null primary key,
	Title VARCHAR(75) null,
	videoURL VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table RL_lectureUpload (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	uploadId LONG not null primary key,
	Title VARCHAR(75) null,
	videoURL VARCHAR(75) null,
	name VARCHAR(75) null,
	recordedlectureId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);