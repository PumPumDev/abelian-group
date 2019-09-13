/*
Escriba un programa lo´gico “puro” capaz de multiplicar nu´meros naturales. Puede utilizar para ello la siguiente
deﬁnici´on recursiva del producto:

Para cualquier n ∈ N, n×0 = 0
Para cualesquiera n,m ∈ N, n×(m + 1) = (n×m) + n

El programa podr´a usar el predicado suma deﬁnido en el Cuadro 4 para sumar nu´meros naturales.
*/

%Primero definimos la suma que utilizaremos

%suma(?X,?Y,?Z) : cierto si Z es la suma de X e Y

suma(X,0,X).

suma(X,s(Y),s(Z)) :-
    suma(X,Y,Z).

%Definimos ahora el producto

% producto(?X,?Y,?Z): cierto si Z es el producto de X e Y

producto(X,0,0).

% TODO Problema: Conseguir el valor de la variable V
producto(X,s(Y),V) :-
    producto(X,Y,Z),
    suma(Z,X,V).
