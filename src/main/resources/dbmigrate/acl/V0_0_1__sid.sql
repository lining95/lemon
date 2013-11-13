

-------------------------------------------------------------------------------
--  sid
-------------------------------------------------------------------------------
CREATE TABLE ACL_SID(
        ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
	NAME VARCHAR(200),
	REFERENCE VARCHAR(200),
	GLOBAL_ID BIGINT,
	LOCAL_ID BIGINT,
        CONSTRAINT PK_ACL_SID PRIMARY KEY(ID)
);

