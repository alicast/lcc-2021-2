grammar Sintatica;

import Lexica;

program : functionList ;

functionList : functionDefinition functionList? ;
 
functionDefinition : DEF IDENT ABRE_PARENTESES parameterList? FECHA_PARENTESES ABRE_CHAVES statementList FECHA_CHAVES ;

parameterList : (INT | FLOAT | STRING) IDENT (VIRGULA parameterList)? ;

statementList : statement statementList? ;

statement
	: variableDeclaration PONTO_VIRGULA
	| attributionStatement PONTO_VIRGULA
	| BREAK PONTO_VIRGULA
	| PONTO_VIRGULA
	; 

variableDeclaration : (INT | FLOAT | STRING) IDENT arrayDefinitionList? ;

arrayDefinitionList : arrayDefinition arrayDefinitionList? ;

arrayDefinition : (ABRE_COLCHETES INT_CONSTANT FECHA_COLCHETES) ;

attributionStatement : IDENT arrayReferenceList? ATRIBUICAO factor;

arrayReferenceList : arrayReference arrayReferenceList? ;

arrayReference : (ABRE_COLCHETES INT_CONSTANT FECHA_COLCHETES) ;

factor : INT_CONSTANT | FLOAT_CONSTANT | STRING_CONSTANT | NULL ;
