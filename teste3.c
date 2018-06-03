#include <stdio.h>
#include <stdlib.h>


char *makeword(char* word, int c){
  char* str = malloc(1+strlen(word));
  strcpy(str, word);
  
  strcat(str, &c);
  return str;
}


int main(void)
{
  char* word = "aiiiiisim";
  printf(word);
  int c = 98;
  char b = (char)c + 1;
  printf("\n int %d", c);
  printf("\n char %c\n", c-1);
  printf("\n ooutrochar %c\n", b);
  char* alou = makeword(word, c);
  printf("%s\n", alou);
  alou = makeword(alou, 99);
  printf("%s\n", alou);
}
