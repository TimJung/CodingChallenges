/*
   CTCI - Ch.12 - 12.1 - Last K Lines
*/

void printLastKLines(char* fileName, int lines){
  const int K = lines;
  ifstream file (fileName);
  string L[K];
  int size = 0;

  //read the file line by line into the circular array
  //peek() so an EOF following a line ending is not considered a sep line
  while (file.peek() != file.EOF()){
    getline(file, L[size % K]);
    size++;
  }

  //compute size of circular array and the size
  int start = size > L ? (size % K) : 0;
  int count = min(K, size);

  //print elements in the order they were read
  for(int i = 0; i < count; i++){
    cout << L[(start + i) % K] << endl;
  }
}
