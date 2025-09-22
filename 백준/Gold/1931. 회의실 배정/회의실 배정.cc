#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n;
vector <pair<int, int>> v;

int main() {
	cin >> n;
	for (int i = 0; i < n; i++) {
		int b, e;
		cin >> b >> e;
		v.push_back({ e, b });
	}
	sort(v.begin(), v.end());

	int time = v[0].first;
	int cnt = 1;
	for (int i = 1; i < n; i++) {
		if (time <= v[i].second) {
			cnt++;
			time = v[i].first;
		}
	}
	cout << cnt << endl;
}