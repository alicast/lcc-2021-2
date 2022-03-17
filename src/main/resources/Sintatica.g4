grammar Sintatica;

import Lexica;

grammar Sintatica;

import Lexica;

program : (statement | funclist)? ;

funclist : funcdef funclist? ;

funcdef : def IDENT ABRE_PARENTESES paramlist FECHA_PARENTESES ABRE_CHAVES statelist FECHA_CHAVES ;

paramlist : tipo_ident paramlist_opcional? ;

tipo_ident : tipo IDENT ;

tipo : int | float | string ;

paramlist_opcional : ( VIRGULA paramlist )? ;

statement : vardecl PONTO_VIRGULA 
			|atribstat PONTO_VIRGULA 
			| printstat PONTO_VIRGULA 
			| readstat PONTO_VIRGULA 
			| returnstat PONTO_VIRGULA 
			| ifstat 
			| forstat 
			| ABRE_CHAVES statelist FECHA_CHAVES 
			| break PONTO_VIRGULA 
			| PONTO_VIRGULA ;

vardecl : tipo_ident intconstant_opcional_ou_mais ;

intconstant_opcional_ou_mais : ( ABRE_COLCHETES int_constant FECHA_COLCHETES intconstant_opcional_ou_mais )?;

atribstat : lvalue ATRIBUICAO expression_ou_allocexpression_ou_funccall ;

expression_ou_allocexpression_ou_funccall : expression | allocexpression | funccall ;

funccall : IDENT ABRE_PARENTESES paramlistcall FECHA_PARENTESES ;

paramlistcall : ( IDENT paramlistcall_opcional )?;

paramlistcall_opcional : ( VIRGULA paramlistcall )?;

printstat : PRINT expression ;

readstat : READ lvalue ;

returnstat : RETURN ;

ifstat : IF ABRE_PARENTESES expression FECHA_PARENTESES statement ( ELSE statement )? ;

forstat : FOR ABRE_PARENTESES atribstat PONTO_VIRGULA expression PONTO_VIRGULA atribstat FECHA_PARENTESES statement ;

statelist : statement statelist? ;

allocexpression : NEW tipo (ABRE_COLCHETES numexpression FECHA_COLCHETES )+;

expression : numexpression (operadores_comparacao numexpression)?  ;

operadores_comparacao : MAIOR 
					| MENOR 
					| MAIOR_IGUAL 
					| MENOR_IGUAL 
					| IGUAL 
					| DIFERENTE ;
numexpression : term (operadores_secundarios term)* ;

operadores_secundarios : MAIS | MENOS ;

term : unaryexpr (operadores_primarios unaryexpr)* ;

operadores_primarios :  MULTIPLICACAO | DIVISAO | PORCENTAGEM ;

unaryexpr : operadores_secundarios? factor ;

factor : INT_CONSTANT | FLOAT_CONSTANT | STRING_CONSTANT | NULL | lvalue | ABRE_PARENTESES numexpression FECHA_PARENTESES ;

lvalue : IDENT (ABRE_PARENTESES numexpression FECHA_PARENTESES)*;