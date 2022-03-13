lexer grammar Lexica;

DEF : 'def' ;

ABRE_PARENTESES : '(' ;

FECHA_PARENTESES : ')' ;

ABRE_CHAVES : '{' ;

FECHA_CHAVES : '}' ;

ABRE_COLCHETES : '[' ;

FECHA_COLCHETES : ']' ;

INT : 'int' ;

FLOAT :  'float' ;

STRING : 'string' ;

BREAK : 'break' ;

VIRGULA : ',' ;

PONTO_VIRGULA : ';' ;

PRINT  : 'print ' ;

READ : 'read' ;

RETURN : 'return' ;

IF : 'if' ;

ELSE : 'else' ;

FOR : 'for' ;

NEW : 'new' ;

MENOR : '<' ;

MAIOR : '>' ;

MAIOR_IGUAL : '<=' ;

MENOR_IGUAL : '>=' ;

ATRIBUICAO : '=' ;

IGUAL : '==' ;

DIFERENTE : '!=' ;

MAIS: '+' ;

MENOS : '-' ;

MULTIPLICACAO : '*' ;

DIVISAO  : '/' ;

PORCENTAGEM : '%' ;

IDENT : ('a'..'z' | 'A'..'Z')+ ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;

INT_CONSTANT : '0'..'9'+ ;

FLOAT_CONSTANT : '0'..'9'+ '.' '0'..'9'+ ;

TABULACAO : ' ' | '\t' | '\n' | '\r' ;

STRING_CONSTANT : '"' ~('\n' | '\r')* '"' ;

NULL : 'null' ;
