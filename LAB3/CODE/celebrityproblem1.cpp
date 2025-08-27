#include <iostream>
#include <stack>
using namespace std;

int celebrityproblemfunction(int arr[2][2], int n) {
    stack<int> s;

    for(int i = 0; i < n; i++)
        s.push(i);

    while(s.size() > 1) {
        int a = s.top();
         s.pop();
        int b = s.top(); 
        s.pop();

        if(arr[a][b] == 1) 
            s.push(b);
        else               
            s.push(a);
    }

    int candidate = s.top();

    for(int i = 0; i < n; i++) {
        if(i != candidate && (arr[candidate][i] == 1 || arr[i][candidate] == 0))
            return -1; 
    }

    return candidate;
}

int main() {
    const int n = 2;
    int arr[n][n];

    cout << "Enter the 2x2 matrix:\n";
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            cin >> arr[i][j];

    int celeb = celebrityproblemfunction(arr, n);

    if(celeb == -1)
        cout << "No celebrity found\n";
    else
        cout << "Celebrity is person " << celeb << endl;

    return 0;
}
