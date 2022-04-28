CREATE TABLE Female (
    femaleId int,
    name varchar(255),
    DOB Date,
    city varchar(255),
    State varchar(255),
    zipcode int,
    emailId varchar(255),
    mobileNo long,
    Password varchar(255),
    patientId int
);
commit;



CREATE TABLE Patient (
    patientId int,
    femaleId int,
    enterpriseId int
);
commit;


CREATE TABLE Appointment (
    patientId int,
    femaleId int,
    enterpriseId int,
    appointmentNo int,
    assignedDr varchar(255),
    appointmentDate Date
);
commit;

CREATE TABLE Cases (
    femaleId int,
    case varchar(255),
    policeEmpId int,
    lawyerEmpId int,
    caseRaised Date,
    involveJudiciary varchar(5)
);
commit;


CREATE TABLE MedicineInventory (
    medicineName varchar(255),
    quantityAvailable int,
    enterpriseId int
);
commit;

CREATE TABLE Examiner (
    patientId int,
    testName varchar(255),
    testResult varchar(255),
    examinationDate Date, 
    enterpriseId int
);
commit;

CREATE TABLE NurseReadings (
    patientId int,
    enterpriseId int,
    readingDate Date,
    heightInCM int,
    weightInKg int,
    bpSystolic int,
    bpDiastolic int,
    sugarInMGperDL int,
    thyroidInTSH int,
    bmi int,
    hemoglobin int,
    wbc long,
    rbc long,
    pulseRateBeatsPermin int,
    respirationRate int,
    bodyTempInF int,
    rootConcern varchar(255)
);
commit;

CREATE TABLE PeriodTracker (
    femaleId int,
    emailId varchar(255),
    lastPeriodDate Date,
    stopAlert varchar(5)
);
commit;

ALTER TABLE Female
ADD username varchar(255);
commit;

ALTER TABLE patient ADD name varchar(255);
ALTER TABLE patient ADD DOB Date;
ALTER TABLE patient ADD city varchar(255);
ALTER TABLE patient ADD State varchar(255);
ALTER TABLE patient ADD zipcode int;
ALTER TABLE patient ADD emailId varchar(255);
ALTER TABLE patient add  mobileno long;
commit;


---------------------------------------
--by sreyo 

create table administrator(username varchar2(20),password varchar2(20));


insert into  administrator values('user','12345');


create table enterprise(name varchar2(20),location varchar2(20),type varchar2(20));


create table enterprise_detail(enterprise_name VARCHAR2(20),location VARCHAR2(20),username VARCHAR2(20),password VARCHAR2(20),name VARCHAR2(20));


create table ngo_detail(ngo_id int, ngo_name VARCHAR2(20),location VARCHAR2(20), zipcode VARCHAR2(20),authorization_type VARCHAR2(20)
,address VARCHAR2(70),functionality VARCHAR2(60)
);

create table govt_ids(id varchar2(20));

insert into govt_ids values('g123456');
insert into govt_ids values('g223344');
insert into govt_ids values('g334455');


create table work_area (workarea_id int ,organization varchar2(30),emp_name VARCHAR2(50),
email VARCHAR2(60),contact_no VARCHAR2(15),username VARCHAR2(10),password VARCHAR2(10));


CREATE SEQUENCE ngo_id_seq  INCREMENT BY 1 START WITH 1;

CREATE OR REPLACE TRIGGER ngo_trigger
BEFORE INSERT
ON ngo_detail 
FOR EACH ROW
BEGIN
  :NEW.ngo_id := ngo_id_seq.NEXTVAL ;
END ngo_trigger;


CREATE SEQUENCE female_id_seq  INCREMENT BY 1 START WITH 1;



CREATE OR REPLACE TRIGGER female_trigger
BEFORE INSERT
ON female 
FOR EACH ROW
BEGIN
  :NEW.femaleid := female_id_seq.NEXTVAL; 
END female_trigger;




CREATE SEQUENCE workarea_id_seq  INCREMENT BY 1 START WITH 1;



CREATE OR REPLACE TRIGGER workarea_trigger
BEFORE INSERT
ON work_area 
FOR EACH ROW
BEGIN
  :NEW.workarea_id := workarea_id_seq.NEXTVAL ;
END workarea_trigger;

------------------------------
--by me

CREATE SEQUENCE workarea_id_seq  INCREMENT BY 1 START WITH 1;



CREATE OR REPLACE TRIGGER workarea_trigger
BEFORE INSERT
ON work_area 
FOR EACH ROW
BEGIN
  :NEW.workarea_id := workarea_id_seq.NEXTVAL ;
END workarea_trigger;
-------------------------------------------------------------
--by trisha

drop table cases;
commit;
CREATE TABLE RegisteredCases (
    femaleId varchar(255),
    caseDetail varchar(255),
    policeUsername varchar(255),
    lawyerUsername varchar(255),
    caseRaised Date,
    involveJudiciary varchar(5)
);
commit;

