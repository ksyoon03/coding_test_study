#include <iostream>
#include <vector>
#include <queue>
#include <functional>
using namespace std;

int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	priority_queue <int, vector<int>, greater<int>> plus;
	priority_queue <int> minus;
	cin >> n;

	while (n-- > 0) {
		int x;
		cin >> x;

		if (x == 0) {
			if (plus.empty() && minus.empty()) {
				cout << 0 << '\n';
			}
			else if (plus.empty() && !minus.empty()) {
				cout << minus.top() << '\n';
				minus.pop();
			}
			else if (!plus.empty() && minus.empty()) {
				cout << plus.top() << '\n';
				plus.pop();
			}
			else {
				if (plus.top() >= abs(minus.top())) {
					cout << minus.top() << '\n';
					minus.pop();
				}
				else if (plus.top() < abs(minus.top())) {
					cout << plus.top() << '\n';
					plus.pop();
				}
			}
		}

		else {
			if (x > 0) {
				plus.push(x);
			}
			else if (x < 0) {
				minus.push(x);
			}
		}
	}
}