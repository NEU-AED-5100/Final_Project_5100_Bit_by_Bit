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
    wbc int,
    rbc int,
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
---------------------
--27 Apr
CREATE SEQUENCE patient_id_seq  INCREMENT BY 1 START WITH 1;
commit;

CREATE OR REPLACE TRIGGER patient_trigger
BEFORE INSERT
ON patient 
FOR EACH ROW
BEGIN
  :NEW.PATIENTID := patient_id_seq.NEXTVAL ;
END patient_trigger;
commit;

ALTER TABLE patient add registrationdate Date;
commit;
--------------------------------------
--28 APR

drop table Appointment;
commit;
CREATE TABLE Appointment (
    appointmentId int,
    patientId int,
    femaleId int,
    enterpriseId int,
    appointmentNo int,
    assignedDr varchar(255),
    appointmentDate Date
);
commit;

CREATE SEQUENCE appointmentId_seq  INCREMENT BY 1 START WITH 1;
commit;

CREATE OR REPLACE TRIGGER appointment_trigger
BEFORE INSERT
ON Appointment 
FOR EACH ROW
BEGIN
  :NEW.appointmentId := appointmentId_seq.NEXTVAL ;
END appointment_trigger;
commit;

CREATE SEQUENCE APPOINTMENTNO_seq INCREMENT BY 1 START WITH 1;
commit;


CREATE OR REPLACE TRIGGER APPOINTMENTNO_trigger
BEFORE INSERT
ON Appointment 
FOR EACH ROW
BEGIN
  :NEW.APPOINTMENTNO := APPOINTMENTNO_seq.NEXTVAL ;
END APPOINTMENTNO_trigger;
commit;

ALTER TABLE Appointment add ENTERPRISEUSERNAME  varchar(255);
commit;

ALTER TABLE Appointment drop column  ENTERPRISEID;
commit;

CREATE TABLE PatientHistory (
    PatientHistory_id int,
    patientUsername varchar(255),
    femaleUsername varchar(255),
    enterpriseUsername varchar(255),
    root_concern varchar(255),
    reportGenerationDate Date,
    height_INcm int,
    weight_INkg int,
    bp_systolic int,
    bp_diastolic int,
    sugar_INmgdl int,
    thyroid_INTSH int,
    bmi int,
    hemoglobin int,
    wbc_PerL int,
    rbc_PerL int,
    pulseRate_InBeatsPerMin int,
    respirationrate int,
    bodytemperature_F int,
    autogenerated_report varchar(255),
    prescription varchar(255)
    
); 
commit;
CREATE SEQUENCE PatientHistory_id_seq INCREMENT BY 1 START WITH 1;
commit;


CREATE OR REPLACE TRIGGER PatientHistory_id_trigger
BEFORE INSERT
ON PatientHistory 
FOR EACH ROW
BEGIN
  :NEW.PatientHistory_id := PatientHistory_id_seq.NEXTVAL ;
END PatientHistory_id_trigger;
commit;

ALTER TABLE PatientHistory drop column  autogenerated_report;
commit;
ALTER TABLE PatientHistory drop column  prescription;
commit;

    ALTER TABLE PatientHistory add autogenerated_report  varchar(500);
commit;
    ALTER TABLE PatientHistory add prescription  varchar(500);
commit;


    ALTER TABLE Examiner add TESTNAME_RegistrationDate  Date;
commit;
    ALTER TABLE Examiner add Examiner_Id  int;
commit;
ALTER TABLE Examiner add FemaleId varchar(255);

CREATE SEQUENCE Examiner_Id_seq INCREMENT BY 1 START WITH 1;
commit;


CREATE OR REPLACE TRIGGER Examiner_Id_trigger
BEFORE INSERT
ON Examiner 
FOR EACH ROW
BEGIN
  :NEW.EXAMINER_ID := Examiner_Id_seq.NEXTVAL ;
END Examiner_Id_trigger;
commit;

--polioce lawyer request send
CREATE TABLE examinerrequest (
    femaleid              VARCHAR(255),
    police_lawyer         VARCHAR(255),
    ispolice              VARCHAR(255),
    islawyer              VARCHAR(255),
    police_lawyer_emailid VARCHAR(255)
);commit;

drop table MedicineInventory;
commit;
CREATE TABLE MedicineInventory (
    inventory_id int,
    medicineName varchar(255),
    quantityAvailable int,
    enterpriseId varchar2(10)
);
commit;

CREATE SEQUENCE inventory_id_seq  INCREMENT BY 1 START WITH 1;
commit;


CREATE OR REPLACE TRIGGER MedicineInventory_trigger
BEFORE INSERT
ON MedicineInventory 
FOR EACH ROW
BEGIN
  :NEW.inventory_id := inventory_id_seq.NEXTVAL ;
END MedicineInventory_trigger;
commit;

--Appointment
ALTER TABLE Appointment add scheduledTime varchar(10);
commit;

alter table work_area add enterprise_name VARCHAR2(20);
commit;

drop table PERIODTRACKER;
commit;
CREATE TABLE PeriodTracker (
    
    emailId varchar(255),
    stopAlert varchar(5),
    femaleusername varchar(255),
    lastPeriodDate varchar(255)
      
);
commit;


ALTER TABLE patient drop column  ENTERPRISEID;
commit;

    ALTER TABLE patient add ENTERPRISEID  varchar(255);
commit;
