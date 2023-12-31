CREATE TABLE USERS(
    "ID" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1 RESTART WITH 3) NOT NULL PRIMARY KEY,
    "CREATED_DATE" TIMESTAMP(6),
    "EMAIL" CHARACTER VARYING(255),
    "ENABLED" BOOLEAN NOT NULL,
    "FIRST_NAME" CHARACTER VARYING(255),
    "LAST_NAME" CHARACTER VARYING(255),
    "PASSWORD" CHARACTER VARYING(255),
    "ROLE" CHARACTER VARYING(255),
    "UPDATED_DATE" TIMESTAMP(6),
    "USERNAME" CHARACTER VARYING(255)
);  