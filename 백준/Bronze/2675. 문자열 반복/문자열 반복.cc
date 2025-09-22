#include <iostream>
#include <vector>
using namespace std;

string repeat(int re, char words) {
	string res = "";
	for (int i = 0; i < re; i++) {
		res += words;
	}
	return res;
}

int main() {
	int n, re;
	string words;
	cin >> n;
	vector <string> res(n);

	for (int i = 0; i < n; i++) {
		cin >> re >> words;
		for (int j = 0; j < words.length(); j++) {
			res[i] += repeat(re, words[j]);
		}
		cout << res[i] << endl;
	}
}