#include <iostream>
#include <vector>
using namespace std;

int main() {
	int n;
	cin >> n;

	vector <int> v(n + 1);
	v[0] = 0;
	for (int i = 1; i <= n; i++) {
		v[i] = i;
		for (int j = 1; j * j <= i; j++) {
			if (v[i] > v[i - j * j] + 1) {
				v[i] = v[i - j * j] + 1;
			}
		}
	}
	cout << v[n] << endl;
}