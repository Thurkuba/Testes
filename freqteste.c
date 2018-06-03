#include "stable.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int cmpfunc(const void *a, const void *b) 
{ 
    const char **ia = (const char **)a;
    const char **ib = (const char **)b;
    return strcmp(*ia, *ib);
}



char *makeword(char* word, int c){
  char* str = malloc(1+strlen(word));
  strcpy(str, word);
  
  strcat(str, &c);
  return str;
}

void numspaces (int count) {
  for(int j = 0; j < count; j++){
    printf(" ");
    }
}

int main(int numargs, char *arg[]) {

  
  FILE *entrada;
  int tam_maior_palavra = 0;
  const char *arq = arg[1];
  entrada = fopen(arq, "r");
  int c;
  char* palavra;
  palavra = malloc(200);
  char** lista = malloc(sizeof(entrada));
  int i = 0;
  SymbolTable st = stable_create(sizeof(SymbolTable));
  InsertionResult ir;

   

  printf("aaa %d", sizeof());

  
}
