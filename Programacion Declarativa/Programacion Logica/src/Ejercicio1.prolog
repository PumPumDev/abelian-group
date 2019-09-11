%Programa relativo a amitades

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

% Apartado a) Completa el conocimiento añadiendo cláusulas que reperesenten el siguiente conocimiento

% Dolores es amigo de cualquiera que sea enemigo de Abilio o de Blas

amigo(dolores,X) :-
    enemigo(X,abilio).
amigo(dolores,X) :-
    enemigo(X,blas).

% Los que son enemigos de Caín y de Abel también son enemigos de Abilio

enemigo(X,abilio) :-
    enemigo(X,cain),
    enemigo(X,abel).

% Apartado b) Suponga que al programa se le añade el siguiente hecho:

amigo(abilio,X).

% Escriba la fórmula correspondiente en Lógica de Primer Orden y exprese el conocimiento que describe en lenguaje natural
% Forall X (amigo(abilio,X))
% Abilio es amigo de to do el mundo

% Apartado c) Defina el predicado:
% tiene_enemigos(?X): cierto si X tiene algún enemigo

tiene_enemigos(X) :-
    enemigo(_,X).

/*
IMPORTANTE.
Al ejecutar el programa da WARNING porque es estándar declarar todas las cláusulas que hablan de lo mismo juntas.
Es decir agrupar todas las definiciones de amigo y todas las de enemigo
*/