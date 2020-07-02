--------------------------------------------------------
--  File created - Thursday-July-02-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table GERBONG
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."GERBONG" 
   (	"ID_GERBONG" VARCHAR2(20 CHAR), 
	"ID_KERETA" VARCHAR2(20 CHAR), 
	"NOMOR" NUMBER(*,0), 
	"KAPASITAS" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table JADWAL
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."JADWAL" 
   (	"ID_JADWAL" VARCHAR2(20 CHAR), 
	"ID_KERETA" VARCHAR2(20 CHAR), 
	"ID_MASINIS" VARCHAR2(20 CHAR), 
	"TANGGAL" VARCHAR2(20 CHAR), 
	"JAM" VARCHAR2(20 CHAR), 
	"TUJUAN" VARCHAR2(20 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table JENIS_KELAS
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."JENIS_KELAS" 
   (	"ID_KELAS" VARCHAR2(20 CHAR), 
	"NAMA_KELAS" VARCHAR2(20 CHAR), 
	"KETERANGAN" VARCHAR2(100 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table KERETA_API
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."KERETA_API" 
   (	"ID_KERETA" VARCHAR2(20 CHAR), 
	"NAMA_KERETA" VARCHAR2(20 CHAR), 
	"ID_KELAS" VARCHAR2(20 CHAR), 
	"GERBONG" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table MANAGER
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."MANAGER" 
   (	"ID_MANAGER" VARCHAR2(20 CHAR), 
	"NAMA" VARCHAR2(50 CHAR), 
	"NO_KTP" NUMBER(20,0), 
	"ALAMAT" VARCHAR2(100 CHAR), 
	"TGL_LAHIR" VARCHAR2(20 CHAR), 
	"USERNAME" VARCHAR2(20 CHAR), 
	"PASSWORD" VARCHAR2(30 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table MASINIS
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."MASINIS" 
   (	"ID_MASINIS" VARCHAR2(20 CHAR), 
	"NAMA" VARCHAR2(50 CHAR), 
	"NO_KTP" VARCHAR2(20 CHAR), 
	"ALAMAT" VARCHAR2(100 CHAR), 
	"TGL_LAHIR" VARCHAR2(20 CHAR), 
	"USERNAME" VARCHAR2(20 CHAR), 
	"PASSWORD" VARCHAR2(30 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table PENUMPANG
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."PENUMPANG" 
   (	"ID_PENUMPANG" VARCHAR2(20 CHAR), 
	"NAMA" VARCHAR2(50 CHAR), 
	"NO_KTP" NUMBER(20,0), 
	"UMUR" NUMBER(3,0), 
	"ALAMAT" VARCHAR2(100 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Table PETUGAS
--------------------------------------------------------

  CREATE TABLE "AMAR90487"."PETUGAS" 
   (	"ID_PETUGAS" VARCHAR2(20 CHAR), 
	"NAMA" VARCHAR2(50 CHAR), 
	"NO_KTP" VARCHAR2(20 CHAR), 
	"ALAMAT" VARCHAR2(100 CHAR), 
	"TGL_LAHIR" VARCHAR2(20 CHAR), 
	"USERNAME" VARCHAR2(20 CHAR), 
	"PASSWORD" VARCHAR2(30 CHAR)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for View Daftar Jadwal
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."Daftar Jadwal" ("ID_JADWAL", "WAKTU", "TUJUAN") AS 
  select id_jadwal, waktu, tujuan from jadwal where id_manager = 'Manager001'
;
--------------------------------------------------------
--  DDL for View Daftar Jadwal1
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."Daftar Jadwal1" ("ID_JADWAL", "WAKTU", "TUJUAN") AS 
  select id_jadwal, waktu, tujuan from jadwal where id_manager = 'Manager001'
;
--------------------------------------------------------
--  DDL for View HAPUS_DATA_MASINIS
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."HAPUS_DATA_MASINIS" ("ID_MASINIS", "NAMA", "NO_KTP", "ALAMAT", "TGL_LAHIR", "USERNAME", "PASSWORD") AS 
  (select"ID_MASINIS","NAMA","NO_KTP","ALAMAT","TGL_LAHIR","USERNAME","PASSWORD"from masinis)
;
--------------------------------------------------------
--  DDL for View JOIN_1
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_1" ("Nama Manager", "Id Jadwal") AS 
  select nama as "Nama Manager", id_jadwal as "Id Jadwal" from jadwal join manager on jadwal.id_manager = manager.id_manager where jadwal.id_kereta = 'KRA0001' and  jadwal.tujuan = 'Jakarta'
;
--------------------------------------------------------
--  DDL for View JOIN_11
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_11" ("Nama Manager", "Id Jadwal") AS 
  select nama as "Nama Manager", id_jadwal as "Id Jadwal" from jadwal join manager on jadwal.id_manager = manager.id_manager where jadwal.id_kereta = 'KRA0001' and  jadwal.tujuan != 'Jakarta'
;
--------------------------------------------------------
--  DDL for View JOIN_111
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_111" ("Nama Manager", "Id Jadwal") AS 
  select nama as "Nama Manager", id_jadwal as "Id Jadwal" from jadwal join manager on jadwal.id_manager = manager.id_manager where jadwal.id_kereta = 'KRA0001' and  jadwal.tujuan != 'Jakarta'
;
--------------------------------------------------------
--  DDL for View JOIN_2
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_2" ("NAMA", "ID_JADWAL", "NAMA_KERETA") AS 
  select nama as "Nama Manager", id_jadwal as "Id Jadwal", nama_kereta as "Nama Kereta" from jadwal left join manager on manager.id_manager = jadwal.id_manager left join kereta_api on kereta_api.id_kereta = jadwal.id_kereta WHERE id_jadwal in (select id_jadwal from stok_tiket where stok_tiket.id_jadwal = jadwal.id_jadwal)
;
--------------------------------------------------------
--  DDL for View JOIN_3
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_3" ("TUJUAN", "ID_KERETA", "STOK_TIKET") AS 
  select jadwal.tujuan, kereta_api.id_kereta, max(stok_tiket) as "Stok Tiket terbanyak" from stok_tiket right join jadwal on stok_tiket.id_jadwal = jadwal.id_jadwal right join kereta_api on kereta_api.id_kereta = jadwal.id_kereta GROUP BY jadwal.tujuan, kereta_api.id_kereta
;
--------------------------------------------------------
--  DDL for View JOIN_33
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_33" ("TUJUAN", "ID_KERETA", "STOK_TIKET") AS 
  select jadwal.tujuan, kereta_api.id_kereta, max(stok_tiket) as "Stok Tiket terbanyak" from stok_tiket right join jadwal on stok_tiket.id_jadwal = jadwal.id_jadwal right join kereta_api on kereta_api.id_kereta = jadwal.id_kereta GROUP BY jadwal.tujuan, kereta_api.id_kereta
;
--------------------------------------------------------
--  DDL for View JOIN_333
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "AMAR90487"."JOIN_333" ("TUJUAN", "ID_KERETA", "STOK_TIKET") AS 
  select jadwal.tujuan, kereta_api.id_kereta, max(stok_tiket) as "Stok Tiket terbanyak" from stok_tiket right join jadwal on stok_tiket.id_jadwal = jadwal.id_jadwal right join kereta_api on kereta_api.id_kereta = jadwal.id_kereta GROUP BY jadwal.tujuan, kereta_api.id_kereta
;
REM INSERTING into AMAR90487.GERBONG
SET DEFINE OFF;
REM INSERTING into AMAR90487.JADWAL
SET DEFINE OFF;
Insert into AMAR90487.JADWAL (ID_JADWAL,ID_KERETA,ID_MASINIS,TANGGAL,JAM,TUJUAN) values ('JD0001','KR0001','Masinis001','16-06-2020','23:36:12','Sidoarjo');
Insert into AMAR90487.JADWAL (ID_JADWAL,ID_KERETA,ID_MASINIS,TANGGAL,JAM,TUJUAN) values ('JD0002','KR0001','Masinis001','16-07-2020','17:15:59','Surabaya');
REM INSERTING into AMAR90487.JENIS_KELAS
SET DEFINE OFF;
Insert into AMAR90487.JENIS_KELAS (ID_KELAS,NAMA_KELAS,KETERANGAN) values ('K0001','Ekonomi','Murah Meriah cok');
Insert into AMAR90487.JENIS_KELAS (ID_KELAS,NAMA_KELAS,KETERANGAN) values ('K0002','Kaya Banget','dasdasd');
REM INSERTING into AMAR90487.KERETA_API
SET DEFINE OFF;
Insert into AMAR90487.KERETA_API (ID_KERETA,NAMA_KERETA,ID_KELAS,GERBONG) values ('KR0002','Naga','K0002','4');
Insert into AMAR90487.KERETA_API (ID_KERETA,NAMA_KERETA,ID_KELAS,GERBONG) values ('KR0003','Darmo','K0001','6');
Insert into AMAR90487.KERETA_API (ID_KERETA,NAMA_KERETA,ID_KELAS,GERBONG) values ('KR0001','Dragon','K0001','8');
REM INSERTING into AMAR90487.MANAGER
SET DEFINE OFF;
Insert into AMAR90487.MANAGER (ID_MANAGER,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Manager001','Andika','1234567890','Sidoarjo','11-SEP-87','MGR0001','1234');
Insert into AMAR90487.MANAGER (ID_MANAGER,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Manager002','Saiful','7213782731','Surabaya','04-JAN-89','MGR0002','1234');
Insert into AMAR90487.MANAGER (ID_MANAGER,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Manager003','Rafli','8234293823','Surabaya','06-JAN-88','MGR0003','1234');
REM INSERTING into AMAR90487.MASINIS
SET DEFINE OFF;
Insert into AMAR90487.MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis002','Rizky','1234567890','Sidoarjo','11-06-2020','MS0002','1234');
Insert into AMAR90487.MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis0004','Rizky','1234567890','Surabaya','09-07-2020','Rizky123','1234');
Insert into AMAR90487.MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis001','Amar','1234567890','Janti','20-01-1999','MS0001','1234');
Insert into AMAR90487.MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis0003','Testing','1234567890','Janti','08-07-2020','MS0005','1234');
REM INSERTING into AMAR90487.PENUMPANG
SET DEFINE OFF;
REM INSERTING into AMAR90487.PETUGAS
SET DEFINE OFF;
Insert into AMAR90487.PETUGAS (ID_PETUGAS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('PT0001','Amar','1234','Janti','10-06-2020','Amar1','1234');
Insert into AMAR90487.PETUGAS (ID_PETUGAS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('PT0002','Amar2','123456','Surabaya','10-06-2020','Tes','1234');
REM INSERTING into AMAR90487."Daftar Jadwal"
SET DEFINE OFF;
REM INSERTING into AMAR90487."Daftar Jadwal1"
SET DEFINE OFF;
REM INSERTING into AMAR90487.HAPUS_DATA_MASINIS
SET DEFINE OFF;
Insert into AMAR90487.HAPUS_DATA_MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis002','Rizky','1234567890','Sidoarjo','11-06-2020','MS0002','1234');
Insert into AMAR90487.HAPUS_DATA_MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis0004','Rizky','1234567890','Surabaya','09-07-2020','Rizky123','1234');
Insert into AMAR90487.HAPUS_DATA_MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis001','Amar','1234567890','Janti','20-01-1999','MS0001','1234');
Insert into AMAR90487.HAPUS_DATA_MASINIS (ID_MASINIS,NAMA,NO_KTP,ALAMAT,TGL_LAHIR,USERNAME,PASSWORD) values ('Masinis0003','Testing','1234567890','Janti','08-07-2020','MS0005','1234');
REM INSERTING into AMAR90487.JOIN_1
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_11
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_111
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_2
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_3
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_33
SET DEFINE OFF;
REM INSERTING into AMAR90487.JOIN_333
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index PK_JADWAL
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_JADWAL" ON "AMAR90487"."JADWAL" ("ID_JADWAL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_GERBONG_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_GERBONG_ID" ON "AMAR90487"."GERBONG" ("ID_GERBONG") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_JENIS_KELAS_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_JENIS_KELAS_ID" ON "AMAR90487"."JENIS_KELAS" ("ID_KELAS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_KERETA_API_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_KERETA_API_ID" ON "AMAR90487"."KERETA_API" ("ID_KERETA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_MANAGER_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_MANAGER_ID" ON "AMAR90487"."MANAGER" ("ID_MANAGER") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_MASINIS_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_MASINIS_ID" ON "AMAR90487"."MASINIS" ("ID_MASINIS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_PENUMPANG_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_PENUMPANG_ID" ON "AMAR90487"."PENUMPANG" ("ID_PENUMPANG") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index PK_TB_PETUGAS_ID
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."PK_TB_PETUGAS_ID" ON "AMAR90487"."PETUGAS" ("ID_PETUGAS") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index SYS_C008536
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."SYS_C008536" ON "AMAR90487"."PETUGAS" ("USERNAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index SYS_C008545
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."SYS_C008545" ON "AMAR90487"."MANAGER" ("USERNAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  DDL for Index SYS_C008554
--------------------------------------------------------

  CREATE UNIQUE INDEX "AMAR90487"."SYS_C008554" ON "AMAR90487"."MASINIS" ("USERNAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487" ;
--------------------------------------------------------
--  Constraints for Table GERBONG
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."GERBONG" ADD CONSTRAINT "PK_TB_GERBONG_ID" PRIMARY KEY ("ID_GERBONG")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."GERBONG" MODIFY ("KAPASITAS" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."GERBONG" MODIFY ("NOMOR" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."GERBONG" MODIFY ("ID_KERETA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."GERBONG" MODIFY ("ID_GERBONG" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table JADWAL
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."JADWAL" ADD CONSTRAINT "PK_JADWAL" PRIMARY KEY ("ID_JADWAL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("TUJUAN" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("JAM" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("TANGGAL" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("ID_MASINIS" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("ID_KERETA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JADWAL" MODIFY ("ID_JADWAL" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table JENIS_KELAS
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."JENIS_KELAS" ADD CONSTRAINT "PK_TB_JENIS_KELAS_ID" PRIMARY KEY ("ID_KELAS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."JENIS_KELAS" MODIFY ("KETERANGAN" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JENIS_KELAS" MODIFY ("NAMA_KELAS" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."JENIS_KELAS" MODIFY ("ID_KELAS" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table KERETA_API
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."KERETA_API" ADD CONSTRAINT "PK_TB_KERETA_API_ID" PRIMARY KEY ("ID_KERETA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."KERETA_API" MODIFY ("GERBONG" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."KERETA_API" MODIFY ("ID_KELAS" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."KERETA_API" MODIFY ("NAMA_KERETA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."KERETA_API" MODIFY ("ID_KERETA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MANAGER
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."MANAGER" ADD UNIQUE ("USERNAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."MANAGER" ADD CONSTRAINT "PK_TB_MANAGER_ID" PRIMARY KEY ("ID_MANAGER")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("TGL_LAHIR" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("ALAMAT" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("NO_KTP" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("NAMA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MANAGER" MODIFY ("ID_MANAGER" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table MASINIS
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."MASINIS" ADD UNIQUE ("USERNAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."MASINIS" ADD CONSTRAINT "PK_TB_MASINIS_ID" PRIMARY KEY ("ID_MASINIS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("TGL_LAHIR" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("ALAMAT" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("NO_KTP" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("NAMA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."MASINIS" MODIFY ("ID_MASINIS" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PENUMPANG
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."PENUMPANG" ADD CONSTRAINT "PK_TB_PENUMPANG_ID" PRIMARY KEY ("ID_PENUMPANG")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."PENUMPANG" MODIFY ("ALAMAT" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PENUMPANG" MODIFY ("UMUR" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PENUMPANG" MODIFY ("NO_KTP" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PENUMPANG" MODIFY ("NAMA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PENUMPANG" MODIFY ("ID_PENUMPANG" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PETUGAS
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."PETUGAS" ADD UNIQUE ("USERNAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."PETUGAS" ADD CONSTRAINT "PK_TB_PETUGAS_ID" PRIMARY KEY ("ID_PETUGAS")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TUGAS_PRAKTIKUM_BD_90487"  ENABLE;
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("USERNAME" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("TGL_LAHIR" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("ALAMAT" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("NO_KTP" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("NAMA" NOT NULL ENABLE);
  ALTER TABLE "AMAR90487"."PETUGAS" MODIFY ("ID_PETUGAS" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table GERBONG
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."GERBONG" ADD CONSTRAINT "FK_TB_GERBONG_IDKERETA" FOREIGN KEY ("ID_KERETA")
	  REFERENCES "AMAR90487"."KERETA_API" ("ID_KERETA") ON DELETE CASCADE ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table JADWAL
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."JADWAL" ADD CONSTRAINT "FK_KERETA" FOREIGN KEY ("ID_KERETA")
	  REFERENCES "AMAR90487"."KERETA_API" ("ID_KERETA") ENABLE;
  ALTER TABLE "AMAR90487"."JADWAL" ADD CONSTRAINT "FK_MASINIS" FOREIGN KEY ("ID_MASINIS")
	  REFERENCES "AMAR90487"."MASINIS" ("ID_MASINIS") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table KERETA_API
--------------------------------------------------------

  ALTER TABLE "AMAR90487"."KERETA_API" ADD CONSTRAINT "FK_TB_KERETA_API_KELASID" FOREIGN KEY ("ID_KELAS")
	  REFERENCES "AMAR90487"."JENIS_KELAS" ("ID_KELAS") ENABLE;