#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int n, input;
	cin >> n;
	vector <int> array;
	vector<pair<int, int>> index;
	for (int i = 0; i < n; i++) {
		cin >> input;
		array.push_back(input);
		index.emplace_back(array[i], i);
	}
	sort(index.begin(), index.end());
	vector <int> result(array.size());
	for (int i = 0; i < n; i++) {
		int idx = index[i].second;
		result[idx] = i;
	}
	for (int idx : result) {
		cout << idx << " ";
	} cout << endl;
}