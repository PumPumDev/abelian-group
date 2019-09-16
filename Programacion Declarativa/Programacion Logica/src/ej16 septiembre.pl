r1(X,Z):-
	r2(X,Y),
	r1(Y,Z).

r1(X,X).
r2(a,b).

%CONSULTA: ?- r1(X,B), r2(X,B).