/*
Suponga que la primera cláusula del programa lógico "puro" para la suma de números naturales fuese suma(0,X,X) en
lugar de la dada.
¿Como sería el resto del programa?
*/

% suma(?X,?Y,?Z): es cierto si Z es la suma de X e Y

suma(0,X,X).

suma(s(X),Y,s(Z)):-
    suma(X,Y,Z).

/*IMPORTANTE.
Debido a que la codificación de los números se hace mediante la función s() sucesor, las entradas en la consulta deben
 tener la misma codificación*/

% Query que suma 2 + 1
?-suma(s(s(0)),s(0),X).