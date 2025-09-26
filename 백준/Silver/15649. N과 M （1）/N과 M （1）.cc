#include <iostream>
using namespace std;

int n, m;
int arr[9];
bool check[9];

void backtrack(int x) {
    if (x > m) {
        for (int i = 1; i <= m; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
        return;
    }

    for (int i = 1; i <= n; i++) {
        if (!check[i]) {
            arr[x] = i;
            check[i] = true;
            backtrack(x + 1);
            check[i] = false;
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> m;
    backtrack(1);
}