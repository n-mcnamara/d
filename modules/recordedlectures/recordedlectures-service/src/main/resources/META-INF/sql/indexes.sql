create index IX_29DFD1AB on RL_Lecture (groupId);
create index IX_C0C23613 on RL_Lecture (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FB772555 on RL_Lecture (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1B90E42F on RL_lectureUpload (groupId, recordedlectureId);
create index IX_498DCF14 on RL_lectureUpload (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_10A70A96 on RL_lectureUpload (uuid_[$COLUMN_LENGTH:75$], groupId);