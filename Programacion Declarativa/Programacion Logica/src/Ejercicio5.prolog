/*
Dado el programa en Prolog del tema PL-2 relativo a amistades (Cuadro 2 del tema PL-2):
*/

% enemigo(?X.?Y): cierto si X es enemigo de Y

enemigo(abel,cain).
enemigo(cain,blas).
enemigo(cain,dolores).
enemigo(blas,abilio).

% amigo(?X.?Y): cierto si X es amigo de Y

amigo(abilio,X) :-
    amigo(abel,X).

amigo(X,Y) :-
    enemigo(X,Z),
    enemigo(Z,Y).

% Apartado a) Escriba en L´ogica de Primer Orden y en Prolog las siguientes preguntas: CONSULTAS

% ¿Existen pares de personas tales que una es enemiga de la otra? En caso aﬁrmativo, ¿qui´enes son?
?- enemigo(X,Y).

% ¿Tiene Dolores algu´n enemigo?
?- enemigo(_,dolores).

% ¿Qui´enes son los enemigos de Ca´ın, si los tiene?
?- enemigo(X,cain).

% ¿Son Abel y Ca´ın enemigos de una misma persona? En caso aﬁrmativo, ¿de qui´en o qui´enes?
?- enemigo(abel,X), enemigo(cain,X).

% Apartado b)  Para cada una de las siguientes consultas en Prolog, exprese su signiﬁcado en lenguaje natural:

?- amigo(Uno,Dos).
% Dame todos los pares de amigos

?- enemigo(X,X).
% Quienes son enemigos de sí mismos

?- enemigo(X,Y), enemigo(X,Z), enemigo(Y,Z).
% ¿Qué tres son enemigos entre ellos? TODO NOT SURE

?- enemigo(_,abel).
% ¿Abel tiene algún enemigo?

?- amigo(Amigo, dolores).
% ¿Quienes son amigos de dolores?

/*
Apartado c)
Estime cua´les deber´ıan ser las respuestas a las consultas anteriores, sabiendo que se dispone del
conocimiento plasmado en el programa relativo a amistades. Emplee para ello algu´n m´etodo de demostracio´n para la
L´ogica de Primer Orden de los estudiados en la asignatura de L´ogica, o ha´galo informalmente usando su sentido
comu´n.
*/

% Usa Prolog para comprobar las consultas jeje
%change