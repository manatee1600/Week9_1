DROP TABLE IF EXISTS names;

CREATE TABLE names (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  address VARCHAR(10),
  PRIMARY KEY(id)
);

INSERT INTO names (id,name,address) VALUES (1,"koyama","tokyo");
INSERT INTO names (id,name,address) VALUES (2,"tanaka","kanagawa");
INSERT INTO names (id,name,address) VALUES (3,"suzuki","saga");
