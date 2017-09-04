/*
   CTCI - Ch.12 - 12.2 - Reverse String
*/

void reverse(char *str){
  char* end = str;
  char temp;
  if(str){
    while(*end) {
      ++end;
    }
    --end; //go back one because you don't want to end on null char

    //swap the chars from start of string to end of string until
    //reaching the middle
    while(str < end){
      temp = *str;
      *str++ = *end;
      *end-- = temp;
    }
  }
}
