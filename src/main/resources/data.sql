#testimonial - se gestiona desde bbdd workbench/heroku

INSERT INTO `cientificos` VALUES ('4699','Mari'),('2344','Pili'),('6988','Marc'),('23677','Oscar'),('4533','Joana');
INSERT INTO `proyectos`(id,nombre,horas) VALUES ('p1','amebas',2300),('p2','marte',3400),('p3','covid',2220);
INSERT INTO `asignadoa`(cientifico, proyecto) VALUES ('4699','p1'),('23677','p3'),('4533','p1');

delete from cientificos;
delete from proyectos;
delete from asignadoa;

select * from asignadoa;
select * from proyectos;
select * from cientificos;