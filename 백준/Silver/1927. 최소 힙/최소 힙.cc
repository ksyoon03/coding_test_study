#include <iostream>
#include <queue>
#include <vector>
#include <functional>
using namespace std;

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(NULL);
	std::cout.tie(NULL);

	int n;
	priority_queue <int, vector <int>, greater <int>> q;
	cin >> n;

	while (n--) {
		int x;
		cin >> x;

		if (x == 0) {
			if (q.empty()) {
				cout << 0 << '\n';
				continue;
			}
			else {
				cout << q.top() << '\n';
				q.pop();
			}
		}
		else {
			q.push(x);
		}
	}
}