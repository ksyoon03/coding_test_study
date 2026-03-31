#include <iostream>
using namespace std;

int main() {
	int n;
	int kim, lim;
	int cnt = 0;

	cin >> n >> kim >> lim;

	while (kim != lim) {
		kim = (kim + 1) / 2;
		lim = (lim + 1) / 2;
		cnt++;
	}

	cout << cnt << endl;
}