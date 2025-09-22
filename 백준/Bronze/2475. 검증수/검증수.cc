#include <iostream>
using namespace std;

int main(){
    int a,b,c,d,e;
    int res;
    
    cin >>a>>b>>c>>d>>e;
    res = (a*a + b*b + c*c + d*d + e*e) % 10;
    
    cout << res;
}