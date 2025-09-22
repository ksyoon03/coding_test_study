#include <iostream>
#include <stack>
#include <queue>
using namespace std;

int main() {
	int n;
	int cnt = 1;
	stack <int> s;
	queue <char> res;
	cin >> n;

	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;

		while (cnt <= x) {
			s.push(cnt);
			cnt++;
			res.push('+');
		}

		if (s.top() == x) {
			s.pop();
			res.push('-');
		}
		else {
			cout << "NO" << "\n";
			return 0;
		}
	}

	while (res.size() > 0) {
		cout << res.front() << "\n";
		res.pop();
	}
}