#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include "stable.h"

#define M 31
#define amax 10
//#define data (insResu->data)

/*
typedef union {
  int i;
  char *str;
  void *p;
} EntryData;

// Return struct for stable_insert.
typedef struct {
  int new;  // Was a new entry created?
  EntryData *data;  // Data associated with entry.
} InsertionResult;
*/
typedef struct reg celula;
struct reg {
  const char *key;
  EntryData *data;
  celula *prox;
  int i;
  int n;
};

struct stable_s{
	int n;
	int m;
  celula *celulas;
  //double a = m/n
};

SymbolTable stable_create(){
  SymbolTable st = malloc(sizeof(SymbolTable));
  st->m = M;
  st->celulas = malloc(sizeof(celula)*st->m);
  st->n = 0;
  return st;
}

celula *getCelula(SymbolTable table, int i) {
  if (i > M-1) return NULL;
  celula *p;
  p = table->celulas;
  return p + i*(sizeof(celula)); //TALVEZ ESTEJA ERRADO SIZEOF(CELULA) CHANCE DE ESTAR CERTO MEDIA = 3 DESVIO PADRAO = 1
}

/*
  Destroy a given symbol table.
*/
void stable_destroy(SymbolTable table){
  free(table);
}


int hash (const char *s, int m) {
   unsigned h = 0;
   for (int i = 0; s[i] != '\0'; i++) 
      h = (h * 256 + s[i]) % m;
   return h;
}

/*
  Insert a new entry on the symbol table given its key.

  If there is already an entry with the given key, then a struct
  InsertionResult is returned with new == 0 and data pointing to the
  data associated with the entry. Otherwise, a struct is returned with
  new != 0 and data pointing to the data field of the new entry.

  If there is not enough space on the table, or if there is a memory
  allocation error, then crashes with an error message.
*/

InsertionResult stable_insert(SymbolTable table, const char *key){
    InsertionResult *ir = malloc(sizeof(InsertionResult));
    printf("talocomermao");
 
    if(key == NULL){
      ir->new = -1; //key eh null
      return *ir;
    }
    int h = hash(key, M);
    celula *cel = getCelula(table, h); //Acesso à célula da table, já no índice correto.
    celula *celanterior = malloc(sizeof(celula));
    printf("AOOWFJOI\n");
    
    while(cel->prox != NULL){
      printf("entrounowhile");
      celanterior = cel;
      cel = cel->prox;
      
      if(strcmp(cel->key, key)){
	printf("entrounoif");
	ir->new = 0;
	ir->data = cel->data;
	return *ir;
      }
    }
    
      ir->new = 1; //key adicionada agora
      ir->data = malloc(sizeof(EntryData));
      //  ir->data->i = 2;
      celula *c = malloc(sizeof(celula));
      c->key = key;
      cel->prox = c;
      table->n++;
      return *ir;
    

    /*
      if(2>0){
	printf(cel->key);
	printf(key);
      }
      printf("teste");
	ir->new = 0; //key ja esta presente
        ir->data = cel->data;
        return *ir;
	//}
      celanterior = cel;
      cel = cel->prox;
      }*/
}

/*
  Find the data associated with a given key.

  Given a key, returns a pointer to the data associated with it, or a
  NULL pointer if the key is not found.
*/
/*EntryData *stable_find(SymbolTable table, const char *key){

}


  Visit each entry on the table.

  The visit function is called on each entry, with pointers to its key
  and data. If the visit function returns zero, then the iteration
  stops.

  Returns zero if the iteration was stopped by the visit function,
  nonzero otherwise.

int stable_visit(SymbolTable table, int (*visit)(const char *key, EntryData *data)){

}*/

int main(){
  

	SymbolTable st = stable_create();
  /*
  for (int i = 0; i < st->m; i++) {
    celula *c = getCelula(st, i);
    c->i = i;
  }
  celula *c = getCelula(st, 10);
  for (int i = 0; i < st->m; i++) {
    celula *c = getCelula(st, i);
    printf("%d\n", c->i);
  }*/
  
  const char *c2;
  c2 = "cama";
  InsertionResult ir2 = stable_insert(st,c2);
  printf("%d %d\n", ir2.new, ir2.data->i);
  const char *c3;
  c3 = "qqercoisa";
  InsertionResult ir3 = stable_insert(st, c3);
  printf("%d &d\n", ir3.new, ir3.data->i);
    InsertionResult ir4 = stable_insert(st, c2);
    //    printf(ir4.new);
}
