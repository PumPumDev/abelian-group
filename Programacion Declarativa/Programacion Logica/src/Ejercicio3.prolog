/*
Escriba un programa lógico “puro” capaz de decidir si un nu´mero natural es par. Es decir, implemente el predicado
par(?X), cierto si X es par, manejando los nu´meros naturales mediante la constante cero y la funcio´n sucesor s(X)
como se ha hecho en los apuntes.
*/

% par(?X) : cierto si X es par

par(0).

par(s(s(X))):-
    par(X).