DROP TABLE IF EXISTS personne;

CREATE TABLE personne (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom VARCHAR(250) NOT NULL,
  prenom VARCHAR(250) NOT NULL,
  date_naissance DATETIME NOT NULL
);

INSERT INTO personne (nom, prenom, date_naissance) VALUES
  ('Laurent', 'GINA', '1995-01-26'),
  ('Sophie', 'FONCEK', '1991-08-05'),
  ('Agathe', 'FEELING', '2006-06-14');